CREATE DATABASE IF NOT EXISTS LSG_Bars DEFAULT CHARACTER SET 'utf8mb4' DEFAULT COLLATE 'utf8mb4_general_ci';

USE LSG_Bars;

--Aixó va després de la taula PERSONA() i TAULA()

CREATE TABLE IF NOT EXISTS CLIENT (
    DNI_Client VARCHAR(9),
    Es_Major BOOLEAN,
    PRIMARY KEY (DNI_Client),
    FOREIGN KEY (DNI_Client) REFERENCES PERSONA(DNI) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS CLIENT_TAULA (
    Id_client_taula INT AUTO_INCREMENT,
    DNI_Client VARCHAR(9),
    Numero_Taula INT,
    Id_Bar INT,
    Es_fumador BOOLEAN DEFAULT 0,
    Data_hora_arribada DATETIME,
    Data_hora_sortida DATETIME,
    Ha_pagat BOOLEAN,
    PRIMARY KEY (Id_client_taula),
    FOREIGN KEY (DNI_Client) REFERENCES CLIENT(DNI_Client),
    FOREIGN KEY (Numero_Taula, Id_Bar) REFERENCES TAULA(Numero_Taula, Id_Bar) ON UPDATE CASCADE ON DELETE CASCADE
);

--Aixó va després que les taules TAPA(), BEGUDA() i BAR()

CREATE TABLE IF NOT EXISTS CARTA_TAPES (
    Id_Tapa INT,
    Id_Bar INT,
    Cost DECIMAL(2),
    PVP DECIMAL,
    PRIMARY KEY (Id_Tapa, Id_Bar),
    FOREIGN KEY (Id_Tapa) REFERENCES CARTA_TAPES(Id_Tapa) RESTRICT,
    FOREIGN KEY (Id_Bar) REFERENCES BAR(Id_Bar) RESTRICT
);

CREATE TABLE IF NOT EXISTS CARTA_BEGUDES (
    Id_Beguda INT,
    Id_Bar INT,
    Cost DECIMAL(2),
    PVP DECIMAL,
    PRIMARY KEY (Id_Beguda, Id_Bar),
    FOREIGN KEY (Id_Beguda) REFERENCES BEGUDA(Id_Beguda) RESTRICT,
    FOREIGN KEY (Id_Bar) REFERENCES BAR(Id_Bar) RESTRICT
);

--Aixó va al final del tot del document .sql

CREATE TABLE IF NOT EXISTS COMANDA_TAPES (
    Id_Tapa INT,
    Id_Bar INT,
    Id_client_taula INT,
    Data_hora_comanda DATETIME,
    Quantitat INT,
    PRIMARY KEY (Id_Tapa, Id_Bar),
    FOREIGN KEY (Id_Tapa, Id_Bar) REFERENCES CARTA_TAPES(Id_Tapa, Id_Bar) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Id_client_taula) REFERENCES CLIENT_TAULA(Id_client_taula) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS COMANDA_BEGUDES (
    Id_Beguda INT,
    Id_Bar INT,
    Id_client_taula INT,
    Data_hora_comanda DATETIME,
    Quantitat INT,
    PRIMARY KEY (Id_Beguda, Id_Bar),
    FOREIGN KEY (Id_Beguda, Id_Bar) REFERENCES CARTA_BEGUDES(Id_Beguda, Id_Bar) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (Id_client_taula) REFERENCES CLIENT_TAULA(Id_client_taula) ON UPDATE CASCADE ON DELETE CASCADE
);