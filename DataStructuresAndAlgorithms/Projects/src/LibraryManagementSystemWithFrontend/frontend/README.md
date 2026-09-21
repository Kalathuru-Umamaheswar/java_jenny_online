# Front End — Jenny's Library

This folder is a **new addition** sitting next to `src/`. Nothing in `src/com/jennyslectures` was changed.

It gives the project a browser-based catalog + circulation-desk UI, backed by real SQL, so the
repo isn't "just a console app" on your resume/GitHub.

## What it is

- **`index.html` / `css/style.css` / `js/app.js`** — a single-page app (no framework, no build step).
- **`sql/schema.sql`** — the "real" schema, written for **MySQL**. This is the file to point at when
  you talk about the SQL/data-modeling side of the project in an interview.
- The live page you open in a browser runs an **equivalent schema in SQLite**, compiled to
  WebAssembly via [sql.js](https://sql.js.org/). That's what lets the whole demo run with
  **zero setup** — no server, no MySQL install, works straight from GitHub Pages or a `file://` open.

## How it maps to your Java classes

| Java class | SQL table |
|---|---|
| `LibraryItem` (abstract) | `library_items` |
| `Book extends LibraryItem` | `books` (1-1 with `library_items`, FK to `authors`) |
| `Magazine extends LibraryItem` | `magazines` (1-1 with `library_items`) |
| `Author` | `authors` |
| `User` (abstract) | `users` (`user_type` distinguishes Student/Professor) |
| `Student extends User` | `users` where `user_type = 'STUDENT'` |
| `Professor extends User` | `users` where `user_type = 'PROFESSOR'` |
| `User.borrow()` / `returnItem()` | `borrow_records` (a row per loan; `return_date IS NULL` = still out) |

Business rules from the Java code are re-enforced in `js/app.js`:
- Each member can hold **one item at a time** (`max_borrow_limit`), same as `User.java`.
- A **Student can only borrow Books**, never Magazines — same as `Student.java`.

## Running it

Because it fetches `sql/schema.sql` (for the "SQL Schema" tab) and the sql.js WebAssembly file,
serve the folder over HTTP rather than double-clicking `index.html`:

```bash
cd frontend
python -m http.server 8000
# then open http://localhost:8000
```

It also works out of the box on **GitHub Pages** — just point Pages at this `frontend/` folder
(or the repo root, if you move these files up).

## Wiring it to a real MySQL backend later

Right now everything runs client-side against an in-memory SQLite DB (it resets on refresh —
that's intentional, it's a demo, not persistent storage). If you later want it backed by real
MySQL:

1. Stand up a small REST API (Spring Boot, Express, Flask — your choice) that runs the queries
   in `sql/schema.sql` against MySQL.
2. Replace the `q()` / `run()` calls in `js/app.js` with `fetch()` calls to that API.
3. Everything else (the UI, the forms, the business-rule checks) stays the same.
