create database ss5_products;
use ss5_products;

create table products(
	id int primary key auto_increment,
    product_code int not null,
    product_name varchar(50) not null,
    product_price int,
    product_amount int ,
    product_description varchar(50),
    product_status varchar(50)
);

insert into products(product_code, product_name, product_price, product_amount, product_description, product_status)
 values (1, 'laptop', 2000, 2, 'black', 'new'),
		(2, 'book', 4000, 3, 'blue', 'new'),
		(3, 'note', 1000, 4, 'red', 'old'),
		(2, 'smartphone', 10000, 8, 'black', 'new'),
		(5, 'pen', 5000, 1, 'diamond', 'old');
-- indexes 
explain select product_code, product_name, product_price from products where product_code = 2;
-- create unique index u_index_products
-- on products (product_code);
explain select product_code, product_name, product_price from products where product_code = 2;
explain select product_code, product_name, product_price from products where product_name = 'smartphone' or product_price = '1000';
create index index_products 
on products (product_name, product_price);
explain select product_code, product_name, product_price from products where product_name = 'smartphone' or product_price = '1000';

-- view
create view view_product (product_code, product_name, product_price, product_status) as
select product_code, product_name, product_price, product_status
from products;

create or replace view view_product as
select product_code, product_name, product_price, product_amount, product_description, product_status
from products
where product_name = 'smartphone';
select * from view_product;
drop view view_product;

 -- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
 delimiter //
	create procedure get_product()
    begin
    select * from products;
    end
 // delimiter ;
 call get_product();
 
 -- Tạo store procedure thêm một sản phẩm mới
 delimiter //
	create procedure add_product()
    begin
    insert into products(product_code, 
    product_name, 
    product_price, 
    product_amount, 
    product_description, 
    product_status)
    value (7, 'ruler', 15000, 1, 'straight', 'new');
    end
 // delimiter ;
 call add_product();
 
 -- Tạo store procedure sửa thông tin sản phẩm theo id
 delimiter //
	create procedure edit_product()
    begin
    set sql_safe_updates = 0;
    update products
    set product_description = 'green'
    where id = 4;
    set sql_safe_updates = 1;
    end
 // delimiter ;
 call edit_product();
 
-- Tạo store procedure xoá sản phẩm theo id
 delimiter //
	create procedure delete_product()
    begin
    set sql_safe_updates = 0;
    delete from products
    where id = 4;
    set sql_safe_updates = 1;
    end
 // delimiter ;
 call delete_product();