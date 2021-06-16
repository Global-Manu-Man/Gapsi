
use bd_gapsi; -- use database bd_gapsi;

create table if not exists STORE -- create table store;
(
 id int(10) primary key not null,
 name varchar (20),
 description Varchar (200),
 rate int(2),
 model varchar(10)
);

commit;