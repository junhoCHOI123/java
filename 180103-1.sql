
/* Drop Tables */

DROP TABLE t_emp purge;
DROP TABLE t_dept purge;



/* Drop Sequences */

DROP SEQUENCE deptno;
DROP SEQUENCE empno;




/* Create Sequences */

CREATE SEQUENCE deptno INCREMENT BY 10 START WITH 10;
CREATE SEQUENCE empno INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE t_dep
(
	deptno number(2) NOT NULL,
	dname varchar2(30) NOT NULL,
	loc varchar2(10),
	CONSTRAINT t_dep_deptno_pk PRIMARY KEY (deptno),
	CONSTRAINT t_dep_dname_nn CHECK (dname IS NOT NULL)
);


CREATE TABLE t_em
(
	empno number(4) NOT NULL,
	ename varchar2(20) NOT NULL,
	sal number NOT NULL,
	hp varchar2(11) UNIQUE,
	deptno number(2) NOT NULL,
	CONSTRAINT t_em_empno_pk PRIMARY KEY (empno),
	CONSTRAINT t_em_ename_nn CHECK(ename IS NOT NULL),
	CONSTRAINT t_em_hp_uk UNIQUE(hp),
	CONSTRAINT t_em_sal_ck CHECK(sal >= 1120000),
	CONSTRAINT t_em_deptno_fk FOREIGN KEY(deptno) REFERENCES t_dept(deptno)
);



/* Create Foreign Keys */

ALTER TABLE t_emp
	ADD FOREIGN KEY (deptno)
	REFERENCES t_dept (deptno)
;

insert into t_dept values(seq_dept.nextval, '운영부','서울');
insert into t_dept values(seq_dept.nextval, '영업부','대구');
insert into t_dept values(seq_dept.nextval, '개발부','광주');
select * from t_dept;

insert into t_emp values(seq_emp.nextval,'서태지', '01011111111',6000000, 10);
insert into t_emp values(seq_emp.nextval,'신해철', '01011111112',5000000, 20);
insert into t_emp values(seq_emp.nextval,'유재하', '01011111113',7000000, 30);
insert into t_emp values(seq_emp.nextval,'김윤아', '01011111114',8000000, 20);
insert into t_emp values(seq_emp.nextval,'김영석', '01011111115',4000000, 10);
select * from t_emp;
commit

select rownum as runum, no, title
,to_char(regdate, 'YYYY-MM-DD hh24:mi:ss') as regdate, re
from board
where regdate > sysdate - 2/24
order by no desc;