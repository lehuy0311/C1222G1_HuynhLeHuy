create database ss2_product;
use ss2_product;

create table customer(
	id_customer int primary key auto_increment,
    name_customer varchar(50),
    age int
);

create table `order`(
	id_order int primary key auto_increment,
    id_customer int,
    order_date date,
    total_price float,
    foreign key (id_customer) references customer(id_customer) 
);

create table product(
	id_product int primary key auto_increment,
    name_product varchar(50),
    price float 
);

create table order_detail(
	id_order int,
    id_product int,
    order_so_luong varchar(100),
    primary key(id_order, id_product),
    foreign key (id_order) references `order`(id_order),
    foreign key (id_product) references product(id_product)
);
