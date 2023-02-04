--1- Mostra totes les regions del planeta i el nombre d'idiomes que es parlen a cada una d'elles ordenat alfabèticament pel nom de la regió. (group by i join)
SELECT c.region, COUNT(cl.language)
    FROM (Country AS c JOIN Countrylanguage AS cl ON c.code = cl.countrycode)
    GROUP BY c.region
    ORDER BY c.region ASC;
--2- Mostrar el districte de la ciutat amb més població. (subquery)
SELECT c1.District, c1.name FROM City AS c1
    WHERE c1.population = (SELECT MAX(c2.population) FROM city AS c2);
--3- Mostrar codi, nom i continent del país de mida més petita. (subquery)
SELECT c1.code, c1.name, c1.continent FROM Country AS c
    WHERE c1.SurfaceArea = (SELECT MIN(c2.SurfaceArea) FROM Country AS c2);
--4- Calcula l'idioma més parlat a cada país. Mostra nom de país i idioma ordenat per país i idioma. (group by i join entre countrylanguage i country)
SELECT c.name, cl.language, cl.percentage FROM (Country AS c JOIN Countrylanguage AS cl ON c.code = cl.countrycode)
    WHERE cl.percentage = (SELECT MAX(cl2.percentage) FROM Countrylanguage AS cl2 WHERE cl2.countrycode = cl.countrycode)
    GROUP BY c.code
    ORDER BY c.name, cl.language;
--5- Mostra el nom del país on hi ha la ciutat amb menys població. (subquery)
SELECT c.name FROM Country AS co JOIN City AS ci ON co.code = ci.countrycode
--Aquesta només retorna un resultat
    WHERE ci.population = (SELECT MIN(ci2.population) FROM City AS ci2);

SELECT c.name FROM Country AS co JOIN City AS ci ON co.code = ci.countrycode
--Aquesta retorna tot
    WHERE ci.population <= ALL (SELECT ci2.population FROM City AS ci2);
--6- Mostra el nom (o noms) del país (o països) on es parlen el més idiomes. (group by per tal de contar el nombre d'idiomes diferents que es parlen per país i subquery per trobar el nom del país)
SELECT c.name FROM Country AS c JOIN Countrylanguage AS cl ON c.code = cl.countrycode
    HAVING COUNT(cl.language) = (SELECT COUNT(cl2.language) FROM Country AS c2 JOIN Countrylanguage AS cl2 ON c2.code = cl2.countrycode 
    GROUP BY c2.name
    ORDER BY COUNT(cl2.language) DESC
    LIMIT 1)
    GROUP BY c.name;

SELECT COUNT(cl2.language) FROM Country AS c2 JOIN Countrylanguage AS cl2 ON c2.code = cl2.countrycode 
    GROUP BY c2.name
    ORDER BY COUNT(cl2.language) DESC
    LIMIT 1;
--7- Mostra els idiomes que es parlen en el país amb més superfície de terreny. (subquery)
SELECT cl.language FROM (Countrylanguage AS cl JOIN Country AS co ON co.code = cl.countrycode)
    WHERE co.SurfaceArea = (SELECT MAX(co2.SurfaceArea) FROM Country AS co2);
--8- Mostra el districte de ciutat on es parlen més idiomes. (subquery)
SELECT c.district FROM (City AS c JOIN Countrylanguage AS cl ON c.countrycode = cl.countrycode)
    HAVING COUNT(cl.language) = (SELECT COUNT(cl2.language) FROM Countrylanguage AS cl2
    GROUP BY cl2.countrycode
    ORDER BY COUNT(cl2.language) DESC LIMIT 1);
--9- Mostra el nom del país (o països) on es parlen més idiomes oficials. (subquery i join)
SELECT c.name FROM country AS c, countrylanguage AS co
	WHERE c.code = co.CountryCode
    AND co.IsOfficial = 'T'
    GROUP BY c.code
    HAVING COUNT(co.language) =
    (SELECT COUNT(co2.language) FROM countrylanguage AS co2
     WHERE co2.IsOfficial = 'T'
     GROUP BY co2.CountryCode
     ORDER BY COUNT(co2.language) DESC LIMIT 1);
--10- Mostra el nom de totes les ciutats del país (o països) que es va independitzar fa més temps. (subquery)

--11- El districte amb més ciutats (subquery)

--12- Els paisos on totes les seves ciutats (de la nostra BBDD) tinguin mes de 200.000 habitants.
SELECT co.name FROM Country AS co JOIN City AS ci ON co.code = ci.countrycode
    WHERE ci.countrycode NOT IN (SELECT ci2.countrycode FROM city AS ci2 WHERE ci2.population <= 200000)
    GROUP BY co.name;
--13- Totes les ciutats del Carib (tot i que e spot fer sense subconsulta, pensa una forma de fer-ho amb subquerys).
SELECT * FROM city
	WHERE countrycode IN (SELECT code FROM country WHERE c.region = 'Caribbean');
--14- La suma de població per continent (group by).
SELECT continent, SUM(population) FROM Country
	GROUP BY continent;
--15- La ciutat més gran d'Europa.
SELECT ci.* FROM City AS ci, Country AS co WHERE
	co.code = ci.countrycode AND co.continent = 'Europe'
	ORDER BY ci.Population DESC LIMIT 1;
--16- El continent amb més població i el seu número.
SELECT continent, SUM(population) FROM Country
	GROUP BY continent
    ORDER BY SUM(population) DESC LIMIT 1;
--17- El continent amb més ciutats  i el seu número.
SELECT c.continent, COUNT(ci.name) FROM Country as c JOIN City AS ci ON c.code = ci.countrycode
    GROUP BY c.continent
    ORDER BY COUNT(ci.name) DESC LIMIT 1;
--18- La regió amb un AVG d'habitants per país més gran.
SELECT region FROM Country
    GROUP BY Region
    ORDER BY AVG(population) DESC LIMIT 1;