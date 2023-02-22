SELECT * INTO OUTFILE 'D:/M02/UF3/world/country.txt'
FIELDS TERMINATED BY ',\t' OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY ';\n' FROM country;

-- Països d'europa amb , de canvi de columna i ;\n de salt de línia, .csv a la extensió del fitxer
SELECT * INTO OUTFILE 'D:/M02/UF3/world/country2.csv'
FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY ';\n' FROM country WHERE continent = "Europe";

-- Països d'europa + número de ciutats amb , de canvi de columna i ;\n de salt de línia, .csv a la extensió del fitxer

SELECT c.*, COUNT(c2.id) INTO OUTFILE 'D:/M02/UF3/world/country3.csv'
FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY ';\n' FROM country AS c, city AS c2 WHERE c2.countrycode = c.code AND continent = "Europe" GROUP BY c.code;