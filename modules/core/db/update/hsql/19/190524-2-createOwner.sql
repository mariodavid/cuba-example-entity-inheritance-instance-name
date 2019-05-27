alter table CEEIIN_OWNER add constraint FK_CEEIIN_OWNER_ON_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_CEEIIN_OWNER_ON_USER on CEEIIN_OWNER (USER_ID);
