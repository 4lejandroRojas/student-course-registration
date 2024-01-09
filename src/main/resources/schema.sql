 -- Adress
 DROP TABLE IF EXISTS address;
 CREATE TABLE address (
   id int NOT NULL AUTO_INCREMENT,
   street varchar(100) NOT NULL,
   city varchar(45) NOT NULL,
   PRIMARY KEY (id)
 );

 -- Table student
  DROP TABLE IF EXISTS student;
  CREATE TABLE student (
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) DEFAULT NULL,
    email varchar(30) DEFAULT NULL,
    address_id int DEFAULT NULL,
    PRIMARY KEY (id)
  );

  --Table subject
   DROP TABLE IF EXISTS subject;
   CREATE TABLE subject (
     id int NOT NULL AUTO_INCREMENT,
     subject_name varchar(45) DEFAULT NULL,
     marks int DEFAULT NULL,
     student_id int DEFAULT NULL,
     PRIMARY KEY (id)
   );