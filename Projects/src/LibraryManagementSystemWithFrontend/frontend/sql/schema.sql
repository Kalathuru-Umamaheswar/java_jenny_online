-- ============================================================
-- Library Management System - MySQL Schema
-- Mirrors the Java OOP model in src/com/jennyslectures/*
--   LibraryItem (abstract) -> Book, Magazine   => library_items + books + magazines
--   User (base)            -> Student, Professor => users
--   Author                                      => authors
--   User.borrow()/returnItem()                   => borrow_records
-- ============================================================

CREATE DATABASE IF NOT EXISTS library_management;
USE library_management;

-- ------------------------------------------------------------
-- Authors  (maps to Author.java)
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS authors (
    author_id            INT AUTO_INCREMENT PRIMARY KEY,
    author_name          VARCHAR(120) NOT NULL,
    biography            TEXT,
    no_of_books_published INT DEFAULT 0
);

-- ------------------------------------------------------------
-- Library Items (maps to abstract LibraryItem.java)
-- One row per item regardless of subtype; item_type says which
-- subtype table (books / magazines) holds the extra fields.
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS library_items (
    item_id       VARCHAR(30) PRIMARY KEY,
    title         VARCHAR(200) NOT NULL,
    item_type     ENUM('BOOK', 'MAGAZINE') NOT NULL,
    is_available  BOOLEAN NOT NULL DEFAULT TRUE
);

-- ------------------------------------------------------------
-- Books (maps to Book.java, extends LibraryItem)
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS books (
    item_id     VARCHAR(30) PRIMARY KEY,
    author_id   INT NOT NULL,
    FOREIGN KEY (item_id)   REFERENCES library_items(item_id) ON DELETE CASCADE,
    FOREIGN KEY (author_id) REFERENCES authors(author_id)
);

-- ------------------------------------------------------------
-- Magazines (maps to Magazine.java, extends LibraryItem)
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS magazines (
    item_id       VARCHAR(30) PRIMARY KEY,
    issue_number  INT NOT NULL,
    FOREIGN KEY (item_id) REFERENCES library_items(item_id) ON DELETE CASCADE
);

-- ------------------------------------------------------------
-- Users (maps to User.java, extended by Student.java / Professor.java)
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS users (
    user_id          VARCHAR(30) PRIMARY KEY,
    name             VARCHAR(120) NOT NULL,
    user_type        ENUM('STUDENT', 'PROFESSOR') NOT NULL,
    max_borrow_limit INT NOT NULL DEFAULT 1
);

-- ------------------------------------------------------------
-- Borrow Records (maps to User.borrow() / User.returnItem())
-- return_date IS NULL  ==  item currently on loan
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS borrow_records (
    record_id    INT AUTO_INCREMENT PRIMARY KEY,
    user_id      VARCHAR(30) NOT NULL,
    item_id      VARCHAR(30) NOT NULL,
    borrow_date  DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    return_date  DATETIME NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (item_id) REFERENCES library_items(item_id)
);

-- ------------------------------------------------------------
-- Seed data - matches the sample objects created in Main.java
-- ------------------------------------------------------------
INSERT INTO authors (author_name, biography, no_of_books_published) VALUES
('Kathy Sierra', 'Kathy Sierra is author of the series', 3);

INSERT INTO library_items (item_id, title, item_type, is_available) VALUES
('Java001', 'Head First Java', 'BOOK', TRUE);

INSERT INTO books (item_id, author_id) VALUES
('Java001', (SELECT author_id FROM authors WHERE author_name = 'Kathy Sierra' LIMIT 1));

INSERT INTO users (user_id, name, user_type, max_borrow_limit) VALUES
('235g5rf', 'Payal', 'STUDENT', 1),
('EMP001',  'Jenny', 'PROFESSOR', 1);

-- ------------------------------------------------------------
-- Handy queries used by the reporting screen in the app
-- ------------------------------------------------------------
-- Currently available items:
-- SELECT * FROM library_items WHERE is_available = TRUE;

-- Items currently on loan, with borrower name:
-- SELECT li.title, u.name, br.borrow_date
-- FROM borrow_records br
-- JOIN library_items li ON li.item_id = br.item_id
-- JOIN users u ON u.user_id = br.user_id
-- WHERE br.return_date IS NULL;
