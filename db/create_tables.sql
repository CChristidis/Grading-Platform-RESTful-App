CREATE DATABASE grading_platform;
USE grading_platform;

CREATE TABLE course
(id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
syllabus VARCHAR(255) NOT NULL,
instructor_login VARCHAR(255) NOT NULL, 
year INT NOT NULL,
semester INT NOT NULL,
primary key(id)
);

CREATE TABLE student_registration
(
id INT NOT NULL AUTO_INCREMENT,
idC INT NOT NULL,
name VARCHAR(255) NOT NULL,
year_of_registration INT NOT NULL,
semester INT NOT NULL,
foreign key(idC) REFERENCES course(id) ON DELETE CASCADE,
primary key(idC, id)
);

INSERT INTO `course` VALUES 
	(1,'course1','syllabus','leslie@luv2code.com', 2022, 5),
	(2,'course2','syllabus','emma@luv2code.com', 2022, 5),
	(3,'course3','syllabus','avani@luv2code.com', 2022, 5);
  
INSERT INTO `student_registration` VALUES 
	(1, 1,'christos', 2021,5),
	(2, 2,'nikos',1993,5),
	(3, 3,'giannhs',1994, 5);
  




