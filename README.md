
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

-- See all databases.
   mysql> show databases;
     +--------------------+
     | Database           |
     +--------------------+           |
     | bd_store           |
     | information_schema |
     | locallity          |
     | mysql              |
     | performance_schema |
     | publications       |
     | sys                |
     +--------------------+
7 rows in set (0.01 sec)

    
-- Create database bd_gapsi;
    
    mysql> create database bd_gapsi; -- Create database bd_gapsi;
    Query OK, 1 row affected (0.01 sec)
    
-- User database bd_gapsi.      
    
    mysql> USE bd_gapsi; -- User database bd_gapsi.
    Database changed

-- Create table store;    
    
    create table store (   
    id varchar(100) not null,
    name varchar(255) not null,
    description varchar(255) not null,
    rate varchar(255) not null,
    model varchar(255) null,
    primary key (id)
    );



    mysql> desc store;
     +-------------+--------------+------+-----+---------+-------+
     | Field       | Type         | Null | Key | Default | Extra |
     +-------------+--------------+------+-----+---------+-------+
     | id          | varchar(100) | NO   | PRI | NULL    |       |
     | description | varchar(255) | YES  |     | NULL    |       |
     | model       | varchar(255) | YES  |     | NULL    |       |
     | name        | varchar(255) | YES  |     | NULL    |       |
     | rate        | int          | YES  |     | NULL    |       |
     +-------------+--------------+------+-----+---------+-------+
     5 rows in set (0.01 sec)
    

-- Delete in table bd_store.

    drop table  if exists `store`; 


    
-- Insert data into store table

    insert into `store` (`name`, `description`, `rate`, `model`) VALUES ( 'Producto1', 'descripcion', '12', 'modelo');
    insert into `store` (`name`, `description`, `rate`, `model`) VALUES ( 'Producto2', 'descripcion', '4',  'modelo');



-- consult table store;
   
    mysql> select * from store;

     +--------------------------------------+-------------+-------+------+------+
     | id                                   | description | model | name | rate |
     +--------------------------------------+-------------+-------+------+------+
     | 4beccf9f-c316-40df-8d06-bdd1aa64bfd2 | description | model | name |   12 |
     | 8994946d-d817-4b07-8a62-ff059e45750f | description | model | name |   12 |
     | aaafdff6-7e98-4887-ac86-60ce57d48fea | description | model | name |   12 |
     | b180e4a7-aa7a-42c6-bf12-cf51163bc0fa | description | model | name |   12 |
     | eb743060-3bf5-4da0-94d6-f1cbb2f0a97c | description | model | name |   12 |
     +--------------------------------------+-------------+-------+------+------+
     5 rows in set (0.02 sec)


--API test with Google Chrome.   
    
![image](https://user-images.githubusercontent.com/84020431/127106515-59aa897f-c55d-4d5a-8af9-a463e59de5f5.png)

--API test with Postman

![image](https://user-images.githubusercontent.com/84020431/127107092-c4c2b0cf-995f-4116-a5d9-4256d06de469.png)


    
    
    
