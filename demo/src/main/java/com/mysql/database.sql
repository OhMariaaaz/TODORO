CREATE DATABASE TODORO
USE TODORO

CREATE TABLE Projects(
    id INT PRIMARY KEY AUTO_INCREMENT,
    namev VARCHAR(30) NOT NULL,
    descriptionv VARCHAR(255),
    createdAt DATE NOT NULL,
    updatedAt DATE NOT NULL

)
SELECT * FROM Projects

CREATE TABLE Tasks(
    id INT PRIMARY KEY AUTO_INCREMENT,
    namev VARCHAR(30) NOT NULL,
    descriptionv VARCHAR(90) NOT NULL,
    isDone BOOLEAN NOT NULL,
    observation VARCHAR(90) NOT NULL,
    createAt DATE NOT NULL,
    updatedAt DATE NOT NULL,
    deadLine DATE NOT NULL,
    idProject INT NOT NULL,
    FOREIGN KEY (idProject) REFERENCES Projects(id)
)
SELECT * FROM Tasks