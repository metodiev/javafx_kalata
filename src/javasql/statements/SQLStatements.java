create database hotel;

use  hotel;



create table person(
first_name varchar(255),
last_name varchar(255),
email_address varchar(255)
);


insert into person values('Firsname', 'Lastanem', 'Lastaneme2Mail.com');

select * From person;


create table hotel_form(
client_code int(11),
client_status varchar(255),
checkIn varchar(255),
checkOut  varchar(255),
nights int(10),
rooms int(11),
car bool,
clientBookTime varchar(255),
pay_method varchar(255),
card_number varchar(255),
security_code varchar(255),
exparation_date varchar(255),
invoice_number varchar(255),
totalpay double(16,2),
paid double(15,2),
title varchar(255),
firstName varchar(255),
middleName varchar(255),
lastName varchar(255),
companyName varchar(255),
adress1 varchar(255),
adress2 varchar(255),
country varchar(255),
phone varchar(255),
email varchar(255)
);

insert into hotel_form values (15, 'deleted', 'no Checked in', 'no ckeck out', 2, 2, true, 'no client book time', 'Master Card', '5151515', 'sec151', '2016', 
'151515', 22.44, 22.44, 'Title name', 'First name', 'middle name ', 'last name', 'company Name', 'address1', 'address2', 'Bulgaria', '088888888', 'mail@mail.com' );