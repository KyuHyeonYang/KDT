select*from book;
/*(3) 데이터 타입 변경
- 	기본키는 VARCHAR(10)
- 	출판사번호, 도서번호, 고객번호, 주문번호(bsNo)
- 	날짜는 DATE 타입
- 	숫자는 INT
- 	도서가격, 도서재고(bookStock), 주문수량(bsQty)
- 	데이터 확인해서 문자열 값은 모두 VARCHAR() 
(4) 기본키 / 외래키 설정*/

-- 기본키,출판사번호,도서번호,고객번호,주문번호
ALTER TABLE book MODIFY bookNo varchar(10); 
ALTER TABLE publisher MODIFY pubNo varchar(10); 
ALTER TABLE client MODIFY clientNo varchar(10); 
ALTER TABLE publisher MODIFY pubName varchar(10); 
ALTER TABLE booksale MODIFY bsNo varchar(10); 
 
-- client
ALTER TABLE client MODIFY clientName varchar(5);
ALTER TABLE client MODIFY clientAddress varchar(50);
ALTER TABLE client MODIFY clientBirth varchar(10);
ALTER TABLE client MODIFY clientHobby varchar(50);
ALTER TABLE client MODIFY clientGender varchar(5);
ALTER TABLE client MODIFY clientPhone varchar(13);

-- 날짜
ALTER TABLE booksale MODIFY bsDate date; 
ALTER TABLE book MODIFY bookDate date; 

-- 기본키 외래키 설정
-- 기본키 출판사번호, 도서번호, 고객번호, 주문번호(bsNo)
ALTER TABLE publisher ADD PRIMARY KEY (pubNo);
ALTER TABLE book ADD PRIMARY KEY (bookNo);
ALTER TABLE booksale ADD PRIMARY KEY (bsNo);
ALTER TABLE client ADD PRIMARY KEY (clientNo);


-- 외래키 
/* 
ALTER TABLE booksale MODIFY clientNo varchar(10); 
ALTER TABLE booksale MODIFY bookNo varchar(10); 
ALTER TABLE book MODIFY pubNo varchar(10); */

ALTER TABLE booksale ADD FOREIGN KEY (clientNo) REFERENCES client (clientNo);
ALTER TABLE booclientksale ADD FOREIGN KEY (bookNo) REFERENCES book (bookNo);
ALTER TABLE book add foreign key (pubNo) references publisher(pubNo);

ALTER TABLE booksale DROP FOREIGN KEY booksale_ibfk_3;
ALTER TABLE booksale DROP FOREIGN KEY booksale_ibfk_4;

-- ------------------------------------------------------------------------------------
-- book테이블에서 모든 데이터 검색하여 출력
-- 모든 열(*) 출력
select*from book;

-- 도서명과 가격만 검색하여 출력(특정 열만 선택)
select bookName,bookPrice from book;

-- 저자만 검색하여 출력
select bookAuthor from book;
-- 저자 검색하여 출력 &중복되는 이름은 한번만 출력
select distinct bookAuthor from book;

-- ------------------------------------------------------------------------------
-- 비교 (=,<,>,<=,>=,!=)
-- 저자가 '홍길동'인 도서의 도서명 저자 출력
select bookName,bookAuthor from book where bookAuthor ='홍길동';

select bookName,bookPrice,bookStock from book where bookPrice >=30000;
select bookName,bookStock from book where bookStock >=3 and bookStock<=5;

-- between ~and~ 사용
select bookName,bookStock from book where bookStock between 3 and 5;

-- 출판사 명이 '서울출판사'(1)와 '도서출판 강남(2)'인 도서의 도서명 출판사 번호 출력
select bookName,pubNo from book where pubNo In ('1','2');
-- '1'이거나 '2' 인행

-- 출판사명이 '도서출판 강남'이 아닌 도서의 도서명 출판사 번호 출력
select bookName,pubNo from book where pubNo not in('2');
-- 비교연산자 사용시
select bookName,pubNo from book where pubNo !='2';

