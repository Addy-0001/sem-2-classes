create database PaschimanchalSchool;
use paschimanchalschool;

create table student(
	studentID int primary key not null auto_increment,
    studentFirstName varchar(255) not null,
    studentMiddleName varchar(255) null, 
    studentLastName varchar(255),
    studentDateofBirth date, 
    studentGender varchar(20), 
    entolledDate date, 
    class varchar(10)
);

