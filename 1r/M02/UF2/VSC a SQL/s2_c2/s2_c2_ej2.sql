--a)	Selecciona el nombre y apellido de los árbitros que sean jugadores (Utilizando conjuntos)
SELECT p.nombre, p.apellido1 
    FROM Persona AS p, 
        Jugador AS j, 
        Arbitro AS a 
    WHERE a.num_ss_arbitro = j.num_ss_jugador;
--b)	Selecciona el nombre y apellido de los árbitros que no sean jugadores (Utilizando conjuntos).

--c)	Muestra el número de partidos jugados por equipo como local de los 3 equipos que hayan jugado más.
SELECT equipo_local, COUNT(equipo_local) FROM Partido
    GROUP BY equipo_local
    ORDER BY COUNT(equipo_local) ASC LIMIT 3;
--d)	Muestra la suma de presupuestos de todos los equipos.
SELECT SUM(presupuesto) FROM Equipo;
--e)	Muestra el nombre y apellido de los jugadores ordenados por el apellido de forma ascendente y por el nombre de forma descendente.
SELECT p.apellido1, p.nombre 
    FROM Persona AS p, 
        Jugador AS j 
    WHERE num_ss = num_ss_jugador 
    ORDER BY p.apellido1 ASC, p.nombre DESC;
--f)	Muestra equipos listados de la A a la Z filtrando solo los 3 primeros resultados.
SELECT nombre FROM Equipo
    ORDER BY nombre ASC LIMIT 3;