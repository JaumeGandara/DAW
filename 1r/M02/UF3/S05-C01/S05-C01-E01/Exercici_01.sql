--Sin utilizar procedimientos, copia el nombre de las tablas de una base de datos cualquiera (si no dispones de ninguna, crea una con al menos 3 tablas, 3 atributos por tabla e inserta 3 filas por tabla) en un fichero llamado nombre_tablas.txt:

USE information_schema;

SELECT table_name INTO OUTFILE 'D:/M02/UF3/S05-C01/S05-C01-E01/nombre_tablas.txt'
FIELDS TERMINATED BY ','
LINES TERMINATED BY ';\n' 
FROM information_schema.tables
WHERE table_schema = "world"
AND table_type = "base table";