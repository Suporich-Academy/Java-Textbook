CREATE TABLE kakeibo (
    id SERIAL PRIMARY KEY,         -- 行ごとの一意なID（自動採番）
    date DATE NOT NULL,            -- 日付（必須）
    memo TEXT,                     -- メモ欄（自由記述）
    income INTEGER DEFAULT 0,      -- 入金額（デフォルトは0）
    expense INTEGER DEFAULT 0      -- 出金額（デフォルトは0）
);
-- 家計簿テーブルを作成。支出と収入を記録する


INSERT INTO kakeibo (date, memo, income, expense) VALUES
('2022-02-03', 'コーヒーを購入', 0, 380),
('2022-02-10', '1月の給料', 280000, 0),
('2022-02-11', '書籍を購入', 0, 2800),
('2022-02-14', '同期会の会費', 0, 5000),
('2022-02-18', '1月の電気代', 0, 7560),
('2022-02-25', '3月の家賃', 0, 90000);
-- 日付、メモ、入金額、出金額を登録する

