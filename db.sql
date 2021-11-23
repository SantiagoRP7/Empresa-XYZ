drop table if exists users;
drop table if exists client;
drop table if exists product;


CREATE TABLE users(
    idUser serial primary key,
    username varchar(45),
    firstName varchar(45),
    lastName varchar(45),
    password varchar(45),
    telefono varchar(12)
);


INSERT INTO users(username,firstName,lastName,password,telefono)
 VALUES 
 ('camilo.sanchez', 'Camilo', 'Sanchez', '123456', '315879635'),
 ('josue.rodriguez', 'Josue', 'Rodriguez', '123456', '3165948575');


 CREATE TABLE client(
    idClient serial primary key,
    firstName varchar(45),
    lastName varchar(45),
    email varchar(45),
    phone varchar(12)
);

INSERT INTO client(firstName,lastName,email,phone)
    VALUES
        ('Ismael','Rivera', 'maelo@mail.com', '478598'),
        ('Hector', 'Lavoe', 'lavoe@mail.com', '458796'),
        ('Tito', 'Rodriguez', 'tito@mail.com', '547898');


CREATE TABLE product(
    idProduct serial primary key,
    name varchar(45),
    description varchar(500),
    price decimal(10,2)
);

INSERT INTO product(name, description, price) 
    VALUES
        ('Camisa polo', 'polo color azul', 80000),
        ('Jean', 'pantalon sin rotos', 100000);