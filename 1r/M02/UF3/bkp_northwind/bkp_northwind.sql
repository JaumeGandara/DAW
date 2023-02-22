CREATE DATABASE IF NOT EXISTS bkp_northwind;

USE bkp_northwind;

CREATE TABLE bkp_categories LIKE northwind.categories;
CREATE TABLE bkp_customercustomerdemo LIKE northwind.customercustomerdemo;
CREATE TABLE bkp_customerdemographics LIKE northwind.customerdemographics;
CREATE TABLE bkp_customers LIKE northwind.customers;
CREATE TABLE bkp_employees LIKE northwind.employees;
CREATE TABLE bkp_employeeterritories LIKE northwind.employeeterritories;
CREATE TABLE bkp_orderdetails LIKE northwind.orderdetails;
CREATE TABLE bkp_orders LIKE northwind.orders;
CREATE TABLE bkp_products LIKE northwind.products;
CREATE TABLE bkp_region LIKE northwind.region;
CREATE TABLE bkp_shippers LIKE northwind.shippers;
CREATE TABLE bkp_suppliers LIKE northwind.suppliers;
CREATE TABLE bkp_territories LIKE northwind.territories;

INSERT INTO bkp_categories SELECT * FROM northwind.categories;
INSERT INTO bkp_customercustomerdemo SELECT * FROM northwind.customercustomerdemo;
INSERT INTO bkp_customerdemographics SELECT * FROM northwind.customerdemographics;
INSERT INTO bkp_customers SELECT * FROM northwind.customers;
INSERT INTO bkp_employees SELECT * FROM northwind.employees;
INSERT INTO bkp_employeeterritories SELECT * FROM northwind.employeeterritories;
INSERT INTO bkp_orderdetails SELECT * FROM northwind.orderdetails;
INSERT INTO bkp_orders SELECT * FROM northwind.orders;
INSERT INTO bkp_products SELECT * FROM northwind.products;
INSERT INTO bkp_region SELECT * FROM northwind.region;
INSERT INTO bkp_shippers SELECT * FROM northwind.shippers;
INSERT INTO bkp_suppliers SELECT * FROM northwind.suppliers;
INSERT INTO bkp_territories SELECT * FROM northwind.territories;

SELECT table_name INTO OUTFILE 'D:/M02/UF3/bkp_northwind/bkp_northwind_name_table.csv'
FIELDS TERMINATED BY ','
LINES TERMINATED BY ';\n' 
FROM information_schema.tables
WHERE table_schema = "bkp_northwind"
AND table_type = "base table";

SELECT table_name, table_rows, create_time INTO OUTFILE 'D:/M03/UF2/bkp_northwind/bkp_northwind_nt_tr_ct.csv'
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY ';\n' 
FROM information_schema.tables
WHERE table_schema = "bkp_northwind"
AND table_type = "base table";