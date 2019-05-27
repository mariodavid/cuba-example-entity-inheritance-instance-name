alter table CEEIIN_PET add constraint FK_CEEIIN_PET_ON_OWNER foreign key (OWNER_ID) references CEEIIN_OWNER(ID);
create index IDX_CEEIIN_PET_ON_OWNER on CEEIIN_PET (OWNER_ID);
