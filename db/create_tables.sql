CREATE DATABASE grading_platform;
USE grading_platform;

CREATE TABLE Course
([id] [int] not null,
[name] [varchar](255) not null,
[syllabus] [varchar](255)not null,
[year] [int] not null,
[semester] [int] not null,
primary key(id)
);

CREATE TABLE Students
([id] [int] not null,
[name] [varchar](255) not null,
[year of registration] [int] not null,
[semester] [int] not null,
primary key(id),
);

CREATE TABLE Enrolled
([idS] [int] not null,
 [idC] [int] not null,
 [Project Grade] [int] not null,
 [Student Grade] [int] not null,
 foreign key(idS) references Students(id) ON DELETE CASCADE ,	--LEFT TO DELETE 
 foreign key(idC) references Curse(id) ON DELETE CASCADE ,	--LEFT TO DELETE 
);
