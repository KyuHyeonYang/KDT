/*수학 함수
ROUND(값, 자리수)

반올림한 값을 구하는 함수
자리수 아래에서 반올림하여 자리수까지 출력
양수 : 소수점 오른쪽 자릿수(소수점 이하)
음수 : 소수점 왼쪽 자릿수(1의 자리부터)
양수 예 : ROUND(3.456, 1) -> 3.500*/

-- 고객별 평균 주문액을 백원다위에서 반올림하여 출력 (천원자리까지 출력)
select clientNo, ROUND(avg(bookPrice*bsQty))AS "평균 주문액",
				 ROUND(avg(bookPrice*bsQty),0)AS "1자리까지 출력",
                 ROUND(avg(bookPrice*bsQty),-1)AS "10자리까지 출력",
                 ROUND(avg(bookPrice*bsQty),-2)AS "100자리까지 출력",
                 ROUND(avg(bookPrice*bsQty),-3)AS "1000자리까지 출력"
from book,booksale
where book.bookNo=booksale.bookNo
group by clientNo;

/*FORMAT()
- 	소수점 이하 자리수
- 	천단위 구분 기호 표시 
- 문자열 타입 반환 
*/

-- 출판사별 평균 재고수량과 평균재고액 출력
select pubNo,format(avg(bookStock),3) AS "평균 재고 수량",
			 format(avg(bookPrice*bookStock),0) AS "평균재고액"
from book
group by pubNo;

-- -------------------------------------------------------------
/*
순위 출력 함수
RANK() / DENSE_RANK() / ROW_NUMBER()
-RANK():값의 순위 반환(동일 순위 갯수만큼 증가) 1 1 3 4 5 6 6 8 9 ...(1등이 2명이명 3등)
-DENSE_RANK():값의 순위 반환(동일 순위 상관없이 1 증가)1 1 2 3 4 5 5 6 7 (1등이 2명이여도 2등)
-ROW_NUMBER():행의 순위 반환 (증가) 1 2 3 4 5 6 ...(상관없이 순위매김)
			
       */
SELECT bookPrice,
	RANK()OVER (ORDER BY bookPrice DESC) "RANK",
    DENSE_RANK()OVER (ORDER BY bookPrice DESC) "DENSE_RANK",
    ROW_NUMBER() OVER (ORDER BY bookPrice DESC) "ROW_NUMBER"
FROM book;

-- -----------------------------------------------------------------------------------
/*
문자함수
REPLACE()
-문자열을 치환(대체)하는 함수
-실제 데이터는 변경되지 않고 출력만 바꿔서 해줌
-REPLACE(문자열,이전,변경)

CHAR_LENGTH()
-문자열 길이(글자 수)를 반환
-글자와 공백 모두 포함
-자바 프로그래밍 -> 8 반환, 안드로이드 프로그래밍 -> 11 반환

LENGTH()
-바이트 수
-utf-8인 경우 한글은 3바이트, 영문은 1바이트 ,공백은 1바이트 
-유니코드는 한글 2바이트
-자바 프로그래밍 -> 22 반환됨(한글은 3바이트, 공백은 1바이트)
-HTML & CSS -> 10 반환됨(영어, 공백 모두 1바이트)

SUBSTR()
-지정한 길이만큼의 문자열을 반환하는 함수
-SUBSTR(전체 문자열, 시작, 길이)
-맨 처음 시작은 개발 언어처럼 0이 아닌 1이다. */

-- REPLACE() :문자열을 치환하는 함수
-- 도서명에 '안드로이드'가 포함된 도서에 대해 '안드로이드'->'ANDROID'로 치환하여 출력

SELECT bookNo,REPLACE(bookName, '안드로이드','Android')bookName,
		bookAuthor,bookPrice
FROM book
WHERE bookName LIKE '%안드로이드%';

-- book테이블의 실제데이터는 변경되지 않음.
SELECT bookNo,bookName from book;

-- CHAR_LENGTH(): 문자열 길이(글자 수)를 반환
-- LENGTH(): 바이트 수반환

-- 서울 출판사에서 출간한 도서의 도서명과 도서명의 글자수 , 바이트 수,출판사명 출력
select B.bookName AS '도서명',
		length(B.bookName) AS '바이트 수',
        char_length(B.bookName) AS '길이',
        P.pubName AS '출판사'
from book B
	inner join publisher P on B.pubNo=P.pubNo
where P.pubName ='서울 출판사';

-- SUBSTR() :지정한 길이만큼의 문자열을 반환하는 함수
-- SUBSTR(전체 문자열, 시작, 길이)

-- 저자에서 성씨만 출력
SELECT SUBSTR(bookAuthor ,1,1) AS'성'
FROM book;

-- 저자에서 이름만 출력
SELECT SUBSTR(bookAuthor ,2,2) AS'이름'
FROM book;

