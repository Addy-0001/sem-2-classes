Create database schoolworksprodb;

use schoolworksprodb; 

Create table Student(
Id int primary key,
Name varchar(255), 
PhoneNumber bigint, 
Address varchar(255),
DateCreated datetime,
CreatedBy nvarchar(255)
)

desc Student; 