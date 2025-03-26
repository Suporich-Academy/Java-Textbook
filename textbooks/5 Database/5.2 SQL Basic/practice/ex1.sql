-- テーブルを作る
CREATE TABLE student (
   id       INT           PRIMARY KEY,
   name     VARCHAR(255)  NOT NULL,
   age      INT           NOT NULL,
   subject  VARCHAR(50)   NOT NULL,
   gender   VARCHAR(10)   NOT NULL
);

CREATE TABLE subject (
   name     VARCHAR(50)   PRIMARY KEY,
   teacher  VARCHAR(255)  NOT NULL,
   hour     INT           NOT NULL,
   fee      MONEY         NOT NULL
);
