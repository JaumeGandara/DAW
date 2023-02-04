--a)	Selecciona la id de los subscritores que han comprado alguna entrega (como clientes).
SELECT s.id_subscritor 
    FROM Subscritor AS s,
        Cliente_Entrega AS ce
    WHERE s.id_subscritor = cs.id_cliente;
--b)	Selecciona el nombre de las colecciones junto con el número de entregas de cada una de ellas.
SELECT c.nombre_coleccion, COUNT(e.fecha_entrega)
    FROM Coleccion AS c,
        Entrega AS e
    GROUP BY c.nombre_coleccion;
--c)	Selecciona las entregas con más de dos regalos.
SELECT e.fecha_entrega, e.nombre_coleccion FROM Entrega AS e, Regalo AS r
    GROUP BY e.fecha_entrega, e.nombre_coleccion
    HAVING COUNT(r.id_regalo) > 2;
--d)	Selecciona las colecciones donde el peso total de sus regalos sea superior a 5000g.
SELECT e.nombre_coleccion FROM Entrega AS e, Regalo AS r
    WHERE e.nombre_coleccion = r.nombre_coleccion AND r.peso > 5000;
--e)	Selecciona la id de los clientes junto con cuantas entregas han comprado, siempre que sean mas de 20.
SELECT id_cliente FROM Cliente_Entrega AS ce
    GROUP BY id_cliente
    HAVING COUNT(fecha_entrega);