CREATE DATABASE IF NOT EXISTS s3_c1_ej2;

USE s3_c1_ej2;

CREATE TABLE IF NOT EXISTS Persona (
    num_ss INT NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    apellido1 VARCHAR(20) NOT NULL,
    apellido2 VARCHAR(20) NOT NULL,
    PRIMARY KEY(num_ss)
)CHARACTER SET 'utf8' COLLATE 'utf8_spanish_ci';

CREATE TABLE IF NOT EXISTS Equipo (
    nombre VARCHAR(20),
    ano_fundacion DATE,
    presupuesto DECIMAL,
    presidente VARCHAR(20),
    entrenador VARCHAR(20),
    direccion VARCHAR(50),
    PRIMARY KEY(nombre)
);

CREATE TABLE IF NOT EXISTS Arbitro (
    num_ss_arbitro INT,
    num_colegiado INT,
    ano_inicio INT,
    profesion VARCHAR(20),
    PRIMARY KEY(num_ss_arbitro),
    FOREIGN KEY(num_ss_arbitro) REFERENCES Persona(num_ss) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Jugador (
    num_ss_jugador INT,
    dorsal INT,
    ubicacion VARCHAR(50),
    ficha DECIMAL,
    nombre_equipo VARCHAR(20),
    PRIMARY KEY(num_ss_jugador),
    FOREIGN KEY(num_ss_jugador) REFERENCES Persona(num_ss) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY(nombre_equipo) REFERENCES Equipo(nombre) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Partido (
    num_ss_arbitro INT,
    equipo_local VARCHAR(20),
    equipo_visitante VARCHAR(20),
    resultado INT,
    fecha DATE,
    PRIMARY KEY(num_ss_arbitro, equipo_local, equipo_visitante),
    FOREIGN KEY(num_ss_arbitro) REFERENCES Arbitro(num_ss_arbitro) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY(equipo_local) REFERENCES Equipo(nombre) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY(equipo_visitante) REFERENCES Equipo(nombre) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO Persona VALUES (1, 'Pepe', 'Rodriguez', 'Gonzalez');
INSERT INTO Persona VALUES (2, 'Pepa', 'Puig', 'Rodriguez');
INSERT INTO Persona VALUES (3, 'Jordi', 'Anguita', 'Gonzalez');
INSERT INTO Persona VALUES (4, 'Alex', 'Rodriguez', 'Gonzalez');
INSERT INTO Persona VALUES (5, 'Marc', 'Sanchez', 'Gonzalez');
INSERT INTO Persona VALUES (6, 'Ramón', 'Salazar', 'Gonzalez');
INSERT INTO Persona VALUES (7, 'Víctor', 'Caballer', 'Perez');
INSERT INTO Persona VALUES (8, 'Ricardo', 'Sagastizado', 'Milos');
INSERT INTO Persona VALUES (9, 'Charlie', 'Quimviuco', 'Caballer');
INSERT INTO Persona VALUES (10, 'Pere', 'Hidalgo', 'Morales');

INSERT INTO Arbitro VALUES (8, 370, '2010-05-21', 'fontanero');
INSERT INTO Arbitro VALUES (9, 370, '2010-05-21', 'fontanero');
INSERT INTO Arbitro VALUES (10, 370, '2010-05-21', 'fontanero');

INSERT INTO Equipo VALUES ('Barca', '2000-08-23', 3000000.344, 'Laporta', 'Xavi', 'Ariel');
INSERT INTO Equipo VALUES ('Madrid', '2010-12-31', 6000000.344, 'Pepe', 'Ronaldo', 'Paco');
INSERT INTO Equipo VALUES ('Sevilla', '2020-08-23', 100000.344, 'Alberto', 'Xavi', 'Joe');

INSERT INTO Jugador VALUES (1, 21, 'Campnou', 20.5, 'Barca');
INSERT INTO Jugador VALUES (2, 15, 'Campnou', 20.5, 'Barca');
INSERT INTO Jugador VALUES (3, 20, 'Campnou', 20.5, 'Barca');
INSERT INTO Jugador VALUES (4, 02, 'Campnou', 20.5, 'Barca');
INSERT INTO Jugador VALUES (5, 23, 'Campnou', 20.5, 'Barca');
INSERT INTO Jugador VALUES (6, 45, 'Campnou', 20.5, 'Barca');
INSERT INTO Jugador VALUES (7, 31, 'Campnou', 20.5, 'Barca');
INSERT INTO Jugador VALUES (8, 11, 'Campnou', 20.5, 'Barca');

INSERT INTO Partido VALUES (8, 'Barca', 'Madrid', 3, '2018-05-23');
INSERT INTO Partido VALUES (8, 'Sevilla', 'Madrid', 3, '2013-05-23');
INSERT INTO Partido VALUES (9, 'Barca', 'Sevilla', 3, '2017-05-23');
INSERT INTO Partido VALUES (9, 'Sevilla', 'Madrid', 3, '2019-05-23');
INSERT INTO Partido VALUES (10, 'Barca', 'Sevilla', 3, '2015-05-23');