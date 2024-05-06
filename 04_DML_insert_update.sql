CREATE TABLE publisher(
    pubNo VARCHAR(10) NOT NULL PRIMARY KEY,
    pubName VARCHAR(30) NOT NULL
);


CREATE TABLE book (
	bookNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bookName VARCHAR(30) NOT NULL,
    bookPrice INT DEFAULT 10000 CHECK( bookPrice > 1000),
    bookDate DATE,
    pubNo VARCHAR(10) NOT NULL,
    CONSTRAINT FK_book_publisher FOREIGN KEY(pubNo) REFERENCES publisher (pubNo)
);


-- 퍼블리셔 테이블에 데이터입력
-- 문자열은 따옴표로 묶음 (큰따옴표,작은 따옴표 둘 다 사용가능)
INSERT INTO publisher(pubNo,pubName)VALUES('1','서울출판사');
INSERT INTO publisher(pubNo,pubName)VALUES("2","강남출판사");
INSERT INTO publisher(pubNo,pubName)VALUES("3","정보출판사");
INSERT INTO publisher(pubNo,pubName)VALUES("4","종로출판사");

-- 퍼블리셔 테이블 내용 조회
SELECT *FROM publisher;
SELECT pubName FROM publisher; -- 출판사명만 출력

-- book 테이블에 데이터 입력
INSERT INTO book(bookNo,bookName,bookPrice,bookDate,pubNo)
 VALUES('1','자바',20000,"2022-10-10",'1');
 
-- 모든 열에 데이트럴 입력할 경우 열이름 생략가능
INSERT INTO book
 VALUES('2','자바스크립트',23000,'2024-03-22','3');
 
 -- 여러개의 데이터를 한번에 insert
 INSERT INTO book(bookNo,bookName,bookPrice,bookDate,pubNo)
 VALUES('3','데이터베이스',35000,'2023-07-11','2'),
		('4','알고리즘',18000,'2023-07-23','3'),
		('5','스프링프레임워크',30000,'2023-05-15','4');
 
 -- 모든열에 데이터를 입력할 경우 열이름 생략가능
  INSERT INTO book
 VALUES('6','데이터베이스',35000,'2023-07-11','2'),
		('7','알고리즘',18000,'2023-07-23','3'),
		('8','스프링프레임워크',30000,'2023-05-15','4');
 -- BOOK 테이블 내용 조회
 SELECT*FROM book;

CREATE TABLE department(
dptNo VARCHAR(10) NOT NULL PRIMARY KEY,
dptName VARCHAR(30),
dptTel varchar(13)
);

CREATE TABLE student(
stdNo VARCHAR(10) PRIMARY KEY,
stdName VARCHAR(30),
stdYear VARCHAR(3),
stdAddress VARCHAR(50),
stdBirthDay varchar(10)
-- dptNo 외래키 넣어야함!계속 존재하지않는다는 오류가 나서 못넣고 생성함04/30
);

/* insert 연습문제
-학과/학생 테이블 생성하고 다음과 같이 데이터 삽입하고 select로 조회*/
 INSERT INTO department
		VALUES('1','컴퓨터학과','02-1111-1111'),
				('2','경영학과','02-2222-2222'),
				('3','수학과','02-7777-7777');
  
  SELECT*FROM department;
 
  INSERT INTO student
		VALUES('20180002','이몽룡','4','서울시강남구','1993-05-07'),
				('20220003','홍길동','2','경기도안양시','1999-11-11'),
				('2024003','성춘향','1','전라북도남원시','2002-01-02'),
				('2024001','변학도','1','서울시종로구','2000-11-11');
SELECT*FROM student;

  -- 파일 임포트 후 테이블 상세구조 확인
  DESCRIBE product;
  -- 기본키 제약조건 추가하기 전에 TEXT타입을 VARCHAR(10)으로 변경
  -- 변경하지 않으면 Error Code: 1170. BLOB/TEXT column 'prdNo' used in key specification without a key length에러남
ALTER TABLE product MODIFY prdNo VARCHAR(10) NOT NULL;

  -- 파일 임포트시 제약조건(기본키,외래키) 없어짐,기본키 제약조건 추가
  ALTER TABLE product
   ADD CONSTRAINT pk_product_prdNo
	PRIMARY KEY (prdNo);
  ALTER TABLE product MODIFY prdName VARCHAR(20),
						MODIFY prdPrice INT,
                        MODIFY prdMaker VARCHAR(30),
                        MODIFY prdColor VARCHAR(10),
                        MODIFY ctgNo VARCHAR(20);
                        
-- ----------------------------------------------------------------------------------------------------------------
-- 상품테이블조회
SELECT*FROM product;

-- 상품번호가 '5'번인 행의 상품명을 'UHD TV'로 수정 (prdNo='5' -> 조건임)
UPDATE product SET prdName ='UHD TV' WHERE prdNo='5';

-- 테이블에 있는 긴종 행을 삭제하는 명령어
-- 기본형식
DELETE FROM product WHERE 조건;
-- 상품명'그늘막 텐트'인 행 삭제
DELETE FROM product WHERE prdName='그늘막 텐트';
SELECT*FROM product;
-- 테이블의 모든 행 삭제
 DELETE FROM product;
 
 
 SELECT*FROM book;
INSERT INTO book  
	VALUES('2','아아아아',30000,'2021-03-10','1'),
		('10','파이썬 데이터 과학',24000,'2023-09-05','2');
UPDATE book SET bookPrice ='25000' WHERE bookName='자바';
DELETE FROM book WHERE bookDate='2024-03-22';
-- 특정년도 삭제할 수 있는 방법
DELETE FROM book WHERE bookDate>='2021-01-01'AND bookDate <='2021-12-31';



/*—- ---------------------------------------------------------------
종합 연습문제
- 	다음과 같이 SQL 문 작성
1.  고객 테이블 (customer) 생성
2.  고객 테이블의 전화번호 열을 NOT NULL로 변경

3.  고객 테이블에 ‘성별’, ‘나이’ 열 추가
4.  고객 테이블에 데이터 삽입 (3개)
5.  고객명이 ‘홍길동’인 고객의 전화번호 값 수정 (값은 임의로)
6.  나이가 20살 미만인 고객 삭제*/
 SELECT*FROM customer;
CREATE TABLE customer(
cstNo varchar(10) PRIMARY KEY,
cstName varchar(10) ,
cstTel varchar(13) 
);
ALTER TABLE customer MODIFY cstTel VARCHAR(13) NOT NULL;
ALTER TABLE customer ADD cstGender VARCHAR(13);
ALTER TABLE customer ADD cstAge int;
insert INTO customer values ('1','홍길동','010-1111-1111','남성',31),
							('2','성춘향','010-1111-2222','여성',23),
                            ('3','이몽룡','010-1111-3333','남성',21),
							('4','변학도','010-1111-4444','남성',17);
DELETE FROM  customer where cstName ='홍길';
UPDATE book SET bookPrice ='25000' WHERE bookName='자바';
update customer SET cstTel='010-1234-5678' where cstName='홍길동';
DELETE FROM customer WHERE cstAge>=1 and cstAge <=19;