-- 저자에서 성이 손씨인 모든 저자 출력 출력
SELECT SUBSTR(bookAuthor ,1,1) AS'성'
FROM book
where SUBSTR(bookAuthor,1,1) ='손';

-- 저자 중에서 같은 성씨인 사람이 몇명이나 되는지 알아보기위해 성씨별로 그룹지어 인원수 출력

-- 김, 손
SELECT SUBSTR(bookAuthor ,1,1) AS'성',count(*)인원수
FROM book
group by 성;

-- ------------------------------------------------------------------
-- 현재 날짜와 시간 출력
select date(now()),time(now());

-- 연 월 일 출력
select year(curdate()),month(curdate()),dayofmonth(curdate());

-- 도서테이블에서 2021이우 출간한 도서만 출력
-- year()사용

select*
from book
where year(bookDate)>=2021;

-- 시간 분 초 마이크로 초 출력
select hour(current_time()),minute(current_time()),second(current_time()),
			microsecond(current_time());
            
-- 시간 차이 계산
select datediff('2024-05-03',now()), timediff('23:23:59','12:11:10');

-- 날짜 자동 입력으로 설정해야하느 경우
-- 잘못된 값을 입력하지 못하게 하는 경우
-- 회원가입 일자,주문일자, 게시글 작성일 
-- 테이블 생성시 자동 입력 되도록 디폴트로 설정
-- timestamp / date

create table member(
memId varchar(10) not null primary key,
memPass varchar(10) not null,
memJoinDate timestamp default current_timestamp,-- 2024-05-03 09:45:49
memJoinDate2 date default (current_date)-- 2024-05-03 
); 



-- load _file ()함수
-- 대용량 파일 내용 저장 :txt/jpg/mp4

create table flower(
	fNo varchar(10) not null primary key,
    fName varchar(30),
    fInfo longtext,
    fImage longblob
    );
    
insert into flower values('f005','장미',
							load_file('C:/dbworkspace/rose.txt'),
                            load_file('C:/dbworkspace/rose.jpg'));
                            
show variables like 'secure_file_priv';-- C:\dbworkspace\
show variables like 'max_allowed_packet';-- 67108864

-- LOAD_FILE()
-- 동영상 파일 저장:LONGBLOB 타입

CREATE TABLE movie(
mId varchar(10) not null primary key,
mTitle varchar(30),
mDirector  varchar(30),
mActor varchar(30),
mScript longtext,
mFilm longblob
); 


insert into movie values ('2','쉰들러리스트','스필버그','리암니슨',
						LOAD_FILE('C:/dbworkspace/movies/Schindler.txt'),
                        LOAD_FILE('C:/dbworkspace/movies/Schindler.mp4')
	);
    
-- 데이터를 파일로 내보내기

-- longtext 타입의 영화 대본 데이터를 텍스트 파일로 내보내기
select mSript from movie where mId='1'
into outfile 'C:/dbworkspace/movies/Schindler_out.txt'
lines terminated by '\\n'; -- 줄바꿈 문자도 저장

select mSript from movie where mId='1'
into outfile 'C:/dbworkspace/movies/Schindler_out2.txt';
-- 줄바꿈 문자 지정하지 않은 경우 매행에 \ 출력됨

-- 바이너리 파일로 내보내기
select mFilm from movie where mId='1'
INTO DUMPFILE 'C:/dbworkspace/movies/Schindler_out.mp4';
    
-- 도서 테이블 데이터를 텍스트 파일로 내보내기
select*from book
into outfile 'c:/dbworkspace/book_out.txt';

-- ---------------------------------------------------------------------------------
-- 테이블 복사 :기본키 (제약조건)복사 안됨
-- 복사 후 제약조건 설정해야함
-- 테이블 복사 :새 테이블로 전체 복사
create table new_book AS 
select *from book;

select *from new_book;
describe new_book;

-- 기본키 제약 조건 추가
alter table new_book
add constraint PK_new_book_bookNo
primary key (bookNo);

-- 테이블 복사 2: 새 테이블로 일부만 복사
create table new_book2 AS
select*from book where bookDate >='2021-01-01';

select *from new_book2;
describe new_book2;

-- 기본키 제약 조건 추가
alter table new_book2
add constraint PK_new_book2_bookNo
primary key (bookNo);

-- 테이블 복사 3: 기존 테이블로 데이터만 복사
-- 주의 :테이블 구조가 동일한 경우에만 복사 가능
-- new_book2 테이블의 전체 데이터(내용만) 삭제 (구조만 남기고)
delete from new_book2;
select *from new_book2;
-- new_book2의 데이터만 복사
insert into new_book2 select * from book;

-- 다른 데이터베이스의 테이블 복사
-- 데이터베이스명 (스키마명).테이블명

-- sqldb2 product테이블을 sqldb3에 복사

create table product AS
select *from sqldb2.product;

select*from product;

alter table product add primary key (prdNo);
describe product;