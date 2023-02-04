--a)	Haz dos inserciones como mínimo en todas las tablas de la base de datos usando el método mutli-insert.

--b)	Actualiza la posición de todos los clasificados a 0 para las temporadas con año 2019 en la fecha de inicio.
UPDATE Clasificacion AS c, Temporada AS t 
    SET posicion = 0 
    WHERE t.id_temporada = c.id_temporada 
        AND YEAR(fecha_inicio) = 2019;
--c)	Actualiza la fecha de creación de una federación que has creado a la fecha del día de hoy.
UPDATE Federacion AS f 
    SET fecha_creacion = CURRENT_DATE() 
    WHERE nombre_federeacion = 'Federacion Española de Futbol';
--d)	Borra el valor nombre_TV de la competición ‘Champions’.
UPDATE Competicion
    SET nombre_TV = NULL
    WHERE nombre_competicion = 'Champions';
--e)	Borra todas las clasificaciones.
DELETE FROM Clasificacion;