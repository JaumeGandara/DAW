CREATE DATABASE IF NOT EXISTS s3_c1_ej3;

USE s3_c1_ej3;

CREATE TABLE Usuario (
    id_usuario INT AUTO_INCREMENT NOT NULL,
    DNI VARCHAR(9) NOT NULL,
    email VARCHAR(50) NOT NULL,
    direccion VARCHAR(200) NOT NULL,
    num_targeta INT NOT NULL,
    PRIMARY KEY(id_usuario)
);

CREATE TABLE Subscriptor (
    id_subscriptor INT AUTO_INCREMENT,
    es_asociado BOOLEAN DEFAULT 1,
    PRIMARY KEY(id_subscriptor)
);

CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT,
    gusta_electronica BOOLEAN DEFAULT 1,
    PRIMARY KEY(id_cliente)
);

CREATE TABLE Coleccion (
    nombre_coleccion VARCHAR(20),
    ano_inicio INT,
    ano_fin INT,
    PRIMARY KEY(nombre_coleccion)
);

CREATE TABLE Subscriptor_Coleccion (
    id_subscriptor INT,
    nombre_coleccion VARCHAR(20),
    PRIMARY KEY(id_subscriptor, nombre_coleccion)
);

CREATE TABLE Entrega (
    fecha_entrega DATE,
    nombre_coleccion VARCHAR(20),
    PRIMARY KEY(fecha_entrega)
);

CREATE TABLE Cliente_Entrega (
    id_cliente INT,
    fecha_entrega DATE,
    nombre_coleccion VARCHAR(20),
    PRIMARY KEY(id_cliente, fecha_entrega, nombre_coleccion)
);

CREATE TABLE Regalo (
    id_regal INT AUTO_INCREMENT,
    fecha_entrega DATE,
    nombre_coleccion VARCHAR(20),
    peso DECIMAL,
    PRIMARY KEY(id_regal, fecha_entrega, nombre_coleccion)
);

ALTER TABLE Subscriptor ADD FOREIGN KEY(id_subscriptor) REFERENCES Usuario(id_usuario) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE Cliente ADD FOREIGN KEY(id_cliente) REFERENCES Usuario(id_usuario) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE Subscriptor_Coleccion ADD FOREIGN KEY(id_subscriptor) REFERENCES Subscriptor(id_subscriptor) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE Subscriptor_Coleccion ADD FOREIGN KEY(nombre_coleccion) REFERENCES Coleccion(nombre_coleccion) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE Entrega ADD FOREIGN KEY(nombre_coleccion) REFERENCES Coleccion(nombre_coleccion) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE Cliente_Entrega ADD FOREIGN KEY(id_cliente) REFERENCES Cliente(id_cliente) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE Cliente_Entrega ADD FOREIGN KEY(fecha_entrega, nombre_coleccion) REFERENCES Coleccion(fecha_entrega nombre_coleccion) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE Regalo ADD FOREIGN KEY(fecha_entrega, nombre_coleccion) REFERENCES Entrega(fecha_entrega, nombre_coleccion) ON UPDATE CASCADE ON DELETE CASCADE;