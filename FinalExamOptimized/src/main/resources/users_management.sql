DROP DATABASE IF EXISTS users_management;
CREATE DATABASE users_management;
USE users_management;

CREATE TABLE users (
	PRIMARY KEY (id),
    id INT UNSIGNED AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    pass VARCHAR(12),
    user_role ENUM("ADMIN", "EMPLOYEE") NOT NULL,
    exp_in_year TINYINT,
    pro_skill VARCHAR(50)
);

INSERT INTO users(full_name,email,pass,user_role,exp_in_year,pro_skill)
VALUES
("Lê Văn Hải 1", "hai1@gmail.com","Hai0001", "ADMIN",3,NULL),
("Lê Văn Hải 2", "hai2@gmail.com","Hai0002", "EMPLOYEE",NULL,"Java"),
("Lê Văn Hải 3", "hai3@gmail.com","Hai0003", "EMPLOYEE",NULL,"MySQL"),
("Lê Văn Hải 4", "hai4@gmail.com","Hai0004", "EMPLOYEE",NULL,"Python"),
("Lê Văn Hải 5", "hai5@gmail.com","Hai0005", "ADMIN",2,NULL);
