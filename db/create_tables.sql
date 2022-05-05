CREATE DATABASE grading_platform;
USE grading_platform;

CREATE TABLE Course
(id INT NOT NULL,
name VARCHAR(255) NOT NULL,
syllabus VARCHAR(255) NOT NULL,
year INT NOT NULL,
semester INT NOT NULL,
primary key(id)
);

CREATE TABLE Student
(id INT NOT NULL,
name VARCHAR(255) NOT NULL,
year_of_registration INT NOT NULL,
semester INT NOT NULL,
primary key(id)
);

CREATE TABLE Enrolled
(idS INT NOT NULL,
 idC INT NOT NULL,
 project_grade FLOAT NOT NULL,
 final_exam_grade FLOAT NOT NULL,
 foreign key(idS) REFERENCES Student(id) ON DELETE CASCADE ,	 
 foreign key(idC) REFERENCES Course(id) ON DELETE CASCADE 	
);
