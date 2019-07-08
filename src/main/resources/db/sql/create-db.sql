DROP TABLE Spitter IF EXISTS;
DROP TABLE Spittle IF EXISTS;

CREATE TABLE Spitter (
  id INTEGER PRIMARY KEY,
  username VARCHAR(30),
  password VARCHAR(30),
  firstName VARCHAR(30),
  lastName VARCHAR(30),
  email  VARCHAR(50)
);

CREATE TABLE Spittle (
  id INTEGER PRIMARY KEY,
  message VARCHAR(30),
  time DATE,
  latitude DOUBLE,
  longitude DOUBLE,
);