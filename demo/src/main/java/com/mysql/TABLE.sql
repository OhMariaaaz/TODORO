CREATE TABLE Projects(
    id INT PRIMARY KEY AUTO_INCREMENT,
    namev VARCHAR(30) NOT NULL,
    descriptionv VARCHAR(255),
    createdAt DATE,
    updatedAt DATE
)
SELECT * FROM Projects

CREATE TABLE Tasks(
    id INT PRIMARY KEY AUTO_INCREMENT,
    namev VARCHAR(30) NOT NULL,
    descriptionv VARCHAR(90),
    isDone BOOLEAN NOT NULL,
    observation VARCHAR(90),
    createAt DATE,
    updatedAt DATE,
    deadLine DATE,
    idProject INT NOT NULL,
    FOREIGN KEY (idProject) REFERENCES Projects(id)
)
SELECT * FROM Tasks