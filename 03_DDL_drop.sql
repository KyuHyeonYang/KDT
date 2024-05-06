-- 테이블 삭제alter-- 
-- DROP TABLE 테이블명;

-- department  테이블 삭제 시 외래키 제약조건 위배오류
-- (1)student 테이블에서 외래키 제약조건 해제
-- (2)student 테이블 삭제
DROP TABLE  department;
DROP TABLE student;

