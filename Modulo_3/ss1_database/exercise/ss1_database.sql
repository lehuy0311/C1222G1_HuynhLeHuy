create database ss1_student;
use ss1_student;
create table class(
    id_class int primary key,
    name_class varchar(45)
);
create table teacher(
    id_teacher int primary key,
    name_teacher varchar(45),
    age_teacher int,
    country varchar(45)
);