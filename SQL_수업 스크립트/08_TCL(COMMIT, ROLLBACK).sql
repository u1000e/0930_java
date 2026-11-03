/*
	< TCL (Transaction Control Language) > 중요중요중요중요
	
	< 트랜잭션 >
	논리적 작업 단위
	한 꺼번에 수행되어야 할 DML 명령어들을 하나로 묶은 것
	예 ) 영화보기 => 영화예매앱 => 극장(영화) => 시간 => 좌석 => 결제
	    은행거래 => 출금 UPDATE => 입금 UPDATE 
	    입원처리 => 환자 INSERT => 담당의 배정 UPDATE => 진료기록 INSERT

*/

-- 현재 상태 확인
SELECT * FROM PATIENT WHERE PATIENT_ID = 'P36';

-- DML 수행
UPDATE PATIENT
   SET HEIGHT_CM = 999
 WHERE PATIENT_ID = 'P36';

SELECT * FROM PATIENT WHERE PATIENT_ID = 'P36';
--> 이시점에서 다른 세션(접속)에서 조회하면 여전히 170으로 고정
--> 확정을 짓지 않았기 때문

-- ROLLBACK
ROLLBACK;

UPDATE PATIENT
   SET HEIGHT_CM = 171
 WHERE PATIENT_ID = 'P36';

COMMIT; -- 이시점에서 변경사항 확정


---------------------------------------------------------------
-- 시나리오 : 조예준(P07)환자에게 담당의 배정 + 병동 이동
SELECT PATIENT_NAME, WARD_ID, DOCTOR_ID 
  FROM PATIENT WHERE PATIENT_ID = 'P07';

UPDATE PATIENT SET DOCTOR_ID = 'DR02' WHERE PATIENT_ID = 'P07';
UPDATE PATIENT SET WARD_ID = 'W2' WHERE PATIENT_ID = 'P07';

-- 두번째 UPDATE에서 문제가 생겼다고 가정!
ROLLBACK;
-- 담당의 배정도 같이 취소됨. ALL OR NOTHING

-----------------------------------------------------------------
-- 자동 커밋
-- DBeaver : 기본이 자동 커밋. 트랜잭션 실습 하고싶으면 Manual Commit으로 전환
-- SQL Developer : 기본이 수동 커밋. 환경설정->데이터베이스->고급->자동커밋 체크박스
-- SQL Plus : 정상종료(EXIT) 시 자동 COMMIT, 비정상 종료 시 ROLLBACK
-- 자바를 이용해서 DBMS작업 -> 자동 커밋

-------------------------------------------------------------------
-- SAVEPOINT
INSERT INTO DEPT
VALUES ('01', 'KH과', '기타');

SAVEPOINT sp1;

INSERT INTO DEPT
VALUES ('02', 'KH과', '기타');

ROLLBACK TO sp1;

SELECT * FROM DEPT;
---------------------------------------------------------------------

-- 주의 : DDL을 수행하면 자동으로 COMMIT

















