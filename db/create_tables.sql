CREATE DATABASE grading_platform;
USE grading_platform;

CREATE TABLE course
(id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
syllabus VARCHAR(255) NOT NULL,
year INT NOT NULL,
semester INT NOT NULL,
primary key(id)
);

CREATE TABLE student_registration
(id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
year_of_registration INT NOT NULL,
semester INT NOT NULL,
primary key(id)
);

CREATE TABLE enrolled
(idS INT NOT NULL,
 idC INT NOT NULL,
 project_grade FLOAT NOT NULL,
 final_exam_grade FLOAT NOT NULL,
 foreign key(idS) REFERENCES Student(id) ON DELETE CASCADE ,	 
 foreign key(idC) REFERENCES Course(id) ON DELETE CASCADE 	
);
