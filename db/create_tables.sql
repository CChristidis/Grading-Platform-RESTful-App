CREATE DATABASE grading_platform;
USE grading_platform;

DROP TABLE IF EXISTS `student_registration`;
DROP TABLE IF EXISTS `course`;
DROP TABLE IF EXISTS `authorities`;
DROP TABLE IF EXISTS `users`;


CREATE TABLE course
(id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
syllabus VARCHAR(255) NOT NULL,
instructor_login VARCHAR(255) NOT NULL, 
year INT NOT NULL,
semester INT NOT NULL,
primary key(id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;;

CREATE TABLE student_registration
(
id INT NOT NULL AUTO_INCREMENT,
idC INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
year_of_registration INT NOT NULL,
semester INT NOT NULL,
project_grade DOUBLE,
final_exams_grade DOUBLE,
foreign key(idC) REFERENCES course(id) ON DELETE CASCADE,
primary key(id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;;



CREATE TABLE users (
    username varchar(50) not null primary key,
    password varchar(120) not null,
    enabled boolean not null
);

CREATE TABLE authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    foreign key (username) references users (username) ON DELETE CASCADE
);


INSERT INTO users(username, password, enabled)VALUES('christos','heygoodlookin',true);
INSERT INTO users(username, password, enabled)VALUES('makis','whatyougotcookin',true);
 
INSERT INTO authorities(username,authority)VALUES('christos','ROLE_ADMIN');
insert into authorities(username,authority)VALUES('makis','ROLE_USER');

INSERT INTO `course` VALUES 
	(1,'course1','syllabus','leslie@luv2code.com', 2022, 5),
	(2,'course2','syllabus','emma@luv2code.com', 2022, 5),
	(3,'course3','syllabus','avani@luv2code.com', 2022, 5);
  
INSERT INTO `student_registration` VALUES 
	(1, 1,'christos', 2021,5, 0.0, 0.0),
	(2, 2,'nikos',1993,5, 0.0, 0.0),
	(3, 3,'giannhs',1994, 5, 0.0, 0.0);
  