-- 도서출판 강남 에서 출간한 책 중 저자가 '홍길동'인 도서의 도서명,저자,출판사 번호
select bookName,bookAuthor,pubNo from book where pubNo in ('2') and bookAuthor in ('홍길동');  

-- --------------------------------------------------------------------------------------------------
-- Null(is null / is not null/
-- 먼저 클라이언트 테이블 확인:null 값 없음
select*from client;

-- null값으로 저장
update client set clientHobby=null where clientName ='호날두';
update client set clientHobby=null where clientName ='샤라포바';
update client set clientHobby=null where clientName ='살라';
-- 모든 고객명 ,취미 출력
select clientName,clientHobby from client ;

-- 취미에 NULL 값이 들어있는 행만 출력
select clientName,clientHobby from client where clientHobby  is Null;

-- 취미가 null 값이 아닌 행만 출력
select clientName,clientHobby from client where clientHobby  is not null;

-- 취미에 공백이 들어 있는 행만 출력
select clientName,clientHobby from client where clientHobby = '   ';-- 스페이스 수 상관없음


-- ------------------------------------------------------------------------------------
-- 논리 (and, or)
-- 저자가 '홍길동'이면서 재고 3권이상인 모든 도서 출력
select * from book where bookAuthor ='홍길동' AND bookStock >='3';


-- 저자가 홍길동 이거나 성춘향인 모든 도서 출력
select * from book where bookAuthor ='홍길동' OR bookAuthor ='성춘향';

-- ----------------------------------------------------------------
-- 패턴매칭 (like)
-- 출판사 테이블에서 출판사에 '출판사'가 포함된 모든 행 출력
select pubName from publisher where pubName like '%출판사%';

-- 고객 테이블에서 출생연도가 1990년대인 고객 모두 출력(고객명,생년월일)

select clientName,clientBirth from client where clientBirth between'1990'And'1999';
select clientName,clientBirth from client where clientBirth like "199%";

-- 고객테이블에서 이름이 4글자인 고객 모두 출력
select clientName from client where clientName like '____';

-- 도서 테이블에서 도서명에 '안드로이드'가 포함되어 있지 않는 모든 도서의 도서명 출력
select bookName from book where bookName not like '안드로이드';


-- 1.  고객 테이블에서 고객명, 생년월일, 성별 출력
select clientName,clientBirth,clientGender from client ;
-- 2.  고객 테이블에서 주소만 검색하여 출력 (중복되는 주소는 한번만 출력)
select distinct clientAddress from client ;
-- 3. 고객 테이블에서 취미가 '축구'이거나 '등산'인 고객의 고객명, 취미 출력
select clientHobby,clientName from client where clientHobby ='축구' or clientHobby= '등산'; 
-- 4.  도서 테이블에서 저자의 두 번째 위치에 '길'이 들어 있는 저자명 출력 (중복되는 저자명은 한번만 출력)
select bookAuthor from book where bookAuthor like '%_길_%';
-- 5.  도서 테이블에서 발행일이 2022년인 도서의 도서명, 저자, 발행일 출력
select bookName,bookAuthor,bookDate from book where bookDate between date ("2022-01-01") And Date("2022-12-31");


-- 6.  도서판매 테이블에서 고객번호1, 2를 제외한 모든 판매 데이터 출력
select *from booksale where clientNo not in ('1','2');
-- 7.  고객 테이블에서 취미가 NULL이 아니면서 주소가 '서울'인 고객의 고객명, 주소, 취미 출력
select clientName,clientAddress,clientHobby from client where (clinentHobby is not null) AND (clientAddress like '%서울%');  
-- 8.  도서 테이블에서 가격이 25,000원 이상이면서 저자 이름에 '길동'이 들어가는 도서의 도서명, 저자, 가격, 재고 출력
select bookName,bookAuthor,bookPrice,bookStock from book where bookPrice>=25000 and bookAuthor like "%길동%";
-- 9.  도서 테이블에서 가격이 20,000 ~ 25,000원인 모든 도서 출력
select*from book where bookPrice>=25000 And bookPrice<=20000;
-- 10.   도서 테이블에서 저자명에 '길동'이 들어 있지 않는 도서의 도서명, 저자 출력
select  bookName,bookAuthor from book where bookAuthor not in ('길동');

 
-- 도서명 순으로 도서 검색: 기본 오름차순 정렬:asc
select*from book 
order by bookName asc;

-- 도서명 순으로 내림차순 정렬해서 출력 :desc
select*from book 
order by bookName desc;

-- 도서 테이블에서 재고수량을 기준으로 내림차순 정렬하여 도서명 저자 재고 출력 
-- 재고 수량이 동일한 경우 저자명으로 오름차순 2차 정렬
select bookName, bookAuthor, bookStock from book
order by bookStock desc, bookAuthor asc;-- asc 생략가능

-- 상위 n개만 출력: limit n
select *from book 
order by bookName
limit 5;
-- 또는 offset 으로 설정가능 (offset 시작위치) : 0이면 첫번째부터 시작 
select *from book 
order by bookName
limit 5 offset 1;

-- 또는 limit  시작, 개수
select *from book 
order by bookName
limit 0, 5;-- 첫번째부터 5개


 
/*집계 함수
-     SUM() : 합계
-     AVG() : 평균
-     COUNT() : 선택된 열의 행 수 반환 (null 값 제외)
-     COUNT(*) : 전체 행의 수
-     MAX() : 최대
-     MIN() : 최소*/

-- sum(): 합계
-- 도서테이블에서 총 재고수량 계산하여 출력
-- 열이름 없이 총합만 출력(출력되는 위치는 열의 자리 (select 절))

 select sum(bookStock) from book; 
 -- 열 이름 지정하지 않으니까 sum(bookStock)로 열이름 출력됨
 
 -- 열이름 sum of bookStock 로 출력/ 한글로도 가능 (AS "이름")/작은,큰 따옴표 다 가능
  select sum(bookStock) AS "sum of bookStock" 
  from book; 
-- 띄어쓰기 없이 붙여쓰면 따옴표 없어도 가능
  select sum(bookStock) AS sumofbookStock 
  from book; 
  
  -- AS생략 가능
select sum(bookStock) sumofbookStock 
  from book; 
  
select sum(bsQty) 총주문량
from booksale where clientNo ='2';

select clientNo ,bsQty from booksale;

-- max() /Min()
-- 도서판매 테이블에서 최대/최소 주문량 출력
select max(bsQty) 최대주문량, min(bsQty) 최소주문량
from booksale;

-- AVG()=평균값 //round() = 수치,소수이하 자릿수  지정
select round(avg(bookPrice)) 도서평균가,
		max(bookPrice) 도서최고가,
        min(bookPrice) 도서최저가 from book;
        
-- 도서 판매 테이블에서 도서판매 건수 출력
-- count(): 행의 수 반환
-- 모든 행의 수를 계산할 때 count(bookNo)가능 /count(*)
-- count(기본키) :기본키는 null 값, 빈 값이 들어갈 수 없기 때문에 모든 행 수를 반환
select count(bsNo) 총판매건수 from booksale; -- 9건
select count(*) 총판매건수 from booksale;


-- 총 판매량 출력
select sum(bsQty) 총판매량 from booksale; -- 28개
select *from booksale;

-- 고객테이블에서 총 고객수 출력
select count(clientNo) AS '총 고객 수' from client;-- 9


-- -------------------------------------------------------
-- 고객 테이블에서 취미 갯수 출력/ NULL 값 3개 
select count(clientHobby) AS '취미' from client;-- 7

select count(clientHobby) As 취미 from client; -- 6개
-- count(): NULL 값은 제외

select clientNo,clientHobby As '취미' from client;
-- null 3개 공백 1개


-- 취미 열에서 값이 들어 있는 행의 수 출력
-- not in(' ')

-- 도서판매 테이블에서 판매된 도서별(도서번호별)로 주문수량 합계출력
select bookNo,sum(bsQty) AS '주문수량합계'
from booksale
group by bookNo;

select bookNo, bsQty from bookSale;

-- 도서 테이블에서 출판사 별로 재고수량 합계
select pubNo,sum(bookStock) AS '재고수량합계'
from book
group by pubNo;

-- group by 절에서의 정렬
select bookNo,sum(bsQty) AS '주문수량합계'
from booksale
group by bookNo
order by bookNo;

-- 또는 열번호로 지정 가능 
select bookNo,sum(bsQty) AS '주문수량합계'
from booksale
group by bookNo
order by 1;-- 첫번째 열

select bookNo,sum(bsQty) AS '주문수량합계'
from booksale
group by bookNo
order by 2;-- 두번째 열

-- 열 이름에 따옴표 있는경우 오류는 없으나 정렬이 안됨
select bookNo,sum(bsQty) AS '주문수량합계'
from booksale
group by bookNo
order by '주문수량 합계';-- 오류는 없으나 정렬이 안됌

-- 따옴표없고 띄어쓰기 없으면 정렬 됨
select bookNo,sum(bsQty) AS '주문수량합계'
from booksale
group by bookNo
order by 주문수량합계 ;

-- -----------------------------------------------------------
/* HAVING 절
- 	HAVING 검색조건
-     GROUP BY 절에 의해 구성된 그룹들에 대해 적용할 조건 기술
- 	SUM, AVG, MAX, MIN, COUNT 등의 집계함수와 함계 사용
- 	주의!
-     반드시 GROUP BY 절과 같이 사용
-     WHERE 절보다 뒤에
-     검색조건에는 집계함수가 와야 한다 */

-- 도서테이블에서 가격이 25000이상인 도서에 대하여
-- 출판사별로 (그룹)로 도서 수 합계출력

-- having 조건이 없는 경우
select pubNo,count(bookNo) AS '총 도서수'
from book where bookPrice>=25000
group by pubNo;

-- having 조건이 있는 경우 
-- (group by결과에 대한 조건) 단, 총 도서수가  2이상만 출력
select pubNo,count(bookNo) AS '총 도서수'
from book where bookPrice>=25000
group by pubNo
having count(bookNo)>=2; 

select pubNo,count(bookNo) AS  총도서수
from book where bookPrice>=25000
group by pubNo
having 총도서수>=2; 
-- ---------------------------------------------------------------------------
-- 1.  도서 테이블에서 가격 순으로 내림차순 정렬하여,  도서명, 저자, 가격 출력 
-- 	(가격이 같으면 저자 순으로 오름차순 정렬)

select bookName,bookAuthor,bookPrice
from book 
order by bookPrice desc, bookAuthor asc;
-- 2.  도서 테이블에서 저자에 '길동'이 들어가는 도서의 총 재고 수량 계산하여 출력
select sum(bookStock) AS '총 재고 수량' 
from book
where bookAuthor like "%길동%";

-- 3.  도서 테이블에서 ‘서울 출판사' 도서 중 최고가와 최저가 출력
select max(bookPrice) AS'도서 최고가',min(bookPrice) AS'도서 최저가'
from book
where pubNo ='1';

-- 4.  도서 테이블에서 출판사별로 총 재고수량과 평균 재고 수량 계산하여 출력 
-- 	(‘총 재고 수량’으로 내림차순 정렬)

select pubNo, sum(bookStock) as '총 재고수량', round(avg(bookStock)) as '평균 재고수량'
from book
group by pubNo
order by 2 desc;


-- 5.  도서판매 테이블에서 고객별로 ‘총 주문 수량’과 ‘총 주문 건수’ 출력. 
-- 	단 주문 건수가 2이상인 고객만 해당
select clientNo, sum(bsQty) as '총 주문 수량', count(clientNo) as '총 주문 건수'
from bookSale
group by clientNo
having count(*) >= 2;














