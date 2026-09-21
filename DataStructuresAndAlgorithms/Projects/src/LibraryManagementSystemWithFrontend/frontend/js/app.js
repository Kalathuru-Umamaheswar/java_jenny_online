/* =========================================================
   Jenny's Library — front end
   Runs entirely in the browser: sql.js compiles SQLite to
   WebAssembly, so there is no server and no install step.
   Business rules are ported 1:1 from the Java model:
     - User.maxBorrowLimit = 1  -> a member may hold 1 item
     - Student.borrow() only allows Book, not Magazine
   ========================================================= */

let db = null;

/* ---------------------------------------------------------
   SQLite-flavoured schema (functionally equivalent to
   sql/schema.sql, adapted from MySQL syntax to SQLite syntax
   so it can run inside the browser with no server).
   --------------------------------------------------------- */
const SQLITE_SCHEMA = `
CREATE TABLE authors (
    author_id INTEGER PRIMARY KEY AUTOINCREMENT,
    author_name TEXT NOT NULL,
    biography TEXT,
    no_of_books_published INTEGER DEFAULT 0
);

CREATE TABLE library_items (
    item_id TEXT PRIMARY KEY,
    title TEXT NOT NULL,
    item_type TEXT NOT NULL CHECK (item_type IN ('BOOK','MAGAZINE')),
    is_available INTEGER NOT NULL DEFAULT 1
);

CREATE TABLE books (
    item_id TEXT PRIMARY KEY REFERENCES library_items(item_id) ON DELETE CASCADE,
    author_id INTEGER NOT NULL REFERENCES authors(author_id)
);

CREATE TABLE magazines (
    item_id TEXT PRIMARY KEY REFERENCES library_items(item_id) ON DELETE CASCADE,
    issue_number INTEGER NOT NULL
);

CREATE TABLE users (
    user_id TEXT PRIMARY KEY,
    name TEXT NOT NULL,
    user_type TEXT NOT NULL CHECK (user_type IN ('STUDENT','PROFESSOR')),
    max_borrow_limit INTEGER NOT NULL DEFAULT 1
);

CREATE TABLE borrow_records (
    record_id INTEGER PRIMARY KEY AUTOINCREMENT,
    user_id TEXT NOT NULL REFERENCES users(user_id),
    item_id TEXT NOT NULL REFERENCES library_items(item_id),
    borrow_date TEXT NOT NULL,
    return_date TEXT
);
`;

/* Seed data — matches the sample objects created in Main.java */
const SEED_SQL = `
INSERT INTO authors (author_name, biography, no_of_books_published)
  VALUES ('Kathy Sierra', 'Kathy Sierra is author of the series', 3);

INSERT INTO library_items (item_id, title, item_type, is_available)
  VALUES ('Java001', 'Head First Java', 'BOOK', 1);

INSERT INTO books (item_id, author_id)
  VALUES ('Java001', (SELECT author_id FROM authors WHERE author_name = 'Kathy Sierra'));

INSERT INTO users (user_id, name, user_type, max_borrow_limit) VALUES
  ('235g5rf', 'Payal', 'STUDENT', 1),
  ('EMP001',  'Jenny', 'PROFESSOR', 1);
`;

/* ---------------------------------------------------------
   Boot sql.js + create the schema
   --------------------------------------------------------- */
async function boot() {
  try {
    const SQL = await initSqlJs({
      locateFile: file => `https://cdn.jsdelivr.net/npm/sql.js@1.10.3/dist/${file}`
    });
    db = new SQL.Database();
    db.run(SQLITE_SCHEMA);
    db.run(SEED_SQL);

    document.getElementById('dbDot').classList.add('ready');
    document.getElementById('dbStatusText').textContent = 'SQLite ready (in-browser)';

    refreshAll();
  } catch (err) {
    document.getElementById('dbStatusText').textContent = 'Failed to load SQL engine — check your connection';
    console.error(err);
  }
}

/* ---------------------------------------------------------
   Small helpers
   --------------------------------------------------------- */
