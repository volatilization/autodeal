-- begin AUTODEAL_COUNTRY
create table AUTODEAL_COUNTRY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CODE integer,
    --
    primary key (ID)
)^
-- end AUTODEAL_COUNTRY

-- begin AUTODEAL_COLOR
create table AUTODEAL_COLOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE integer not null,
    --
    primary key (ID)
)^
-- end AUTODEAL_COLOR
-- begin AUTODEAL_MANUFACTURER
create table AUTODEAL_MANUFACTURER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE integer not null,
    COUNTRY_ID uuid,
    --
    primary key (ID)
)^
-- end AUTODEAL_MANUFACTURER
-- begin AUTODEAL_MODEL
create table AUTODEAL_MODEL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MANUFACTURER_ID uuid,
    COMPLECTATION_ID uuid,
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end AUTODEAL_MODEL
-- begin AUTODEAL_CLIENT
create table AUTODEAL_CLIENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ integer,
    INSTANCEID uuid,
    --
    primary key (ID)
)^
-- end AUTODEAL_CLIENT
-- begin AUTODEAL_PHISICAL
create table AUTODEAL_PHISICAL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PHONE varchar(11),
    --
    primary key (ID)
)^
-- end AUTODEAL_PHISICAL
-- begin AUTODEAL_BUY_REQUEST
create table AUTODEAL_BUY_REQUEST (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    AUTO_ID uuid,
    CLIENT_ID uuid,
    SOLD boolean,
    PRICE decimal(19, 2),
    MANAGER_ID uuid,
    --
    primary key (ID)
)^
-- end AUTODEAL_BUY_REQUEST
-- begin AUTODEAL_AUTO
create table AUTODEAL_AUTO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MANUFACTURER_ID uuid,
    MODEL_ID uuid,
    COMPLECTATION_ID uuid,
    NAME varchar(255),
    YEAR_ date,
    PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end AUTODEAL_AUTO
-- begin AUTODEAL_LEGAL
create table AUTODEAL_LEGAL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    INN_ADDRESS text,
    --
    primary key (ID)
)^
-- end AUTODEAL_LEGAL
-- begin AUTODEAL_COMPLECTATION
create table AUTODEAL_COMPLECTATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PRICE decimal(19, 2),
    TYPE_ integer,
    NOTE text,
    --
    primary key (ID)
)^
-- end AUTODEAL_COMPLECTATION
-- begin SEC_USER
alter table SEC_USER add column COUNTRY_ID uuid ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'sec$User' where DTYPE is null ^
-- end SEC_USER
