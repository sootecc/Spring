create table USERS (
    ID varchar2(8) Primary Key,
    PASSWORD varchar2(8) ,
    NAME varchar2(20),
    ROLE varchar2(5)
);

insert into users values('admin','1234','������','Admin');
insert into users values('user','1234','ȫ�浿','User');

select * from users;

create table board(
    SEQ number(5) Primary Key,
    TITLE varchar2(200),
    WRITER varchar2(20),
    CONTENT varchar2(2000),
    REGDATE date Default sysdate,
    CNT number(5) Default 0
);

insert into board(seq, title, writer, content, regdate, cnt) values (1, '�����λ�', '������', '�ȳ��ϼ��� �ݰ����ϴ�.',sysdate,default);
