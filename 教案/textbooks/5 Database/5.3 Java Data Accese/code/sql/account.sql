DROP TABLE IF EXISTS account;
CREATE TABLE account (
  username VARCHAR(255) PRIMARY KEY,
  password VARCHAR(255) NOT NULL
);

INSERT INTO account VALUES
('Alice', 'alice1999'),
('Bob', 'qwerty765'),
('Charlie', '1f0F4_tWqd_qAA8');
