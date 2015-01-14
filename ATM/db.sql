DROP DATABASE ATM ;

CREATE DATABASE ATM ;

USE ATM ;

CREATE TABLE Atm (
       last_name	VARCHAR(30) NOT NULL,
       Card			INT NOT NULL,
       Pin			INT NOT NULL
) ;


INSERT INTO Atm VALUES ('ryu in gon',1,42) ;
INSERT INTO Atm VALUES ('kwon hyuk joo',2,1234) ;
