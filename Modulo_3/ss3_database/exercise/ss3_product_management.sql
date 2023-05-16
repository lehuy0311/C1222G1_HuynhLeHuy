create database ss3_product_management;
use ss3_product_management;

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
    order_so_luong int,
    primary key(id_order, id_product),
    foreign key (id_order) references `order`(id_order),
    foreign key (id_product) references product(id_product)
);

insert into customer (name_customer, age)
values	("Minh Quan", 10),
		("Ngoc Oanh", 20),
		("Hong Ha", 50);
      
insert into `order` (id_customer, order_date, total_price)
values (1, '2006-03-21', null),
	   (2, '2006-03-23', null),
	   (1, '2006-03-16', null);

insert into product (name_product, price)
values  ("May Giat", 3), 
		("Tu Lanh", 5), 
		("Dieu Hoa", 7), 
		("Quat", 1), 
		("Bep Dien", 2);
        
insert into order_detail (id_order, id_product, order_so_luong)
values 	(1,1,3),
		(1,3,7),
		(1,4,2),
		(2,1,1),
		(3,1,8),
		(2,5,4), 
		(2,3,3);
        
select id_order, order_date, total_price
from `order`;

select c.id_customer, c.name_customer , p.name_product, o.order_date
from customer c
join `order` o
on c.id_customer = o.id_customer
join order_detail od
on o.id_order = od.id_order
join product p
on od.id_product = p.id_product;

select c.id_customer, c.name_customer
from customer c
left join `order` o 
on c.id_customer = o.id_customer
where o.id_customer is null;

select o.id_order, o.order_date, sum(od.order_so_luong*p.price) as total_price 
from `order` o
join order_detail od
on od.id_order = o.id_order
join product p
on od.id_product = p.id_product
group by o.id_order;

