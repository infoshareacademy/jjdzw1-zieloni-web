/*docker run -it -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 -d mysql*/

CREATE SCHEMA zus;

CREATE TABLE users (
  id int PRIMARY KEY AUTO_INCREMENT,
  login VARCHAR(100) UNIQUE NOT NULL ,
  password VARCHAR(100) NOT NULL ,
  imie VARCHAR(100),
  nazwisko VARCHAR(100),
  email VARCHAR(100) UNIQUE NOT NULL,
  idUserType INT NOT NULL ,
  idStatus INT NOT NULL,
  insertDate DATETIME,
  insertUser VARCHAR(100),
  updateDate DATETIME,
  updateUser VARCHAR(100)
);

CREATE TABLE _usersTypes(
  id int PRIMARY KEY NOT NULL ,
  description VARCHAR(100)
);
INSERT into _usersTypes VALUES
  (1, "customer"),
  (2, "service men"),
  (3, "admin");

CREATE TABLE _statuses(
  id int PRIMARY KEY NOT NULL ,
  description VARCHAR(100)
);
INSERT into _statuses VALUES
  (1, "active"),
  (2, "inactive"),
  (3, "in progress"),
  (4, "done"),
  (5, "cancel");

CREATE TABLE orders
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  idUser INT NOT NULL ,
  parts VARCHAR(8000),
  address VARCHAR(8000),
  idStatus INT NOT NULL,
  insertDate DATETIME,
  insertUser VARCHAR(100),
  updateDate DATETIME,
  updateUser VARCHAR(100)
);

insert  into users
  (login, password, imie, nazwisko, email, idUserType, idStatus)
values
  ('mbielecki', 'test', 'Marcin', 'Bielecki', 'bieleckim80@gmail.com', 1, 1)
;

select * from users;

insert into orders
  (idUser, parts, address, idStatus)
values
  (1, 'Fiat Bravo 2008 1.4 t-jet filtr oleju benzyna 0022331', 'ul. Prosta 3, 00-003 Warszawa', 1)
;

select * from orders;