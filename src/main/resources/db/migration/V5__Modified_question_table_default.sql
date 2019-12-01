alter table QUESTION alter column ID drop default;
alter table QUESTION alter column COMMENT_COUNT set default 0;
alter table QUESTION alter column VIEW_COUNT set default 0;
alter table QUESTION alter column LIKE_COUNT set default 0;