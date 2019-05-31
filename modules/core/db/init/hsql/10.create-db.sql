-- begin CEEIIN_PET
create table CEEIIN_PET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    OWNER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CEEIIN_PET
-- begin CEEIIN_OWNER
create table CEEIIN_OWNER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    OWNER_IDENTIFICATION_NUMBER varchar(255),
    DESCRIPTION varchar(255),
    --
    -- from ceeiin_Person
    USER_ID varchar(36),
    PERSON_ID varchar(255),
    --
    -- from ceeiin_Company
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CEEIIN_OWNER
