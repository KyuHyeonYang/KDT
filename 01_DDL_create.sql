-- 테이블 생성 : 기본키 제약조건 설정 방법1
CREATE TABLE product(
	prdNo VARCHAR(1) NOT NULL PRIMARY KEY,
    prdName VARCHAR(30) NOT NULL,
    prdPrice INT,
    prdCompany VARCHAR(30)
);

-- 테이블 생성 : 기본키 제약조건 설정 방법2
CREATE TABLE product2(
	prdNo VARCHAR(1) NOT NULL,
    prdName VARCHAR(30) NOT NULL,
    prdPrice INT,
    prdCompany VARCHAR(30),
    PRIMARY KEY(prdNo)
);

-- 테이블 생성 : 기본키 제약조건 설정 방법3
CREATE TABLE product3(
	prdNo VARCHAR(1) NOT NULL,
    prdName VARCHAR(30) NOT NULL,
    prdPrice INT,
    prdCompany VARCHAR(30),
    CONSTRAINT PK_product_prdNo PRIMARY KEY(prdNo)
);

/*
	출판사 테이블 생성 (publisher)(출판사번호, 출판사명)
    제약조건
		- 기본기 : pubNo, NOT NULL
        - pubName : NOT NULL 	
*/

CREATE TABLE publisher(
    pubNo VARCHAR(10) NOT NULL PRIMARY KEY,
    pubName VARCHAR(30) NOT NULL
);
/*
	도서 테이블 생성 (book) : 도서번호, 도서명, 가격, 발행일, 출판사번호
    제약조건
		- 기본키 : bookNo, NOT NULL	
        - 외래키 : pubNo (참조 테이블과 기본키 지정)
        - bookPrice : 기본값 (10000), 1000 보다 크게 설정 
*/

-- book 테이블 생성 : 외래키 생성 방법1
CREATE TABLE book (
	bookNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bookName VARCHAR(30) NOT NULL,
    bookPrice INT DEFAULT 10000 CHECK( bookPrice > 1000),
    bookDate DATE,
    pubNo VARCHAR(10) NOT NULL,
    CONSTRAINT FK_book_publisher FOREIGN KEY(pubNo) REFERENCES publisher (pubNo)
);

-- book 테이블 생성 : 외래키 생성 방법2
CREATE TABLE book2 (
	bookNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bookName VARCHAR(30) NOT NULL,
    bookPrice INT DEFAULT 10000 CHECK( bookPrice > 1000),
    bookDate DATE,
    pubNo VARCHAR(10) NOT NULL,
    FOREIGN KEY(pubNo) REFERENCES publisher (pubNo)
);
describe book;


CREATE TABLE dapartment(
dptNo VARCHAR(10) NOT NULL PRIMARY KEY,
dptName VARCHAR(30)
);

CREATE TABLE student(
stdNo VARCHAR(10),
stdName VARCHAR(30),
stdGrade VARCHAR(3),
dptNo VARCHAR(10) NOT NULL,
CONSTRAINT FK_studetn_department FOREIGN kEY(dptNo) REFERENCES department(dptNo)
);
CREATE TABLE department_company(
dptNo VARCHAR(10) NOT NULL PRIMARY KEY,
dptName VARCHAR(30) NOT NULL,
dptTel VARCHAR(13)

);
CREATE TABLE employee(
empNo VARCHAR(10),
empName VARCHAR(30) NOT NULL,
empTel VARCHAR(13),
dptNo VARCHAR(10) NOT NULL,
CONSTRAINT FK_employee_dempartment_company FOREIGN KEY (dptNo) REFERENCES department_company(dptNo)
);

CREATE TABLE category(
ctgNo VARCHAR(10) NOT NULL PRIMARY KEY,
ctgName  VARCHAR(30) NOT NULL

);
CREATE TABLE product4(
prdNo VARCHAR(10)NOT NULL PRIMARY KEY,
prdName VARCHAR(30)NOT NULL ,
prdPrice INT,
ctgNo VARCHAR(10) NOT NULL,
FOREIGN KEY(ctgNo) REFERENCES category(ctgNo)
);

create table department(
dptNo varchar(10)not null primary key,
dTel varchar(13)
);
CREATE TABLE professor(
proId varchar(10) not null primary key,
proName varchar(30)not null,
proPosition varchar(2),
dptNo varchar(10) not null
);

CREATE TABLE subjects(
subNo varchar(10) not null primary key,
subName varchar(30) not null,
subCredit int,
proId varchar(10)not null,
constraint FK_subjects_professor foreign key(proId)references professor (proId)
);
CREATE TABLE student(
stdNo VARCHAR(10) not null ,
stdName VARCHAR(30),
stdGrade VARCHAR(3),
dptNo VARCHAR(10) NOT NULL,
foreign key (depNo) references department (depNo)
);
CREATE TABLE score(
stdNo varchar(10) not null,
subNo varchar(30) not null,
scScore int,
scGrade varchar(2),
constraint PK_score_stdNo primary key(stdNo,subNo),
constraint FK_scroe_subjects foreign key (subNo) references subjects (subNo) 
);

-- 자동증가: AUTO_INCREMENT
CREATE TABLE board(
bNo INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
bTitle VARCHAR(30) NOT NULL,
bWriter VARCHAR(20), -- MEMID
bContent VARCHAR(20)
);