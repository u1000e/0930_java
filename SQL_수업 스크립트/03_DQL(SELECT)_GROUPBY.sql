-- 그룹함수
-- 매우중요 ☆★☆
SELECT DOCTOR_ID FROM PATIENT;
SELECT 
       COUNT(*) "전체 환자 수"
  FROM
       PATIENT;

SELECT
       COUNT(DISCHARGE_DATE) AS "퇴원한 환자의 수"
     , COUNT(DOCTOR_ID) AS "배정된 환자의 수"
     , COUNT(*) - COUNT(DISCHARGE_DATE) "입원중인 환자의 수"
  FROM
       PATIENT;

-- COUNT() : 행 수 반환
SELECT
       MAX(WEIGHT_KG)    -- 가장 높은 몸무게
     , MIN(WEIGHT_KG)    -- 가장 작은 몸무게
     , TO_CHAR(MAX(BIRTH_DATE), 'YYYY-MM-DD') -- 가장 어린 환자의 생년월일
     , MIN(PATIENT_NAME)
     , SUM(WEIGHT_KG) -- 컬럼값의 합계
     , AVG(HEIGHT_CM) -- 컬럼값의 평균
  FROM
       PATIENT;

 ORDER
    BY
       1 DESC;
 
 SELECT
        --TRIM(WEIGHT_KG)
 		AVG(WEIGHT_KG)
   FROM
        PATIENT;
 /*
  * COUNT() : 행 수
  * MIN()   : 최소값
  * MAX()   : 최대값
  * SUM()   : 합계
  * AVG()   : 평균
  */
-----------------------------------------------------------------------
SELECT * FROM PATIENT; 

SELECT
       COUNT(*)
  FROM
       PATIENT
 WHERE
       DEPT_ID = 'D2';
 
-- 진료과별 환자수 조회

SELECT
       DEPT_ID
     , COUNT(*)
  FROM
       PATIENT
 GROUP  
    BY
       DEPT_ID
 ORDER
    BY
       DEPT_ID;

-- 성별별 환자 수
SELECT
       GENDER
     , COUNT(*)
  FROM
       PATIENT
 GROUP
    BY
       GENDER;

SELECT GENDER FROM PATIENT;
SELECT * FROM PATIENT;
-- 병동별 환자수
 
SELECT
       WARD_ID
     , COUNT(*)
  FROM
       PATIENT
 GROUP
    BY 
       WARD_ID;
 
SELECT
       GENDER
  FROM
       PATIENT
 GROUP
    BY
       GENDER;
-- GROUP BY절에 없는 일반 컬럼을 SELECT문에 쓰면 오류
-- 성별로 묶었는데 환자 이름을 고를 순 없음
 
-- 병동별, 성별 환자수
SELECT
       WARD_ID
     , GENDER
     , COUNT(*)
  FROM
       PATIENT
 GROUP
    BY
       WARD_ID
     , GENDER;

SELECT EXTRACT(YEAR FROM SYSDATE), 
	   EXTRACT(MONTH FROM SYSDATE),
	   EXTRACT(DAY FROM SYSDATE)
  FROM DUAL;

-- GROUP BY
SELECT
       TO_CHAR(ADMISSION_DATE, 'YYYY-MM') AS 입원월
     , COUNT(*)
  FROM
       PATIENT
 WHERE
       EXTRACT(MONTH FROM ADMISSION_DATE) = 8
 GROUP
    BY
       TO_CHAR(ADMISSION_DATE, 'YYYY-MM')
 ORDER
    BY
       COUNT(*);
-------------------------------------------------------------------

-- 혈액형별로 환자 수가 10명 이상인 혈액형 이랑 환자수만 조회
SELECT
       BLOOD_TYPE
     , COUNT(*)
  FROM  
       PATIENT
 --WHERE
       --COUNT(BLOOD_TYPE)
 GROUP
    BY 
       BLOOD_TYPE
HAVING
       COUNT(*) >= 10;
-- HAVING절 : 그룹함수에 대한 조건을 제시할 때 사용  

-- 진료과별 환자 수
SELECT  
       DEPT_ID
     , COUNT(*)
  FROM
       PATIENT
 GROUP
    BY
       ROLLUP(DEPT_ID);
--> 마지막 행 DEPT_ID가 NULL인 행이 => 전체 합계(COUNT(*)의 결과)

-- 정리!

/*
 * SELECT        - 5
 *   FROM        - 1
 *  WHERE        - 2
 *  GROUP BY     - 3
 * HAVING        - 4
 *  ORDER BY     - 6
 */





 
 


