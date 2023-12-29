Create database LibrarySystem;

use LibrarySystem; 

Create table Book
(
	BookID int primary key not null,
	Title varchar(255),
	Author varchar(255), BookID
	PublishedYear int, 
	Genre varchar(255)
);

desc Book;

Create table Members(
	MemberId int primary key not null, 
    FirstName varchar(255),
    LastName varchar(255),
    Email varchar(255), 
    PhoneNumber varchar(10)
);

desc Members; 

alter table Members modify Email varchar(255) not null; 

ALTER TABLE Members ADD unique(MemberID);

