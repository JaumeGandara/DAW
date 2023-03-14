--1. Dins de la base dades world, crea un procedure que permeti inserir dades noves dins de la taula City.
DELIMITER $$
DROP PROCEDURE IF EXISTS wCityCreator 
CREATE PROCEDURE wCityCreator (IN vCityName varchar(50), IN vCountryCode varchar(20), IN vDistrict varchar(20), IN vPopulation int(11))
BEGIN
SET @CityChecker=(SELECT Name FROM city WHERE Name=vCityName);
SET @CountryCodeChecker=(SELECT DISTINCT CountryCode FROM city WHERE CountryCode=vCountryCode);
SET @DistrictChecker=(SELECT DISTINCT District FROM city WHERE District=vDistrict);
 
IF @CityChecker IS NOT NULL THEN
    SELECT 'La ciutat jà està definida';
    
    ELSEIF @CountryCodeChecker = NULL THEN
          SELECT 'El CountryCode no Existeix';
    ELSEIF @DistrictChecker = NULL THEN
          SELECT 'El District no Existeix';
    ELSE
        INSERT INTO city(Name,CountryCode,District,Population) VALUES (vCityName,vCountryCode,vDistrict,vPopulation);
END IF;
END $$
DELIMITER ;

CALL wCityCreator("Sant Julià de Lòria", "AND", 'Andorra', 9379);
--2. A la BD World, crea un procediment que donada una ciutat, retorni el recompte dels seus habitants per pantalla juntament amb el seu pais.
DELIMITER $$
DROP PROCEDURE IF EXISTS wCityInfo
CREATE PROCEDURE wCityInfo (IN vCityName varchar(50))
BEGIN
    SELECT ci.population, co.name FROM City AS ci, Country AS co 
        WHERE ci.countryCode = co.code AND ci.name = vCityName;
END $$
DELIMITER ;
--3. A la BD northwind, crea un procediment que donats 2 paràmetres d'entrada (preu i iva) Retorni preu final per paràmetre de sortida.
DELIMITER </div>
<div><span>DROP <span>PROCEDURE <span>IF <span>EXISTS calcPrice 
CREATE PROCEDURE calcPrice (IN price DECIMAL, IN iva DECIMAL, OUT final_price DECIMAL)
BEGIN
    SET final_price = ROUND(price + (price*iva/100),2);
END $$
DELIMITER ;

CALL calcPrice(100, 21, @result);
SELECT @result;
--4. A la BD World, Crea un procediment que donada una llengua, guardi en un fitxer els països que la parlen. 
DELIMITER $$
DROP PROCEDURE IF EXISTS wCountryLanguageInfoToFile $$
CREATE PROCEDURE wCountryLanguageInfo (IN vLanguage varchar(50))
BEGIN
    SELECT co.name INTO OUTFILE 'D:/M02/UF3/Extra_Proposat/llista_idioma_paisos.txt'
        FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"'
        LINES TERMINATED BY '\n' 
        FROM country AS co, countrylanguage AS cl 
        WHERE co.code = cl.countrycode
            AND cl.language = vLanguage;
END $$
DELIMITER ;
--5. També a la BD World, modifica l'exercici anterior per fer que el nom del fitxer resultant sigui: NOM_LLENGUA.txt on NOM_LLENGUA òbviament s'adapta al valor de a llengua passada per paràmetre, no en text literal.

--6. A la BD World, donada la id d'un país, mostra per pantalla quants idiomes s'hi parlen així com el número de ciutats que té. Aquests dos valors també s'han de passar com a paràmetres de sortida 
DELIMITER $$
DROP PROCEDURE IF EXISTS wNumLanguage $$
CREATE PROCEDURE wNumLanguage (IN vCode VARCHAR(3), OUT numLanguage INT, OUT numCity INT)
BEGIN
    IF vCode = NULL THEN
        SELECT 'El Code no Existeix';
    ELSE
        SET numLanguage = (SELECT COUNT(language) FROM CountryLanguage WHERE CountryCode = vCode);
        SET numCity = (SELECT COUNT(name) FROM City WHERE CountryCode = vCode);

        SET @aux = CONCAT ("El número de llengües que es parlen són ",numLanguage," i hi han ",numCity," ciutats.");
        SELECT @aux;
END IF;
END $$
DELIMITER ;

CALL wNumLanguage('AND',@numLanguage,@numCity);
SELECT @numLanguage;
SELECT @numCity;
--7. A la BD World, crea un procedure que permeti exportar les dades de la taula CountryLanguage. El nom del fitxer ha de ser passat per paràmetre a gust de l'usuari.
DELIMITER $$
DROP PROCEDURE IF EXISTS wExportacioCountryLanguage $$
CREATE PROCEDURE wExportacioCountryLanguage ()
BEGIN
    
END $$
DELIMITER ;
--8. Crea un procedure que faci backup de totes les taules de la BD world incloent les dades. El nom de les taules noves ha d'incloure "_YYYYMMDD" amb la data del dia actual.
DELIMITER $$
DROP PROCEDURE IF EXISTS wBackupWorld $$
CREATE PROCEDURE wBackupWorld ()
/*9. Usant PL/SQL desenvolupeu una calculadora usant CASE i IF.

En una base de dades qualsevol, crear un procedure amb 4 paràmetres de tipus FLOAT: (IN pNum1, IN pNum2, IN pOperacio, OUT pResultat).

Segons el valor de la pOperacio (+, -, *, /) el procedure farà una acció o una altra i retornarà la variable resultat.

Heu d'evitar que el programa falli al fer una divisió per 0.

Entrega:

Entregueu el codi complet de la calculadora en un fitxer: CognomNom_Calc.sql
Entregueu un altre fitxer .sql amb un CALL d'exemple: CognomNom_CallCalc.sql.*/

/*10. Exercicis de loops i for's: A la BD northwind, fer un bucle que recorri tota la taula Categories i busqui si hi ha una categoria de nom "Seafood". (fer servir la BBDD Northwind) fer sense cursors)

Passos marcats:

     a) Fer loop de 1 a 10 o amb núm total de categories
     b) Buscar nom categoria on l'id = contador de loop
     c) Verificar si la la categoria = seafood
     d) En cas afirmatiu, mostrar missatge, sinó seguir buscant*/
DELIMITER $$
DROP PROCEDURE IF EXISTS wExercici10 $$
CREATE PROCEDURE wExercici10 ();
BEGIN
    DECLARE increment INT DEFAULT 1;
    DECLARE nom VARCHAR(20);

    SET @maxIncrement=(SELECT COUNT(categoryID) FROM Categories);

    bucle: LOOP
        SET increment = increment + 1;
        IF increment > @maxIncrement THEN
            LEAVE bucle;
        END IF;

        SET nom=(SELECT CategoryName FROM Categories WHERE categoryID = increment);
        IF nom LIKE "Seafood" THEN
            SET @aux = CONCAT ("Seafood trobat amb la id: ",increment);
            SELECT @aux
            LEAVE bucle;
        END IF;
    END LOOP bucle;
END $$
DELIMITER ;