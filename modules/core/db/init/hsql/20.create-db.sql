-- begin CEEIIN_PET
alter table CEEIIN_PET add constraint FK_CEEIIN_PET_ON_OWNER foreign key (OWNER_ID) references CEEIIN_OWNER(ID)^
create index IDX_CEEIIN_PET_ON_OWNER on CEEIIN_PET (OWNER_ID)^
-- end CEEIIN_PET
-- begin CEEIIN_OWNER
alter table CEEIIN_OWNER add constraint FK_CEEIIN_OWNER_ON_USER foreign key (USER_ID) references SEC_USER(ID)^
create index IDX_CEEIIN_OWNER_ON_USER on CEEIIN_OWNER (USER_ID)^
-- end CEEIIN_OWNER
