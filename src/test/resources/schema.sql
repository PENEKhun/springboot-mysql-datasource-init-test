# 1. remove table start
drop table if exists firstTable;
drop table if exists secondTable;
# 1. remove table end


# 2. create table start
create table firstTable
(
    id                   bigint auto_increment
        primary key,
    test_field           bigint               not null
);

create table secondTable
(
    id                   bigint auto_increment
        primary key,
    test_field           bigint               not null
);
# 2. create table end