-- ALTER TABLE: 테이블 구조 변경

-- 열추가
alter TABLE student ADD stdTel varchar(13);
alter TABLE department ADD dptName varchar(13);
-- 여러개의 열 추가 :stdAge, std Address
ALTER TABLE student ADD (stdAge varchar(2),stdAddress varchar(50));

-- 열의 데이터 형식 변경: stdAge 열의 데이터 타입을 INT로 변경alter
ALTER TABLE student MODIFY stdAge INT;
describe student;

-- 열 이름 변경:stuName->stdName
ALTER TABLE student RENAME COLUMN stuName TO stdName;

-- 열의 제약 조건 변경: stdName 을 null로 허용
ALTER TABLE student MODIFY stdName VARCHAR(20) NULL;

-- 열 이름과 타입변경 
ALTER TABLE student CHANGE stdAddress stdAddress1 VARCHAR(100);

-- 열 삭제:stdTel 열 삭제
ALTER TABLE student DROP COLUMN stdTel;

-- 여러개의 열 삭제:지울때는 int varchar 입력안함!
ALTER TABLE student DROP stdAge,
					DROP stdAddress1;


/*연습문제
(1) product 테이블에 숫자 값을 갖는 prdStock과 제조일을 나타내는 prdDate 열 추가
(2) product 테이블의 prdCompany 열을 NOT NULL로 변경
(3) publisher 테이블에 pubPhone, pubPhone,  pubAddress 열 추가
(4) publisher 테이블에서 pubPhone 열 삭제
*/
ALTER TABLE product ADD (prdStock INT,prdDate varchar(30));
ALTER TABLE product MODIFY prdCompany  varchar(30) NOT NULL;
ALTER TABLE publisher ADD(pubPhone varchar(13),pubAddress varchar(50));
ALTER TABLE publisher DROP pubPhone;
/*
기본키 삭제
- 	ALTER TABLE 테이블명 DROP PRIMARY KEY;

외래키 삭제
- 	ALTER TABLE 테이블명 DROP FOREIGN KEY 키이름;
- 	ALTER TABLE 테이블명 DROP CONSTRAINT 키이름;

기본키 추가
- 	ALTER TABLE 테이블명 ADD PRIMARY KEY (열이름);

- 	ALTER TABLE 테이블명 ADD CONSTRAINT 키이름 PRIMARY KEY (열이름);

외래키 추가 
- 	ALTER TABLE 테이블명 ADD FOREIGN KEY (열이름) REFERENCES 참조테이블명 (기본키 열이름);
- 	ALTER TABLE 테이블명 ADD CONSTRAINT 외래키명   FOREIGN KEY (열이름) REFERENCES 참조테이블명 (기본키 열이름);

*/
-- 기본키 삭제: department 테이블의 기본 키 삭제 //제약 조건 있는 경우 제약 조건 삭제 후 기본키삭제가능
ALTER TABLE department DROP PRIMARY KEY dptNo;
-- 외래키 삭제 : student테이블에서 외래키 삭제
ALTER TABLE subjects DROP  foreign key FK_subjects_professor;

-- 기본키 추가 : department 테이블에 기본키 추가
ALTER TABLE department RENAME COLUMN depTel TO dptTel;

-- 외래키추가 : student 테이블에 외래키 추가
ALTER TABLE student ADD FOREIGN KEY (dptNo)REFERENCES department (dptNo);


-- 기존 외래키 삭제
ALTER TABLE student DROP FOREIGN KEY  FK_studetn_department;
-- on delete cascade 로 다시 외래키 설정
ALTER TABLE student
	ADD CONSTRAINT FK_student_department
	FOREIGN KEY (dptNo) REFERENCES department(dptNo)
    ON DELETE CASCADE;
    
/* ***테이블에 기본키 설정안되어 있으면 입력안됌 !****
1.학과 테이블에 데이터 2개 입력
	1컴퓨터학과111
    2경영학과 222
    
2.학생테이블에 데이터 2개 입력
	1홍길동 4 1
    2이몽룡 2 2department
*/

