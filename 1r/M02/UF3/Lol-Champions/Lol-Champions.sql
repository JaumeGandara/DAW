CREATE DATABASE IF NOT EXISTS lol;

use lol;

CREATE TABLE characters(
	id INT,
	name VARCHAR(50),
	class VARCHAR(50),
	style INT,
	difficulty INT,
	damagetype VARCHAR(50),
	damage INT,
	sturdiness INT,
	crowd_control INT,
	mobility INT,
	functionality INT,
	PRIMARY KEY (id)
);

LOAD DATA INFILE 'D:/M02/UF3/Lol-Champions/Lol-Champions.csv' 
INTO TABLE characters FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' IGNORE 1 LINES;