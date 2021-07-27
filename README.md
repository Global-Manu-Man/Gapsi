
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: spring boot, gradle, jdk 1.8
-- ------------------------------------------------------
-- Server version	8.0.0-dmr-log

-- Create user and password
    
    mysql> create user 'root'@'%' identified by 'root';
    Query OK, 0 rows affected (0.02 sec)

-- Show users
    
    mysql> show grants for 'root';
    +----------------------------------+
    | Grants for root@%                |
    +----------------------------------+
    | GRANT USAGE ON *.* TO `root`@`%` |
    +----------------------------------+
    1 row in set (0.00 sec)

-- Validate all users; 
    
    mysql> select user FROM mysql.user;
     +------------------+
     | user             |
     +------------------+
     | global           |
     | java             |
     | security         |
     | store            |
     | mysql.infoschema |
     | mysql.session    |
     | mysql.sys        |
     | root             |
     +------------------+
     9 rows in set (0.00 sec)
    
-- Gives all privileges to the new user on the newly create database.    

    
    mysql> grant all on users.* to 'root'@'%';
    Query OK, 0 rows affected (0.02 sec)
    
-- Create database bd_store;
    
    mysql> create database bd_store; -- Create database bdstore;
    Query OK, 1 row affected (0.01 sec)
    
-- User database bdstore.      
    
    mysql> USE bd_store; -- User database bdstore.
    Database changed
    


-- Delete in table bd_store.

    drop table  if exists `bd_store`; 

-- Create table store;    
    
    create table store (   
    id bigint(10) not null auto_increment,
    name varchar(30) not null,
    description varchar(30) not null,
    rate varchar(30) not null,
    model varchar(30) null,
    primary key (id)
    );
    
-- Insert data into store table

    insert into `store` (`name`, `description`, `rate`, `model`) VALUES ( 'Producto1', 'descripcion', '12', 'modelo');
    insert into `store` (`name`, `description`, `rate`, `model`) VALUES ( 'Producto2', 'descripcion', '4',  'modelo');
    

-- consult table store;
   
    mysql> select * from store;
   
    +----+-----------+-------------+------+----------+
    | id | name      | description | rate | model    |
    +----+-----------+-------------+------+----------+
    |  1 | Producto1 | descripcion | 12   | modelo y |
    |  2 | Producto2 | descripcion | 4    | modelo x |
    +----+-----------+-------------+------+----------+
    2 rows in set (0.00 sec)
    
    
    ![image](https://user-images.githubusercontent.com/84020431/127106515-59aa897f-c55d-4d5a-8af9-a463e59de5f5.png)

    
    
    
