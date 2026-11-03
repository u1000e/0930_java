/*
 * < VIEW(뷰) >
 * SELECT문을 저장하는 가상 테이블
 */
-- 환자명, 진료과, 계열, 병동명, 담당의, 성별, 혈액형, 입원일을 조회하시오.
CREATE OR REPLACE VIEW VIEW_PATIENT_INFO
AS
SELECT
       PATIENT_NAME
     , DEPT_NAME
     , DEPT_TYPE
     , WARD_NAME
     , FLOOR(MONTHS_BETWEEN(SYSDATE, BIRTH_DATE) / 12) AGE
     , DOCTOR_NAME
     , GENDER
     , BLOOD_TYPE
  FROM
       PATIENT
  JOIN
       DEPT USING(DEPT_ID)
  JOIN
       WARD USING(WARD_ID)
  JOIN
       DOCTOR USING(DOCTOR_ID);

SELECT * FROM VIEW_PATIENT_INFO;
SELECT VIEW_NAME, TEXT FROM USER_VIEWS;
----------------------------------------------------------------------
/*
 * < SEQUENCE(시퀀스) >
 * 
 * 채번하는 객체
 * 주로 PRIMARY KEY값을 자동으로 생성할 때 사용
 * 
 * 시퀀스는 테이블과 연결되어 있지 않음.
 */

CREATE TABLE SNACK(
	SNACK_NO VARCHAR(5) PRIMARY KEY,
	SNACK_NAME VARCHAR(15 CHAR) NOT NULL,
	PRICE NUMBER NOT NULL
);

INSERT INTO SNACK
VALUES ('S1', '오사쯔', 4500);

INSERT INTO SNACK
VALUES ('S2', '빼빼로', 2000);

SELECT * FROM SNACK;

CREATE SEQUENCE SEQ_SNACK_ID;
-- START WITH 시작번호 
-- INCREMENT BY 증가값
-- MAXVALUE 최대값
-- MINVALUE 최소값
-- CYCLE | NOCYCLE -- 최대값 도달 시 순환여부
-- CACHE 크기 | NOCACHE

-- 사용 : 시퀀스명.NEXTVAL / 시퀀스명.CURRVAL

SELECT SEQ_SNACK_ID.CURRVAL FROM DUAL;
SELECT SEQ_SNACK_ID.NEXTVAL FROM DUAL;

-- NEXTVAL은 호출 시 번호가 소비됨, ROLLBACK해도 번호가 돌아오지 않음
-- -> 중간에 빈 번호가 생기는것은 정상(시퀀스가 보장하는건 오로지 유일한 번호)

INSERT
  INTO
       SNACK
VALUES
       (
       'S' || SEQ_SNACK_ID.NEXTVAL
     , '과자4'
     , 3000
       );
       
SELECT * FROM SNACK;


-- 12c이상
-- MySQL AUTO_INCREMENT
CREATE TABLE VISIT_LOG (
	LOG_NO NUMBER GENERATED ALWAYS AS IDENTITY,
	PATIENT_ID CHAR(3) REFERENCES PATIENT
);
INSERT INTO VISIT_LOG(PATIENT_ID) VALUES('P01');
-- 시퀀스를 자동생성해서 번호를 증가시킴 테이블을 지우면 시퀀스도 같이 지워짐


-- INDEX<인덱스> 
/*
 * 데이터 검색 속도를 향상시키기위한 객체
 * 
 * PRIMARY KEY 제약조건이 있는 컬럼은 자동으로 인덱스를 생성
 * WHERE절에 자주 쓰이는 컬럼, 조인컬럼(FK)에 주로 생성
 * 
 * CREATE INDEX 인덱스명 ON 테이블명(컬럼명);
 * DROP INDEX 인덱스명;
 */
SELECT INDEX_NAME, TABLE_NAME, UNIQUENESS FROM USER_INDEXES
 WHERE TABLE_NAME IN ('DEPT', 'WARD', 'POSITION');

SELECT * FROM DEPT WHERE DEPT_ID = 'D8';

-----------------------------------------------------------------

-- < DCL (Data Control Language) >

/*
 * GRANT, REVOKE
 * 
 * 시스템 권한 
 * CREATE SESSION : DB접속권한
 * CREATE TABLE : 테이블 생성 권한
 * CREATE VIEW : 뷰 생성권한
 * CREATE SEQUENCE : 시퀀스 생성권한
 * 
 * 객체권한
 * SELECT, INSERT, UPDATE, DELETE ON 테이블명
 * 
 * GRANT 권한 TO 사용자;
 * REVOKE 권한 FROM 사용자;
 * 
 * ROLE
 * CONNECT : CREATE SESSION
 * RESOURCE : CREATE TABLE, CREATE SEQUENCE, CREATE TRIGGER, 
 * 			  CREATE PROCEDURE 등등..
 * DBA : 최고 강력한 관리자 권한
 */
CREATE OR REPLACE VIEW MY_VIEW
    AS
SELECT * FROM DEPT;

GRANT CREATE VIEW TO HOSPITAL;
REVOKE CREATE VIEW FROM HOSPITAL;













