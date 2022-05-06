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
name VARCHAR(255) NOT NULL,
year_of_registration INT NOT NULL,
semester INT NOT NULL,
foreign key(idC) REFERENCES course(id) ON DELETE CASCADE 	
);
