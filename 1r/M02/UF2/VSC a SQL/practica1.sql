CREATE DATABASE classes;

USE classes;

CREATE TABLE alumne (
    id_alumne INT,
    nom VARCHAR(50),
    cognom VARCHAR(50),
    cognom2 VARCHAR(50),
    data_naixement DATE,
    PRIMARY KEY(id_alumne)
);

CREATE TABLE notes (
    id_nota INT,
    nota DECIMAL,
    assignatura VARCHAR(50),
    id_alumne INT,
    PRIMARY KEY(id_nota),
    FOREIGN KEY(id_alumne) REFERENCES alumne(id_alumne)
);