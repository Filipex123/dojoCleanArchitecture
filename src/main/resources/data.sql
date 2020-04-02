DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
  id LONG AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  age VARCHAR(2) NOT NULL,
  vacation VARCHAR(10) DEFAULT NULL
);

INSERT INTO Employee (name, age, vacation) VALUES
  ('Bruna', '21', '2020-05-03'),
  ('Filipe', '20', '2020-08-07'),
  ('Maicon', '40', '2020-04-23');
