DROP TABLE IF EXISTS employee;
 
CREATE TABLE employee (
  employee_id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  dob VARCHAR(250) NOT NULL
  department VARCHAR(250) NOT NULL,
  gender VARCHAR(4) DEFAULT NULL
);
  
  INSERT INTO practice.employee
(employee_id,
department,
dob,
first_name,
gender,
last_name)
VALUES
(1,'Civil','1991-11-06','Sooraj','M','Bhat');
