Create Database Ecommerce;
use Ecommerce; 

create table Customer(
	CustomerID int primary key,
    CustomerName varchar(255),
    Address varchar(255),
    phoneNo int
);

desc Customer;

create table ProdOrder(
	OrderID int primary key,
    OrderDate varchar(255),
    Descr varchar(255),
    CustomerID int,
    OrderCore int    
);

alter table ProdOrder modify OrderID int unique; 
desc ProdOrder; 

alter table ProdOrder modify OrderCore int unique; 

alter table ProdOrder modify CustomerID foreign key References Customer(CustomerID); 