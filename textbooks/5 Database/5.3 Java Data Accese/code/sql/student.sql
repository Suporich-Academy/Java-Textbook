DROP TABLE IF EXISTS student;
CREATE TABLE student (
   id       INT           PRIMARY KEY,
   name     VARCHAR(255)  NOT NULL,
   age      INT           NOT NULL,
   subject  VARCHAR(50)   NOT NULL,
   gender   VARCHAR(10)   NOT NULL
);