function q(sql, params = []) {
  const stmt = db.prepare(sql);
  stmt.bind(params);
  const rows = [];
  while (stmt.step()) rows.push(stmt.getAsObject());
  stmt.free();
  return rows;
}
function run(sql, params = []) {
  db.run(sql, params);
}
function nowIso() {
  return new Date().toISOString().slice(0, 19).replace('T', ' ');
}
function escapeHtml(str) {
  return String(str).replace(/[&<>"']/g, c => ({ '&':'&amp;','<':'&lt;','>':'&gt;','"':'&quot;',"'":'&#39;' }[c]));
}

/* ---------------------------------------------------------
   Rendering
   --------------------------------------------------------- */
function refreshAll() {
  renderCatalog();
  renderPeopleTable();
  renderLedger();
  fillUserSelects();
  fillItemSelect();
}

function currentHolderMap() {
  const rows = q(`
    SELECT br.item_id, u.name AS holder
    FROM borrow_records br
    JOIN users u ON u.user_id = br.user_id
    WHERE br.return_date IS NULL
  `);
  const map = {};
  rows.forEach(r => map[r.item_id] = r.holder);
  return map;
}

function renderCatalog(filter = '') {
  const items = q(`
    SELECT li.item_id, li.title, li.item_type, li.is_available,
           b.author_id, a.author_name,
           m.issue_number
    FROM library_items li
    LEFT JOIN books b ON b.item_id = li.item_id
    LEFT JOIN authors a ON a.author_id = b.author_id
    LEFT JOIN magazines m ON m.item_id = li.item_id
    ORDER BY li.title
  `);
  const holders = currentHolderMap();
  const grid = document.getElementById('catalogGrid');
  const f = filter.trim().toLowerCase();

  const filtered = items.filter(it => {
    if (!f) return true;
    return [it.item_id, it.title, it.author_name].some(v => v && String(v).toLowerCase().includes(f));
  });

  if (filtered.length === 0) {
    grid.innerHTML = `<p style="color:var(--ink-soft)">No items match "${escapeHtml(filter)}".</p>`;
    return;
  }

  grid.innerHTML = filtered.map(it => {
    const available = !!it.is_available;
    const sub = it.item_type === 'BOOK'
      ? `by ${escapeHtml(it.author_name || 'Unknown')}`
      : `Issue #${it.issue_number}`;
    const holder = holders[it.item_id];
    return `
      <div class="catalog-card">
        <span class="stamp ${available ? 'available' : 'loaned'}">${available ? 'Available' : 'On loan'}</span>
        <span class="tag-type">${it.item_type}</span>
        <div class="callno">#${escapeHtml(it.item_id)}</div>
        <h3>${escapeHtml(it.title)}</h3>
        <p class="meta">${sub}${holder ? `<br>Held by ${escapeHtml(holder)}` : ''}</p>
      </div>
    `;
  }).join('');
}

function renderPeopleTable() {
  const users = q(`SELECT * FROM users ORDER BY name`);
  const holders = q(`
    SELECT br.user_id, li.title
    FROM borrow_records br
    JOIN library_items li ON li.item_id = br.item_id
    WHERE br.return_date IS NULL
  `);
  const holdMap = {};
  holders.forEach(h => holdMap[h.user_id] = h.title);

  const tbody = document.querySelector('#peopleTable tbody');
  tbody.innerHTML = users.map(u => `
    <tr>
      <td class="mono-cell" style="font-family:var(--mono)">${escapeHtml(u.user_id)}</td>
      <td>${escapeHtml(u.name)}</td>
      <td>${u.user_type === 'STUDENT' ? 'Student' : 'Professor'}</td>
      <td>${holdMap[u.user_id] ? escapeHtml(holdMap[u.user_id]) : '<span style="color:var(--ink-soft)">— nothing checked out —</span>'}</td>
    </tr>
  `).join('');
}

function renderLedger() {
  const rows = q(`
    SELECT br.record_id, u.name AS member, li.title AS item, br.borrow_date, br.return_date
    FROM borrow_records br
    JOIN users u ON u.user_id = br.user_id
    JOIN library_items li ON li.item_id = br.item_id
    ORDER BY br.record_id DESC
  `);
  const tbody = document.querySelector('#ledgerTable tbody');
  tbody.innerHTML = rows.map(r => `
    <tr>
      <td>${r.record_id}</td>
      <td>${escapeHtml(r.member)}</td>
      <td>${escapeHtml(r.item)}</td>
      <td>${escapeHtml(r.borrow_date)}</td>
      <td>${r.return_date ? escapeHtml(r.return_date) : '<span style="color:var(--rust)">still out</span>'}</td>
    </tr>
  `).join('');
}

function fillUserSelects() {
  const users = q(`SELECT user_id, name, user_type FROM users ORDER BY name`);
  const opts = users.map(u => `<option value="${escapeHtml(u.user_id)}">${escapeHtml(u.name)} (${u.user_type === 'STUDENT' ? 'Student' : 'Professor'})</option>`).join('');
  document.getElementById('borrowUserSelect').innerHTML = opts;
  document.getElementById('returnUserSelect').innerHTML = opts;
}

function fillItemSelect() {
  const items = q(`SELECT item_id, title, item_type FROM library_items WHERE is_available = 1 ORDER BY title`);
  document.getElementById('borrowItemSelect').innerHTML = items
    .map(it => `<option value="${escapeHtml(it.item_id)}">${escapeHtml(it.title)} — ${it.item_type}</option>`)
    .join('') || `<option disabled selected>Nothing available right now</option>`;
}

/* ---------------------------------------------------------
   Tabs
   --------------------------------------------------------- */
document.getElementById('tabs').addEventListener('click', e => {
  const btn = e.target.closest('.tab');
  if (!btn) return;
  document.querySelectorAll('.tab').forEach(t => t.classList.remove('active'));
  document.querySelectorAll('.panel').forEach(p => p.classList.remove('active'));
  btn.classList.add('active');
  document.getElementById(`panel-${btn.dataset.tab}`).classList.add('active');
});

document.querySelectorAll('.mini-tab').forEach(btn => {
  btn.addEventListener('click', () => {
    document.querySelectorAll('.mini-tab').forEach(b => b.classList.remove('active'));
    btn.classList.add('active');
    const isBook = btn.dataset.add === 'book';
    document.getElementById('addBookForm').classList.toggle('hidden', !isBook);
    document.getElementById('addMagazineForm').classList.toggle('hidden', isBook);
  });
});

/* ---------------------------------------------------------
   Catalog search
   --------------------------------------------------------- */
document.getElementById('catalogSearch').addEventListener('input', e => {
  renderCatalog(e.target.value);
});

/* ---------------------------------------------------------
   Add book
   --------------------------------------------------------- */
document.getElementById('addBookForm').addEventListener('submit', e => {
  e.preventDefault();
  const f = new FormData(e.target);
  const itemId = f.get('itemId').trim();
  const title = f.get('title').trim();
  const authorName = f.get('authorName').trim();
  const authorBio = f.get('authorBio').trim();
  const authorBooks = parseInt(f.get('authorBooks') || '0', 10);

  if (q(`SELECT 1 FROM library_items WHERE item_id = ?`, [itemId]).length) {
    alert(`Call number "${itemId}" is already in the catalog.`);
    return;
  }

  run(`INSERT INTO authors (author_name, biography, no_of_books_published) VALUES (?, ?, ?)`,
      [authorName, authorBio, authorBooks]);
  const authorId = q(`SELECT last_insert_rowid() AS id`)[0].id;

  run(`INSERT INTO library_items (item_id, title, item_type, is_available) VALUES (?, ?, 'BOOK', 1)`, [itemId, title]);
  run(`INSERT INTO books (item_id, author_id) VALUES (?, ?)`, [itemId, authorId]);

  e.target.reset();
  refreshAll();
});

/* ---------------------------------------------------------
   Add magazine
   --------------------------------------------------------- */
document.getElementById('addMagazineForm').addEventListener('submit', e => {
  e.preventDefault();
  const f = new FormData(e.target);
  const itemId = f.get('itemId').trim();
  const title = f.get('title').trim();
  const issueNumber = parseInt(f.get('issueNumber'), 10);

  if (q(`SELECT 1 FROM library_items WHERE item_id = ?`, [itemId]).length) {
    alert(`Call number "${itemId}" is already in the catalog.`);
    return;
  }

  run(`INSERT INTO library_items (item_id, title, item_type, is_available) VALUES (?, ?, 'MAGAZINE', 1)`, [itemId, title]);
  run(`INSERT INTO magazines (item_id, issue_number) VALUES (?, ?)`, [itemId, issueNumber]);

  e.target.reset();
  refreshAll();
});

/* ---------------------------------------------------------
   Add member
   --------------------------------------------------------- */
document.getElementById('addUserForm').addEventListener('submit', e => {
  e.preventDefault();
  const f = new FormData(e.target);
  const userId = f.get('userId').trim();
  const name = f.get('name').trim();
  const userType = f.get('userType');

  if (q(`SELECT 1 FROM users WHERE user_id = ?`, [userId]).length) {
    alert(`Member ID "${userId}" is already issued.`);
    return;
  }
  run(`INSERT INTO users (user_id, name, user_type, max_borrow_limit) VALUES (?, ?, ?, 1)`, [userId, name, userType]);
  e.target.reset();
  refreshAll();
});

/* ---------------------------------------------------------
   Borrow  — mirrors User.borrow() / Student.borrow()
   --------------------------------------------------------- */
document.getElementById('borrowForm').addEventListener('submit', e => {
  e.preventDefault();
  const f = new FormData(e.target);
  const userId = f.get('userId');
  const itemId = f.get('itemId');
  const msg = document.getElementById('borrowMsg');
  msg.className = 'form-msg';

  if (!userId || !itemId) { msg.textContent = 'Choose a member and an item.'; msg.classList.add('err'); return; }

  const user = q(`SELECT * FROM users WHERE user_id = ?`, [userId])[0];
  const item = q(`SELECT * FROM library_items WHERE item_id = ?`, [itemId])[0];

  const activeLoans = q(`SELECT COUNT(*) AS c FROM borrow_records WHERE user_id = ? AND return_date IS NULL`, [userId])[0].c;
  if (activeLoans >= user.max_borrow_limit) {
    msg.textContent = `${user.name} has already borrowed an item. Return it first.`;
    msg.classList.add('err');
    return;
  }
  if (user.user_type === 'STUDENT' && item.item_type !== 'BOOK') {
    msg.textContent = `Students can only borrow books.`;
    msg.classList.add('err');
    return;
  }
  if (!item.is_available) {
    msg.textContent = `"${item.title}" is not available.`;
    msg.classList.add('err');
    return;
  }

  run(`INSERT INTO borrow_records (user_id, item_id, borrow_date) VALUES (?, ?, ?)`, [userId, itemId, nowIso()]);
  run(`UPDATE library_items SET is_available = 0 WHERE item_id = ?`, [itemId]);

  msg.textContent = `"${item.title}" borrowed successfully.`;
  msg.classList.add('ok');
  refreshAll();
});

/* ---------------------------------------------------------
   Return — mirrors User.returnItem()
   --------------------------------------------------------- */
document.getElementById('returnForm').addEventListener('submit', e => {
  e.preventDefault();
  const f = new FormData(e.target);
  const userId = f.get('userId');
  const msg = document.getElementById('returnMsg');
  msg.className = 'form-msg';

  const record = q(`
    SELECT br.record_id, li.item_id, li.title
    FROM borrow_records br
    JOIN library_items li ON li.item_id = br.item_id
    WHERE br.user_id = ? AND br.return_date IS NULL
    ORDER BY br.record_id DESC LIMIT 1
  `, [userId])[0];

  if (!record) {
    msg.textContent = `This member has no borrowed item.`;
    msg.classList.add('err');
    return;
  }

  run(`UPDATE borrow_records SET return_date = ? WHERE record_id = ?`, [nowIso(), record.record_id]);
  run(`UPDATE library_items SET is_available = 1 WHERE item_id = ?`, [record.item_id]);

  msg.textContent = `"${record.title}" returned successfully.`;
  msg.classList.add('ok');
  refreshAll();
});

/* ---------------------------------------------------------
   Schema viewer — load the real MySQL schema.sql for display
   --------------------------------------------------------- */
fetch('sql/schema.sql')
  .then(r => { if (!r.ok) throw new Error('not found'); return r.text(); })
  .then(text => { document.getElementById('schemaBox').textContent = text; })
  .catch(() => {
    document.getElementById('schemaBox').textContent =
      'Could not fetch sql/schema.sql (this happens if you open index.html directly ' +
      'from disk). Serve the frontend/ folder with a local server, e.g.:\n\n' +
      '  python -m http.server 8000\n\n' +
      'then open http://localhost:8000 — or just open sql/schema.sql directly in your editor/GitHub.';
  });

boot();
