--a)	Haz una inserción como mínimo en todas las tablas de la base de datos (excepto equipo donde harás dos) usando la inserción indirecta. 

--b)	Actualiza el dorsal a 1 y ubicación a ‘Portero’ para el jugador que has creado.
UPDATE Jugador
    SET dorsal = 1, ubicacion = 'Portero'
    WHERE num_ss_jugador = 1;
--c)	Actualiza el valor del presidente de un equipo que has creado con el valor de su entrenador.
UPDATE Equipo
    SET presidente = entrenador
    WHERE nombre = 'Madrid';
--d)	Actualiza el presupuesto del equipo en +1 millón del equipo con el primer equipo encontrado ordenados de la A a la Z por su nombre.
UPDATE Equipo
    SET presupuesto = presidente + 1000000
    ORDER BY nombre ASC
    LIMIT 1;
--e)	Borra el equipo que se encuentre primero ordenándolos de la Z a la A por su nombre.
DELETE FROM Equipo
    ORDER BY nombre DESC
    LIMIT 1;