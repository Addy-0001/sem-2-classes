-- •	Create a new database named "ECommercePlatform."
create database EcommercePlatform; 

-- Selecting the database
use EcommercePlatform;

-- •	Design a table named "Products" with the following columns:
-- •	ProductID (integer, primary key)
-- •	ProductName (varchar)
-- •	Category (varchar)
-- •	Price (decimal)
Create table Products(
	ProductID integer primary key,
	ProductName varchar(255),
	Category varchar(255),
	Price decimal
);

-- •	Design a table named "Customers" with the following columns:
-- •	CustomerID (integer, primary key)
-- •	FirstName (varchar)
-- •	LastName (varchar)
-- •	Email (varchar)
-- •	Define appropriate constraints for these tables (e.g., primary keys, foreign keys).
create table Customers(
	CustomerID integer primary key,
	FirstName varchar(255),
	LastName varchar(255),
	Email varchar(255)
); 


-- •	Insert at least 5 records into the "Products" table.
insert into Products(ProductID, ProductName, Category, Price)
values
(1, "Table", "Furniture", 10000),
(2, "Chair", "Furniture", 1000),
(3, "Laptop", "Tech", 100000),
(4, "Mobile Phone" , "Tech", 10000),
(5, "Pen", "Misc", 10);

select * from Products; 

-- •	Insert at least 3 records into the "Customers" table.
insert into Customers(CustomerID, FirstName, LastName, Email)
Values
(1, "Adamya", "Neupane", "adamya@getintoto.com"),
(2, "John", "Doe", "john@doe.com"),
(3, "Jane", "Doe", "jane@doe.com");

-- •	Write a SQL query to retrieve the names and prices of all products in a specific category.
Select ProductName, Price from Products where Category = "Furniture";

-- •	Write a SQL query to retrieve the details of a customer with a specific CustomerID.
Select * from Customers where CustomerID = 1;

-- •	Write a SQL query to retrieve the products with a price higher than a specified amount.
select * from products where Price > 9999; 

-- •	Update the price of a specific product.
update products set price = 1200000 where productId=3;


alter table Products modify column purchased_by int; 


alter table Products add constraint Customer_Detail foreign key (purchased_by) references Customers(CustomerID); 

-- •	Update the email address of a specific customer.
update Customers set email = "jane.doe@getintoto.com" where customerID = 2;

-- •	Delete a product from the "Products" table.
delete from Products where ProductID = 5; 

-- •	Delete a customer from the "Customers" table.
delete from Customers where customerID = 3;

-- •	Add a new column to the "Products" table to track the quantity in stock.
Alter table Products add column Stock int; 

update products set stock=15 where ProductID = 1 and ProductID = 3 and ProductID = 4;
update products set stock=5 where ProductID = 2;

-- •	Write a query to find all products with low stock (e.g., less than 10 items).•	Write a query to find all products with low stock (e.g., less than 10 items).
select * from products where stock<10;

-- Write a sql query to find the amount spent by a specific customer
select * from products; 

update products set purchased_by = 2 where productid = 4; 
update products set purchased_by = 1 where productid = 2;

Select sum(price) from products where purchased_by = 2; 

-- Write a sql query to find the amount spent by each customer
select purchased_by, sum(price) as totalspent from products group by purchased_by; 


-- Selecting customer name and their total spent using grouping
select c.FirstName, sum(price) from Customers c
inner join products p
on c.CustomerID = p.purchased_by
group by c.Firstname;