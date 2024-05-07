
![Logo](https://locallity-logos.s3.us-west-1.amazonaws.com/icon-blue.png)


## Pakal Technological Solutions

We transform ideas into exceptional digital experiences. Your user-centered web design and development hub.



## Table of Contents


 - [Instructions to download project Github ](https://github.com/Global-Manu-Man/Gapsi.git)


-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: spring boot, gradle, jdk 1.8
-- ------------------------------------------------------
-- Server version	8.0.0-dmr-log

-- Create user and password
    
    mysql> create user 'root'@'%' identified by 'root';
    Query OK, 0 rows affected (0.02 sec)

-- Show users
```bash     
    mysql> show grants for 'root';
    +----------------------------------+
    | Grants for root@%                |
    +----------------------------------+
    | GRANT USAGE ON *.* TO `root`@`%` |
    +----------------------------------+
    1 row in set (0.00 sec)
```
-- Validate all users; 
```bash    
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
```    
-- Gives all privileges to the new user on the newly create database.    

    
    mysql> grant all on users.* to 'root'@'%';
    Query OK, 0 rows affected (0.02 sec)

-- See all databases.

```bash
   mysql> show databases;

    +--------------------+
     | Database           |
     +--------------------+
     | bd_gapsi           |
     | bd_store           |
     | information_schema |
     | locallity          |
     | mysql              |
     | performance_schema |
     | publications       |
     | sys                |
     +--------------------+
     8 rows in set (0.00 sec)
```
    
-- Create database bd_gapsi;
    
    mysql> create database bd_gapsi; -- Create database bd_gapsi;
    Query OK, 1 row affected (0.01 sec)
    
-- User database bd_gapsi.      
    
    mysql> USE bd_gapsi; -- User database bd_gapsi.
    Database changed

-- Create table store;

```bash

    create table store (   
    id varchar(100) not null,
    name varchar(255) not null,
    description varchar(255) not null,
    rate varchar(255) not null,
    model varchar(255) null,
    primary key (id)
    );
```

-- Show the details of the table.

```bash
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
```    

-- Delete in table bd_store.
```bash

    drop table  if exists `store`; 

``` 
    
-- Insert data into store table

```bash

    insert into `store` (`name`, `description`, `rate`, `model`) VALUES ( 'Producto1', 'descripcion', 12, 'modelo');
    insert into `store` (`name`, `description`, `rate`, `model`) VALUES ( 'Producto2', 'descripcion', 12,  'modelo');


``` 

-- consult table store;
```bash

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

``` 
--API test with Google Chrome.   
    


![Logo](https://locallity-logos.s3.us-west-1.amazonaws.com/Screenshot_1.png)
![Logo](https://locallity-logos.s3.us-west-1.amazonaws.com/Screenshot_2.png)
![Logo](https://locallity-logos.s3.us-west-1.amazonaws.com/Screenshot_3.png)
![Logo](https://locallity-logos.s3.us-west-1.amazonaws.com/Screenshot_4.png)
    
    
    


