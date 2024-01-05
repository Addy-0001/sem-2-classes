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

-- Insert at least 5 records into the "Books" table.
INSERT INTO Book(BookID, Title, Author, PublishedYear, Genre)
VALUES
    (1, 'Harry Potter', 'JK Rowling', 2012, 'Fiction'),
    (2, 'The Catcher in the Rye', 'Author', 2015, 'Mystery'),
    (3, 'Dune', 'Author', 2018, 'Science Fiction'),
    (4, 'Gone Girl', 'Author4', 2011, 'Thriller'),
    (5, 'Game of Thrones', 'Author5', 2019, 'Fantasy');
    
    
-- Insert at least 3 records into the "Members" table.
insert into members(MemberID, FirstName, LastName, Email, PhoneNumber)
Values
(1, "Adamya", "Neupane", "adamya@getintoto.com", 98111),
(2, "John", "Doe", "john@doe.com", 19922),
(3, "Jane", "Doe", "jane@doe.com", 12323);


-- Write a SQL query to retrieve the titles of all books published after the year 2010. 
SELECT Title FROM Book WHERE PublishedYear > 2010;

-- Write a SQL query to retrieve the names of all members whose last name starts with 'S'.
SELECT FirstName, LastName FROM Members WHERE LastName LIKE 'S%';

-- Write a SQL query to retrieve the details of a book with a specific BookID.
SELECT * FROM Book WHERE BookID = 2;

-- Write a SQL query to retrieve the number of books in each genre.
SELECT Genre, COUNT(*) AS NumberOfBooks FROM Book GROUP BY Genre;

-- Update the PublishedYear of a specific book.
UPDATE Book SET PublishedYear = 2020 WHERE BookID = 3;

-- Update email address of a specific member
UPDATE Members SET Email = 'new.email@email.com' WHERE MemberID = 1;

-- Delete a book from the Books table
DELETE FROM Book WHERE BookID = 4;

-- Delete a member from the "Members" table.
DELETE FROM members WHERE memberID = 2;

-- Add a new column to the "Books" table to store the availability status of each book.
ALTER TABLE Book ADD COLUMN AvailabilityStatus VARCHAR(20);

UPDATE book SET AvailabilityStatus = "AVAILABLE" where BookID = 1;

Desc book;

Select * from book; 

Select * from book where AvailabilityStatus = "AVAILABLE";

