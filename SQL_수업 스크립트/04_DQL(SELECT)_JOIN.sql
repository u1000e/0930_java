SELECT
       PATIENT_NAME
     , DEPT_ID
  FROM   
       PATIENT;
SELECT
       DEPT_ID
     , DEPT_NAME
  FROM 
       DEPT;
-- JOIN => 두 개 이상의 테이블을 연결하여 하나의 결과로 조회하는 것

-- 환자이름, 진료과명 조회 --> 오라클 전용 구문
SELECT
       PATIENT_NAME
     , PATIENT.DEPT_ID
     , DEPT.DEPT_ID
     , DEPT_NAME
  FROM   
       PATIENT
     , DEPT
 WHERE
       PATIENT.DEPT_ID = DEPT.DEPT_ID;
  
SELECT
       PATIENT_NAME
     , DEPT_ID
  FROM
       PATIENT;


SELECT
       DEPT_ID
     , DEPT_NAME
  FROM
       DEPT;
-->> ANSI 표준 구문
SELECT
       PATIENT_NAME
     , DEPT_NAME
  FROM
       PATIENT
  JOIN
       DEPT ON (PATIENT.DEPT_ID = DEPT.DEPT_ID);

SELECT
       PATIENT_NAME
     , DEPT_NAME
  FROM 
       PATIENT
  JOIN
       DEPT USING(DEPT_ID);

-- 참고
-- NATURAL JOIN : 이름이 같은 컬럼을 자동으로 찾아서 조인(실무에서는 잘 안함)
SELECT
       PATIENT_NAME
     , DEPT_NAME
  FROM
       PATIENT
NATURAL JOIN DEPT;

-------------------------------------------------
-- 환자명을 조회, 병동명을 조회
SELECT 
       PATIENT_NAME
     , WARD_NAME
  FROM
       PATIENT P 
  JOIN 
       WARD W ON (P.WARD_ID = W.WARD_ID)

-- 환자 이름, 진료과명, 병동명 조회
-- PATIENT_NAME                         --> PATIENT
--          DEPT_NAME                   --> DEPT
--                   WARD_NAME          --> WARD
SELECT
       PATIENT_NAME
     , DEPT_NAME
     , WARD_NAME
  FROM
       PATIENT p 
  JOIN
       DEPT d USING (DEPT_ID)
  JOIN
       WARD w USING (WARD_ID);

SELECT
       PATIENT_NAME, DEPT_NAME, WARD_NAME
  FROM 
       WARD
  JOIN
       DEPT USING (DEPT_ID)
  JOIN
       PATIENT USING(WARD_ID);


-- 환자 이름, 담당의 이름 조회
SELECT
       PATIENT_NAME
     , DOCTOR_NAME
  FROM
       PATIENT p
     , DOCTOR d
 WHERE
       p.DOCTOR_ID = d.DOCTOR_ID;

-- 환자명, 진료과명 조회 -> if(외과계 환자들만 조회)
SELECT  
       PATIENT_NAME
     , DEPT_NAME
  FROM
       PATIENT p
     , DEPT d
 WHERE
       p.DEPT_ID = d.DEPT_ID
   AND
       DEPT_TYPE = '외과계';

-- 내부조인(INNER JOIN), 동등조인(EQUAL JOIN)
--------------------------------------------------------------------
-- 외부조인(OUTER JOIN)
/*
 * LEFT OUTER JOIN
 * RIGHT OUTER JOIN
 * FULL OUTER JOIN
 */

-- 환자와 담당의 이름을 출력하고 싶은데 모든 환자를 조회
SELECT
       PATIENT_NAME
     , DOCTOR_NAME
  FROM 
       PATIENT LEFT JOIN DOCTOR USING(DOCTOR_ID);

SELECT
       PATIENT_NAME
     , DOCTOR_NAME
  FROM
       PATIENT RIGHT JOIN DOCTOR USING(DOCTOR_ID)
 ORDER
    BY
       DOCTOR_ID;

SELECT
       NVL(PATIENT_NAME, '환자 미배정') AS "환자명"
     , NVL(DOCTOR_NAME, '담당의 미배정') AS "담당의"
  FROM  
       PATIENT
  FULL JOIN DOCTOR USING(DOCTOR_ID)
 ORDER  
    BY
       PATIENT_NAME;

SELECT  
       PATIENT_NAME
     , DOCTOR_NAME
  FROM
       PATIENT p
     , DOCTOR d
 WHERE
       p.DOCTOR_ID(+) = d.DOCTOR_ID;

----------------------------------------------------------------

-- 의사이름, 소속진료과명 조회
SELECT
       DOCTOR_NAME
     , DEPT_NAME
  FROM 
       DOCTOR
  LEFT
  JOIN
       DEPT USING(DEPT_ID);

-- 요구사항 => 진료명에 해당하는 환자 수 조회
SELECT
       DEPT_NAME
     , COUNT(*) AS "환자 수"
  FROM
       PATIENT
  JOIN
       DEPT USING(DEPT_ID)
 GROUP
    BY
       DEPT_NAME;
------------------------------------------------------------------
-- 의사명을 조회 단, 과장만 조회
SELECT
       DOCTOR_NAME
  FROM
       DOCTOR
  JOIN
       POSITION USING(POSITION_ID)
 WHERE
       POSITION_NAME = '이승철';
 




SELECT COUNT(*)
  FROM PATIENT
 CROSS
  JOIN DEPT;















