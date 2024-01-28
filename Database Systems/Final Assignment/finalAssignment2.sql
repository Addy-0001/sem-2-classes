create database school; 
use school;
CREATE TABLE Address (id INTEGER NOT NULL PRIMARY KEY, State varchar(255), District varchar(255) NOT NULL, Municipality varchar(255) NOT NULL, ward integer(2) NOT NULL);
CREATE TABLE Attendance (StudentstudentID integer(10) NOT NULL, SubjectsubjectID integer(10) NOT NULL, recordedDate date NOT NULL, presentStatus boolean NOT NULL, PRIMARY KEY (StudentstudentID, SubjectsubjectID), FOREIGN KEY(SubjectsubjectID) REFERENCES Subject(subjectID), FOREIGN KEY(StudentstudentID) REFERENCES Student(studentID));
CREATE TABLE Event (eventName integer(10) NOT NULL, eventDate date NOT NULL, Addressid integer(10) NOT NULL, FOREIGN KEY(Addressid) REFERENCES Address(id));
CREATE TABLE ExamResult (SubjectsubjectID integer(10) NOT NULL, StudentstudentID integer(10) NOT NULL, studentMarks integer(3) NOT NULL, examDate date NOT NULL, FOREIGN KEY(SubjectsubjectID) REFERENCES Subject(subjectID), FOREIGN KEY(StudentstudentID) REFERENCES Student(studentID));
CREATE TABLE Fees (Class varchar(10) NOT NULL, amount integer(10) NOT NULL, PRIMARY KEY (Class));
CREATE TABLE Guardian (guardianID INTEGER NOT NULL PRIMARY KEY, gurdainFirstName varchar(255) NOT NULL, gurdainMiddleName varchar(255), gurdainLastName varchar(255) NOT NULL, contactNumber integer(20) NOT NULL);
CREATE TABLE Guardian_Student (GuardianguardianID integer(10) NOT NULL, StudentstudentID integer(10) NOT NULL, PRIMARY KEY (GuardianguardianID, StudentstudentID), FOREIGN KEY(GuardianguardianID) REFERENCES Guardian(guardianID), FOREIGN KEY(StudentstudentID) REFERENCES Student(studentID));
CREATE TABLE Library (bookId INTEGER NOT NULL PRIMARY KEY, authorName integer(255) NOT NULL, bookTitle varchar(255) NOT NULL);
CREATE TABLE Library_Student (LibrarybookId integer(10) NOT NULL, StudentstudentID integer(10) NOT NULL, issueDate date NOT NULL, returnDate date NOT NULL, PRIMARY KEY (LibrarybookId, StudentstudentID), FOREIGN KEY(LibrarybookId) REFERENCES Library(bookId), FOREIGN KEY(StudentstudentID) REFERENCES Student(studentID));
CREATE TABLE Student (studentID INTEGER NOT NULL PRIMARY KEY, studentFirstName varchar(255) NOT NULL, studentMiddleName varchar(255), studentLastName varchar(255) NOT NULL, dateOfBirth date NOT NULL, gender varchar(10) NOT NULL, enrolledDate date NOT NULL, class varchar(20), Addressid integer(10) NOT NULL, FOREIGN KEY(Addressid) REFERENCES Address(id));
CREATE TABLE Subject (subjectID INTEGER NOT NULL PRIMARY KEY, subjectName varchar(255), subjectClass integer(10));
CREATE TABLE Teacher (teacherID INTEGER NOT NULL PRIMARY KEY, teacherFirstName varchar(255) NOT NULL, teacherMiddleName varchar(255), teacherLastName varchar(255) NOT NULL, gender varchar(10) NOT NULL, dateOfBirth date NOT NULL, contactNumber integer(20) NOT NULL, salary integer(10) NOT NULL, Addressid integer(10) NOT NULL, FOREIGN KEY(Addressid) REFERENCES Address(id));
CREATE TABLE Teacher_Subject (TeacherteacherID integer(10) NOT NULL, SubjectsubjectID integer(10) NOT NULL, PRIMARY KEY (TeacherteacherID, SubjectsubjectID), FOREIGN KEY(SubjectsubjectID) REFERENCES Subject(subjectID), FOREIGN KEY(TeacherteacherID) REFERENCES Teacher(teacherID));
CREATE TABLE temp_payment (FeesClassNumber varchar(10) NOT NULL, StudentstudentID integer(10) NOT NULL, paymentDate date NOT NULL, PRIMARY KEY (FeesClassNumber, StudentstudentID), FOREIGN KEY(FeesClassNumber) REFERENCES Fees(Class), FOREIGN KEY(StudentstudentID) REFERENCES Student(studentID));

