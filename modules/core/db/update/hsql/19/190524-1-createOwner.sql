create table CEEIIN_OWNER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    -- from ceeiin_Person
    USER_ID varchar(36),
    --
    -- from ceeiin_Company
    NAME varchar(255),
    --
    primary key (ID)
);