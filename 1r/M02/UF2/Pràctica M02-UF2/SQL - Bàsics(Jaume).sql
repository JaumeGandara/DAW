/*
1. Selecciona les tapes tals que el seu nom contingui ‘de la casa’, que estiguin fetes amb
més de 4 ingredients i que el seu temps de preparació sigui superior a 1h.
*/
SELECT t.* FROM (TAPA AS t JOIN INGRADIENT_TAPA AS it ON t.Id_Tapa = it.Id_Tapa)
    WHERE t.Nom LIKE "*de la casa"
        AND Temps_preparacio > 60
    HAVING COUNT(Id_Ingredient) > 4;
--2. Retorna el nom del(s) distribuïdor(s) que no subministren cap ingredient. Fes servir conjunts i/o usant JOIN’s.
SELECT d1.Nom_empresa FROM (DISTRIBUIDOR AS d1 JOIN INGREDIENT AS i ON d.Id_Distribuidor = i.Id_Distribuidor)
    WHERE NOT EXISTS (SELECT * FROM DISTRIBUIDOR AS d2
                        WHERE d2.Id_Distribuidor = i.Id_Distribuidor);
/*
3. Retorna el nom i cognom d’aquells clients que també són treballadors, que tinguin un email vàlid 
(l’email ha de contenir una @ per ser considerat vàlid) i que hagin tingut un ascens 
(suposem que ha ascendit quan el sou extra és diferent de nul). Fes servir conjunts.
*/
(SELECT p.Nom, p.Cognom1 FROM (EMPRESA AS e JOIN PERSONA AS p JOIN CLIENT AS c ON p.DNI = e.DNI_Empresa AND p.DNI = c.DNI_Client)
    WHERE p.Email LIKE "*@*")
INTERSECT
(SELECT p.Nom, p.Cognom1 FROM (EMPRESA AS e JOIN PERSONA AS p JOIN CLIENT AS c ON p.DNI = e.DNI_Empresa AND p.DNI = c.DNI_Client)
    WHERE e.Quantitat_sou_extra);
--4. Retorna la mitjana de nombre de cadires que tenen les taules de cada bar. Considera només les taules que estan a l’interior.
SELECT AVG(Num_cadires) FROM TAULA
    WHERE Es_exterior = true;
--5. Retorna el recompte de quants ingredients hi ha que siguin picants i d’importació que en la seva descripció hi contingui la paraula “fire”.
SELECT AVG(Id_Ingredient) FROM INGREDIENT
    WHERE Es_picant = true
        AND Es_importacio = true
        AND Descripcio LIKE "*fire*";
/*
6. Mostra tota la informació que apareix a les cartes (incloent el nom de la tapa i/o de la beguda), 
tenint en compte només els productes calents, que siguin individuals i les begudes no alcohòliques. Fes servir conjunts.
*/
(SELECT t.*, ct.Cost, ct.PVP FROM (CARTA_TAPES AS ct JOIN TAPA AS t ON ct.Id_Tapa = t.Id_Tapa)
    WHERE t.Es_Calent = true
        AND t.Es_Individual = true)
UNION
(SELECT b.*, cb.Cost, cb.PVP FROM (CARTA_BEGUDES AS cb JOIN BEGUDA AS b ON cb.Id_Beguda = b.Id_Beguda)
    WHERE b.Es_calent = true
        AND b.Te_alchol = false);
/*
7. Retorna les 10 primeres begudes ordenades en primer lloc pel marge de benefici (PVP – cost) de major a menor i 
en segon lloc pel seu nom de la A a la Z. Sabries retornar els 10 resultats següents? Com?
*/
SELECT b.Nom FROM (CARTA_BEGUDES AS cb JOIN BEGUDA AS b ON cb.Id_Beguda = b.Id_Beguda)
    ORDER BY (cb.PVP-cb.Cost) DESC, b.nom ASC LIMIT 10;