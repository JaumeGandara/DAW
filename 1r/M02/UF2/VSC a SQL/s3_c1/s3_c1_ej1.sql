CREATE DATABASE s3_c1_ej1 DEFAULT CHARACTER SET 'latin1' DEFAULT COLLATE 'latin1_bin';

USE s3_c1_ej1;

CREATE TABLE Temporada (
    id_temporada INT AUTO_INCREMENT,
    fecha_inicio DATETIME,
    fecha_fin DATETIME,
    PRIMARY KEY (id_temporada)
);

CREATE TABLE Federacion (
    nombre_federacion VARCHAR(50),
    fecha_creacion DATETIME,
    responsable VARCHAR(50),
    PRIMARY KEY (nombre_federacion)
);

CREATE TABLE Competicion (
    nombre_competicion VARCHAR(50),
    nombre_TV VARCHAR (50),
    PRIMARY KEY (nombre_competicion)
);

CREATE TABLE Equipo (
    nombre_equipo VARCHAR(50) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    presidente VARCHAR(50) NOT NULL,
    nombre_federacion VARCHAR(50) NOT NULL,
    PRIMARY KEY (nombre_equipo),
    FOREIGN KEY(nombre_equipo) REFERENCES Federacion(nombre_federacion) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Clasificacion (
    id_temporada INT AUTO_INCREMENT,
    nombre_competicion VARCHAR(50),
    nombre_equipo VARCHAR(50),
    posicion INT,
    PRIMARY KEY(id_temporada, nombre_competicion, nombre_equipo),
    FOREIGN KEY(id_temporada) REFERENCES Temporada(id_temporada) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY(nombre_competicion) REFERENCES Competicion(nombre_competicion) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY(nombre_equipo) REFERENCES Equipo(nombre_equipo) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO Temporada VALUES (NULL, '500-03-06', '799-12-20');

INSERT INTO Federacion VALUES ('fck', '2000-05-02', 'Paco');
INSERT INTO Federacion VALUES ('fcb', '1978-03-27', 'Albert');

INSERT INTO Competicion VALUES ('ifk', 'bdn');
INSERT INTO Competicion VALUES ('gjf', 'sss'), ('tgf', 'adt');

INSERT INTO Clasificacion VALUES ('', 'pepevspepe', 'pepe', );