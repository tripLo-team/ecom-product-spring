create table Category (
Category_id int primary key,
Category_name varchar(100),
description varchar(100)
);


create table Products  (
Product_id int primary key,
Prouct_name varchar(50),
Product_description varchar(100),
Unit_price int,
Units_In_Stock int,
Units_On_Order int,
Category_id int,
 foreign key(category_id) references Category(Category_id)
);

create table Image (
id int primary key,
Path varchar(100),
Product_id int not null,
FOREIGN KEY (Product_id) REFERENCES Products(Product_id)
);
