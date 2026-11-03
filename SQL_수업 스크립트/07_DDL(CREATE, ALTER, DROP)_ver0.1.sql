/*
 * < DDL (Data Definition Language) >
 * 
 * 데이터 정의 언어
 * 객체(테이블, 뷰, 시퀀스, 프로시져, 트리거, 함수...)를
 * 생성(CREATE), 변경(ALTER), 삭제(DROP)하는 구문
 */

-- CREATE TABLE
/*
 * CREATE TABLE 테이블명 (
 *   컬럼명 자료형,
 *   컬럼명 자료형,
 *   ...
 * );
 * 
 * CHAR(1~2000) : 고정길이문자
 * NVARCHAR2(1~4000) : 1글자부터 4000글자까지
 * TIMESTAMP
 * 
 * VARCHAR2(1~4000) : 문자 -> 가변길이문자 -> 최대 4000Byte
 * NUMBER        : 숫자(정수/실수)
 * DATE          : 날짜 -> 년월일시분초
 * CLOB          : 대용량 문자
 */
-- 진료기록 테이블 만들기 -> 환자가 진료를 받을 때마다 한행씩 쌓이는 테이블
/*
 * 제약 조건
 * 
 * - NOT NULL : NULL값을 허용하지 않음
 * - UNIQUE : 중복값을 허용하지 않음
 * - PRIMARY KEY : NOT NULL + UNIQUE -> PK
 * - CHECK : 지정한 조건에 맞는 값만 허용
 * - FOREIGN KEY : 다른 테이블의 컬럼값만 허용(참조 무결성) -> FK
 * 
 * 제약조건은 X => 기본값 설정
 * [제약조건 명시 방법]
 * 컬럼명 자료형 제약조건 -> 컬럼 레벨
 */
CREATE TABLE TREATMENT(
   RECORD_ID NUMBER,
   PATIENT_ID CHAR(3) NOT NULL,
   DOCTOR_ID CHAR(4) NOT NULL REFERENCES DOCTOR (DOCTOR_ID) ,
   TREAT_DATE DATE DEFAULT SYSDATE,
   PRESCRIPTION VARCHAR2(200),
   COST NUMBER,
   PRIMARY KEY (RECORD_ID),
   FOREIGN KEY (PATIENT_ID) REFERENCES PATIENT (PATIENT_ID),
   CONSTRAINT TREAT_COST_CK CHECK (COST >= 100000)
);

COMMENT ON COLUMN TREATMENT.RECORD_ID IS '기록번호';

SELECT * FROM TREATMENT;
DROP TABLE TREATMENT;
SELECT *
  FROM USER_TAB_COLUMNS
 WHERE TABLE_NAME = 'TREATMENT';

INSERT INTO TREATMENT
VALUES(3, 'P02', 'DR10', SYSDATE, '위소매절제술', 200000);
SELECT * FROM TREATMENT;
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, SEARCH_CONDITION
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME = 'TREATMENT';
DELETE FROM PATIENT WHERE PATIENT_ID = 'P02';

/*
 * 웹사이트를 가입하고 나서 회원 탈퇴
 * 
 * -> DELETE 탈퇴요청 처리
 * 
 * FK => 삭제 옵션
 * - 옵션없음(기본) : 자식이 있으면 부모 삭제 불가
 * - ON DELETE CASCADE : 부모 삭제 시 자식도 함께 삭제
 * - ON DELETE SET NULL : 부모 삭제 시 자식의 FK를 NULL로
 */
----------------------------------------------------------------

-- ALTER

-- 컬럼을 추가
ALTER TABLE TREATMENT ADD (NEXT_VISIT DATE);



SELECT * FROM TREATMENT;










