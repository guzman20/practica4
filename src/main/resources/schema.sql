use springboot_hibernate;

drop table if exists Producto;

drop database if exists springboot_hibernate;
create database springboot_hibernate;

use springboot_hibernate;

CREATE TABLE Producto
(
   id_producto BIGINT NOT NULL AUTO_INCREMENT,
   titulo VARCHAR (40) NOT NULL,
   descripcion VARCHAR (40) NOT NULL,
   precio DOUBLE,
   descuento DOUBLE,
   PRIMARY KEY (id_producto)
);