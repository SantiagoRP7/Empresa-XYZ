drop table if exists users;
drop table if exists client;
drop table if exists product;
drop table if exists orders;
drop table if exists order_product;

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


CREATE TABLE orders(
    idOrder serial primary key,
    dateOrder date,
    idClient int not null,
    constraint fk_order_client
        foreign key(idClient)
            references client(idClient)
);

INSERT INTO orders (dateOrder, idClient) VALUES ('2021-11-24', 1), ('2021-11-24', 2);

--Esta tabla relaciona pedido y producto de forma muchos a muchos
CREATE TABLE orders_product(
    idOrder int,
    idProduct int,
    cantityProduct int,
    primary key(idOrder, idProduct),
    constraint fk_order_m2m
        foreign key(idOrder)
            references orders(idOrder),
    constraint fk_product_m2m
        foreign key(idProduct)
            references product(idProduct)
);

INSERT INTO orders_product(idOrder,idProduct,cantityProduct) VALUES (1,1,2),(1,2,3),(2,3,4),(2,2,3);