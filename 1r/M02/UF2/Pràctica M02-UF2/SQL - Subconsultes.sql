--1. Retorna el nom o noms del bar amb la carta de begudes més extensa
SELECT b.Nom FROM BAR AS b
    WHERE b.Id_Bar = (SELECT cb.Id_Bar FROM CARTA_BEGUDES AS cb ORDER BY COUNT());
--2. Els distribuïdors que distribueixen tots els ingredients existents
SELECT d.Nom_empresa FROM DISTRIBUIDOR AS d
    WHERE EXISTS (SELECT e.Id_Distribuidor FROM INGREDIENT AS i 
                    WHERE d.Id_Distribuidor = i.Id_Distribuidor);

SELECT d.Nom_empresa FROM (DISTRIBUIDOR AS d JOIN INGREDIENT AS i ON d.Id_Distribuidor = i.Id_Distribuidor)
    HAVING COUNT(i.Id_Ingrdient) = (SELECT COUNT(i2.Id_Distribuidor) FROM INGREDIENT AS i2
                                        WHERE i2.Id_Distribuidor = d.Id_Distribuidor);
--3. Retorna les comandes de begudes que contenen begudes alcohòliques de taules que siguin per fumadors i aptes per grups grans (més de 5 persones). (Pista: IN o NOT IN)
SELECT cb.* 
    FROM (COMANDA_BEGUDES AS cb JOIN CLIENT_TAULA AS ct JOIN TAULA AS t 
        ON cb.Id_Client_Taula = ct.Id_Client_Taula AND ct.Numero_Taula = t.Numero_Taula)
    WHERE cb.Id_Client_Taula IN (SELECT ct2.Id_Client_Taula FROM CLIENT_TAULA AS ct2
                                    WHERE Numero_Taula IN (SELECT t2.Numero_Taula FROM TAULA AS t2
                                                            WHERE t2.Es_fumadors = true AND t2.Num_cadires > 5));
/*
4. Llista el nom de les tapes que compleixen les següents condicions:
    a. Tenen més 3 ingredients d'importació
    b. Estan presents a les cartes de més d'un bar
*/
SELECT t.Nom 
    FROM (TAPA AS t JOIN INGRDIENTS_TAPA AS it JOIN INGREDIENT AS i 
        ON t.Id_Tapa = it.Id_Tapa AND it.Id_Ingrdient = i.Id_Ingrdient)
    WHERE 3 < (SELECT COUNT(i2.Id_Ingrdient) FROM INGREDIENT AS i2 
                WHERE i2.Es_Importacio = true)
        AND 1 < (SELECT COUNT(b.Id_Bar) FROM BAR AS b, CARTA_TAPES AS ct, TAPA AS t2 
                    WHERE b.Id_Bar = ct.Id_Bar AND ct.Id_Tapa = t2.Id_Tapa)
    GROUP BY t.Id_Tapa;
--5. Retorna el nom o noms dels distribuïdors amb menys begudes diferents distribuïdes
SELECT d.Nom_empresa FROM DISTRIBUIDOR AS d
    WHERE d.Id_Distribuidor = (SELECT db.Id_Distribuidor FROM DISTRO_Beguda 
                                GROUP BY db.Id_Distribuidor ORDER BY COUNT(db.Id_Beguda));