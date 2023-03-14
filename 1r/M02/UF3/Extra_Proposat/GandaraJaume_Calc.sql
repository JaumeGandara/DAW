DELIMITER $$
DROP PROCEDURE IF EXISTS wCalculadora $$
CREATE PROCEDURE wCalculadora (IN pNum FLOAT, IN valor CHAR(1), IN sNum FLOAT, OUT resultat FLOAT)
BEGIN
    CASE valor
        WHEN + THEN 
            SET resultat = pNum + sNum;
        WHEN - THEN 
            SET resultat = pNum - sNum;
        WHEN * THEN 
            SET resultat = pNum * sNum;
        WHEN / THEN 
            IF pNum = 0 OR sNum = 0 THEN 
                SET resultat = 0;
            ELSE 
                SET resultat = pNum / sNum;
END CASE;
END $$
DELIMITER ;