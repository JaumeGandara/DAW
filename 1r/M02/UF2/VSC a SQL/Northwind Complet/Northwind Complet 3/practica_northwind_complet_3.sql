--1. Retorna un recompte de quants distribuidors (shippers) hi ha.
SELECT COUNT(shipperID) FROM Shippers;
--2. Calcula quants proveïdors (suppliers) hi ha per ciutat.
SELECT City, COUNT(ContactName) FROM Suppliers GROUP BY City;
--3. Calcula quants productes són distribuits pel shipper número 3.
SELECT SUM(Quantity) FROM OrderDetails AS od, Orders AS o
    WHERE od.OrderID = o.OrderID AND ShipVia = 3;
--4. Crea un informe amb el nom del distribuidor, nom del proveidor, nom de la categoria i el recompte de productes que coincideixen.
SELECT su.CompanyName, sh.CompanyName, c.CategoryName, COUNT(p.ProductID)
    FROM Suppliers AS su, 
        Shippers AS sh, 
        Categories AS c, 
        Products AS p,
        OrderDetails AS od,
        Orders AS o
    WHERE su.SupplierID = p.SupplierID
        AND c.CategoryID = p.CategoryID
        AND p.ProductID = od.ProductID
        AND od.OrderID = o.OrderID
        AND o.ShipVia = sh.ShipperID
    GROUP BY su.CompanyName, sh.CompanyName, c.CategoryName;
--5. Mostra un informe amb el nom dels clients (customers.companyname) que han rebut més de tres paquets provinents del shipper número 3.
SELECT c.CompanyName
    FROM Customers AS c,
        Shippers AS sh,
        Orders AS o
    WHERE ShipperID = 3
    AND (SELECT COUNT(o.OrderID) FROM Orders AS o, Customers AS c WHERE ShipVia = 3) > 3
    GROUP BY c.CompanyName;
--6. Mostra un recompte de les ordres que ha rebut cada customer ordenant pel recompte de forma descendent.
SELECT c.CompanyName, COUNT(o.OrderID)
    FROM Orders AS o,
        Customers AS c
    WHERE o.CustomerID = c.CustomerID
    GROUP BY c.CompanyName;
--7. Mostra un recompte de clients (customers) per codi postal sempre i quant n'hi hagi més d'un al mateix codi postal.
SELECT PostalCode, COUNT(CustomerID) FROM Customers
    GROUP BY PostalCode
    HAVING COUNT(CustomerID) > 1;
--8. Compta quants territoris diferents hi ha per cada regió. Mostra RegionDescription i el recompte.
SELECT r.RegionDescription, COUNT(t.TerritoryID) 
    FROM Territories AS t,
        Region AS r
    WHERE t.RegionID = r.RegionID
    GROUP BY r.RegionID;
--9. Calcula la mitjana de comandes (orders) servides per cada shipper. 
SELECT ShipVia, COUNT(OrderID) FROM Orders
    GROUP BY ShipVia;
--10. Compta quants empleats hi ha per cada territori. Mostra TerritoryDescription i el recompte.
SELECT t.TerritoryDescription, COUNT(e.EmployeeID) 
    FROM Employees AS e, 
        Territories AS t, 
        EmployeeTerritories AS et
    WHERE e.EmployeeID = et.EmployeeID
        AND t.TerritoryID = et.TerritoryID
    GROUP BY e.EmployeeID;

SELECT t.TerritoryDescription, COUNT(e.EmployeeID) 
    FROM Employees AS e, 
        Territories AS t, 
        EmployeeTerritories AS et
    WHERE e.EmployeeID = et.EmployeeID
        AND t.TerritoryID = et.TerritoryID
    GROUP BY t.TerritoryID;
--11. Compta quants empleats hi ha per cada regió. Mostra RegionDescription i el recompte.
SELECT r.RegionDescription, COUNT(e.EmployeeID) 
    FROM Employees AS e, 
        Territories AS t, 
        Region AS r,
        EmployeeTerritories AS et
    WHERE e.EmployeeID = et.EmployeeID
        AND t.TerritoryID = et.TerritoryID
        AND t.RegionID = r.RegionID
    GROUP BY r.RegionDescription;
--12. Retorna només el nom de la regió (region.description) que té més empleats.
SELECT r.RegionDescription, COUNT(e.EmployeeID)
    FROM Region AS r, 
        Territories AS t, 
        EmployeeTerritories AS et, 
        Employees AS e 
    WHERE r.RegionID = t.RegionID 
        AND t.TerritoryID = et.TerritoryID 
        AND et.EmployeeID = e.EmployeeID 
    GROUP BY r.RegionDescription 
    HAVING max(e.EmployeeID) LIMIT 1;
--13. Retorna el recompte de productes per categoria.
SELECT c.CategoryName, COUNT(p.ProductID) 
    FROM Products AS p,
        Categories AS c
    WHERE p.CategoryID = c.CategoryID
    GROUP BY c.CategoryName
    ORDER BY c.CategoryName ASC;
--14. Calcula quants productes pot servir cada distribuïdor. Mostra el CompanyName i el recompte de productes.
SELECT s.CompanyName, COUNT(p.ProductID) 
    FROM Suppliers AS s,
        Products AS p
    WHERE s.SupplierID = p.SupplierID
    GROUP BY s.CompanyName
    ORDER BY s.CompanyName ASC;
--15. Calcula quants empleats hi ha per Ciutat contractats a partir de l'any 1993.
SELECT City, COUNT(EmployeeID) FROM Employees
    GROUP BY City
    ORDER BY City ASC;