-- Insert data into the Address table
INSERT INTO Address (id, State, District, Municipality, ward) VALUES
(1, 'State1', 'District1', 'Municipality1', 1),
(2, 'State2', 'District2', 'Municipality2', 2);

-- Insert data into the Attendance table
INSERT INTO Attendance (StudentstudentID, SubjectsubjectID, recordedDate, presentStatus) VALUES
(1, 1, '2024-01-28', true),
(2, 2, '2024-01-28', false);

-- Insert data into the Event table
INSERT INTO Event (eventName, eventDate, Addressid) VALUES
(1, '2024-02-15', 1),
(2, '2024-03-20', 2);

-- Insert data into the ExamResult table
INSERT INTO ExamResult (SubjectsubjectID, StudentstudentID, studentMarks, examDate) VALUES
(1, 1, 85, '2024-01-20'),
(2, 2, 90, '2024-01-22');

-- Insert data into the Fees table
INSERT INTO Fees (Class, amount) VALUES
('Class1', 5000),
('Class2', 6000);

-- Insert data into the Guardian table
INSERT INTO Guardian (guardianID, gurdainFirstName, gurdainMiddleName, gurdainLastName, contactNumber) VALUES
(1, 'John', 'A', 'Doe', 1234567890),
(2, 'Jane', 'B', 'Smith', 543210);

-- Insert data into the Guardian_Student table
INSERT INTO Guardian_Student (GuardianguardianID, StudentstudentID) VALUES
(1, 1),
(2, 2);

ALTER TABLE Library
MODIFY COLUMN authorName VARCHAR(255);

-- Insert data into the Library table
INSERT INTO Library (bookId, authorName, bookTitle) VALUES
(1, 'Author1', 'Book1'),
(2, 'Author2', 'Book2');

-- Insert data into the Library_Student table
INSERT INTO Library_Student (LibrarybookId, StudentstudentID, issueDate, returnDate) VALUES
(1, 1, '2024-01-25', '2024-02-10'),
(2, 2, '2024-01-28', '2024-02-15');

-- Insert data into the Student table
INSERT INTO Student (studentID, studentFirstName, studentMiddleName, studentLastName, dateOfBirth, gender, enrolledDate, class, Addressid) VALUES
(1, 'Student1', 'A', 'Lastname1', '2000-01-01', 'Male', '2024-01-01', 'Class1', 1),
(2, 'Student2', 'B', 'Lastname2', '2001-02-02', 'Female', '2024-01-01', 'Class2', 2);

-- Insert data into the Subject table
INSERT INTO Subject (subjectID, subjectName, subjectClass) VALUES
(1, 'Subject1', 10),
(2, 'Subject2', 11);

-- Insert data into the Teacher table
INSERT INTO Teacher (teacherID, teacherFirstName, teacherMiddleName, teacherLastName, gender, dateOfBirth, contactNumber, salary, Addressid) VALUES
(1, 'Teacher1', 'A', 'Lastname1', 'Male', '1980-01-01', 1234567890, 50000, 1),
(2, 'Teacher2', 'B', 'Lastname2', 'Female', '1985-02-02', 543210, 60000, 2);

