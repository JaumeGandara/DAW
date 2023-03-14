--Para una base de datos con la tabla de país (id (PK), nombre_pais, y habitantes), devuelve un archivo con el nombre de cada país y el porcentaje de habitantes que cada uno tiene sobre el total.

SELECT code, name, population/(SELECT sum(population) FROM country)*100
    INTO OUTFILE 'D:/M02/UF3/S05-C01/S05-C01-E03/world.txt'
    FIELDS TERMINATED BY ',' LINES TERMINATED BY ';\n' 
    FROM country;