-- Insert data into the Teacher_Subject table
INSERT INTO Teacher_Subject (TeacherteacherID, SubjectsubjectID) VALUES
(1, 1),
(2, 2);

-- Insert data into the temp_payment table
INSERT INTO temp_payment (FeesClassNumber, StudentstudentID, paymentDate) VALUES
('Class1', 1, '2024-01-30'),
('Class2', 2, '2024-02-05');

UPDATE Fees
SET amount = amount * 1.2
WHERE Class = "*";


DELETE FROM Attendance
WHERE presentStatus = false
  AND recordedDate <= CURRENT_DATE - INTERVAL 10 DAY;
  
-- Step 1: Insert into the Address table (if necessary)
INSERT INTO Address (State, District, Municipality, ward) 
VALUES ('StateX', 'DistrictX', 'MunicipalityX', 3);

-- Step 2: Insert into the Student table
INSERT INTO Student (studentFirstName, studentMiddleName, studentLastName, dateOfBirth, gender, enrolledDate, class, Addressid)
VALUES ('NewStudent', 'Middle', 'LastName', '2005-01-01', 'Male', '2024-01-28', 'ClassX', LAST_INSERT_ID());

-- Step 3: Insert into the Guardian table (if necessary)
INSERT INTO Guardian (gurdainFirstName, gurdainMiddleName, gurdainLastName, contactNumber)
VALUES ('GuardianFirstName', 'GuardianMiddle', 'GuardianLastName', 1234567890);

-- Step 4: Insert into the Guardian_Student table
INSERT INTO Guardian_Student (GuardianguardianID, StudentstudentID)
VALUES (LAST_INSERT_ID(), LAST_INSERT_ID());

-- Step 5: Insert into the Fees table
INSERT INTO Fees (Class, amount)
VALUES ('ClassX', 7000);  -- Adjust the amount as needed

-- Step 6: Insert into the temp_payment table (for fees payment history)
INSERT INTO temp_payment (FeesClassNumber, StudentstudentID, paymentDate)
VALUES ('ClassX', LAST_INSERT_ID(), '2024-01-28');



SELECT
    S.studentID,
    S.studentFirstName,
    S.studentMiddleName,
    S.studentLastName,
    SUM(ER.studentMarks) AS totalMarks,
    ROUND(AVG(ER.studentMarks), 2) AS averageMarks,
    CONCAT(ROUND((SUM(ER.studentMarks) / (COUNT(DISTINCT ER.SubjectsubjectID) * 100)) * 100, 2), '%') AS overallPercentage
FROM
    Student S
JOIN
    ExamResult ER ON S.studentID = ER.StudentstudentID
GROUP BY
    S.studentID, S.studentFirstName, S.studentMiddleName, S.studentLastName
ORDER BY
    overallPercentage DESC;


-- Start a transaction
START TRANSACTION;

-- Update marks in ExamResult table deducting 10%
UPDATE ExamResult
SET studentMarks = ROUND(studentMarks * 0.9, 2);

-- Commit the transaction
COMMIT;


-- Assuming MySQL database syntax and using placeholders for actual values

SELECT
    S.studentID,
    S.studentFirstName,
    S.studentLastName,
    Su.subjectName,
    ER.studentMarks,
    TS.TeacherteacherID,
    T.teacherFirstName,
    T.teacherLastName
FROM
    Student S
JOIN
    ExamResult ER ON S.studentID = ER.StudentstudentID
JOIN
    Subject Su ON ER.SubjectsubjectID = Su.subjectID
JOIN
    Teacher_Subject TS ON Su.subjectID = TS.SubjectsubjectID
JOIN
    Teacher T ON TS.TeacherteacherID = T.teacherID
WHERE
    ER.examDate >= '2023-01-01'  -- Filter by exam date
    AND ER.examDate <= '2023-12-31'
    AND S.class = 'ClassX'  -- Filter by class
    AND Su.subjectClass = 10  -- Filter by subject class
ORDER BY
    S.studentLastName, Su.subjectName;
