
-- 조인 (JOIN)

-- 다양한 join문 표기 방법(1)
-- WHERE 조건 사용
SELECT client.clientNo, clientName,bsQty
FROM client, booksale
WHERE client.clientNo = booksale.clientNo;
-- ambiguous 오류 
-- 양 쪽 테이블에 공통되는 열 이름 앞에 모호성을 없애기 위해 
-- 테이블 명을 표기 (소속테이블명이 없으면 오류) :ex)client.clientNo
-- client 테이블과 booksale 테이블을 공통되는 열  clientNo을 기준으로 INNER JOIN
-- 내부조인:조인한 결과의 의미?
-- 한번이라도 주문한 적이 있는 고객/조인 결과에 포함되지 않은 고객은 한번도 주문한 적이 없는 고객

-- 다양한 join문 표기 방법(2)
-- 양쪽 테이블에 공통되지는 않지만 모든 열 이름에 테이블명 붙임
-- 서버에ㅔ 찾고자 하는 열의 정확한 위치를 알려주므로 성능이 향상
SELECT client.clientNo, client.clientName,booksale.bsQty
FROM client, booksale
WHERE client.clientNo = booksale.clientNo;

-- 다양한 join문 표기 방법(3)
-- 테이블명 대신 별칭(Alias)사용
SELECT C.clientNo, C.clientName, BS.bsQty
FROM client C,booksale BS
WHERE C.clientNo =BS.clientNo;
-- 다양한 join문 표기 방법(4)
-- JOIN ON 명시
SELECT C.clientNo, C.clientName, BS.bsQty
FROM booksale BS
	JOIN client C
    ON C.clientNo=BS.clientNo;
    
-- 다양한 join문 표기 방법(5)
-- INNER JOIN ON 명시/ 가장 많이 사용되는 방법,우리는 이 방법사용
SELECT C.clientNo, C.clientName, BS.bsQty
FROM booksale BS
	INNER JOIN client C
    ON C.clientNo=BS.clientNo;

-- client 테이블과 booksale 테이블 위치 바꿔도 됨
SELECT C.clientNo, C.clientName, BS.bsQty
FROM client C
	INNER JOIN booksale BS
    ON C.clientNo=BS.clientNo;


-- ---------------------------------------------
-- client 테이블과 booksale 테이블 조인
-- 두 테이블에 공통으로 들어있는 값의 의미는 
-- 한 번이라도 도서를 주문한 적이 있는 고객 정보 출력
-- booksale  테이블 : 도서를 주문한 고객만 포함(고객번호만)

SELECT*
FROM client
	inner join booksale
    on client.clientNo =booksale.clientNo;
-- 2테이블의 모든 열 표시


-- ---------------------
-- 필요한 열만 추출 
-- 테이블명 대신 별칭 사용
-- 한번이라도 도서를 주문한 적이 있는 고객의 고객번호와 고객명 추출
SELECT C.clientNo, C.clientName
FROM client C
	inner join booksale BS
    on C.clientNo =BS.clientNo;
    
-- 중복되는 행은 한번만 출력
SELECT distinct C.clientNo, C.clientName
FROM client C
	inner join booksale BS
    on C.clientNo =BS.clientNo;
    
    
-- -----------------------------------------------
-- 3개의 테이블 결합
-- 조인조건 2개

-- 주문 된 (판매된 )도서에 대하여 고객명과 도서명 출력
SELECT C.clientName,B.bookName
FROM booksale BS
	inner join client C on C.clientNo= Bs.clientNo
    inner join book B on B.bookNo=BS.bookNo;
-- 테이블위치 변경: 결과 동일
SELECT C.clientName,B.bookName
FROM client C
	inner join booksale BS on C.clientNo= Bs.clientNo
    inner join book B on B.bookNo=BS.bookNo;
    
-- 도서를 주문한 고객의 고객정보, 주문정보,도서정보 출력
-- 주문번호,주문일, 고객번호,고객명 ,도서명,주문수량

SELECT BS.bsNo,BS.bsDate,C.clientNo,C.clientName,B.bookName,BS.bsQty
FROM booksale BS
	inner join client C on C.clientNo= Bs.clientNo
    inner join book B on B.bookNo=BS.bookNo;
    
-- 고객별로 총 주문수량 계산하여  
-- 고객명과 총 주문수량 출력
-- 총 주문수량 기준 내림차순 정렬

SELECT C.clientName, sum(BS.bsQty) as '총 주문수량'
FROM booksale BS
	inner join client C 
    on C.clientNo= Bs.clientNo
group by C.clientNo
order by '총 주문수량' desc;

-- 주문된 도서의 주문일, 고객명,도서명,도서가격,주문수량,주문액 계산하여 출력
-- 주문일 기준 오름차순 정렬

select bs.bsDate, c.clientName,b.bookName,b.bookPrice, bs.bsQty, b.bookPrice * bs.bsQty as 주문액
from booksale bs
inner join client c on c.clientNo = bs.clientNo
inner join book b on b.bookNo = bs.bookNo
order by bs.bsDate;
-- 조건 추가 2021년 이후 추문된 도서의 ~    

select bs.bsDate, c.clientName,b.bookName,b.bookPrice, bs.bsQty, b.bookPrice * bs.bsQty as 주문액
from booksale bs
inner join client c on c.clientNo = bs.clientNo
inner join book b on b.bookNo = bs.bookNo
where BS.bsDate>='2021-01-01'
order by bs.bsDate;

-- ----------------------------------------------------------
-- 1. 모든 도서에 대하여 도서의 도서번호, 도서명, 출판사명 출력
SELECT B.bookNo,B.bookName,P.pubName
FROM book B
	INNER JOIN publisher P
    ON P.pubNo=B.pubNo;
    

-- 2. ‘서울 출판사'에서 출간한 도서의 도서명, 저자명, 출판사명 출력 (조건에 출판사명 사용)
SELECT B.bookName, B.bookAuthor,P.pubName
FROM book B
	INNER JOIN publisher P 
	ON P.pubNo=B.pubNo
WHERE P.pubName='서울 출판사';


-- 3.  ‘정보출판사'에서 출간한 도서 중 판매된 도서의 도서명 출력 (중복된 경우 한 번만 출력) (조건에 출판사명 사용)
SELECT distinct B.bookName, P.pubName
FROM book B
	INNER JOIN publisher P on B.pubNo=P.pubNo
    INNER JOIN booksale BS on B.bookNo=BS.bookNo
WHERE pubName ='정보출판사';


-- 4.  도서가격이 30,000원 이상인 도서를 주문한 고객의 고객명, 도서명, 도서가격, 주문수량 출력

SELECT C.clientName, B.bookName, B.bookPrice,BS.bsQty
FROM booksale BS
	INNER JOIN client C on C.clientNo= BS.clientNo
    INNER JOIN book B on B.bookNo =BS.bookNo
WHERE B.bookPrice >=30000;


-- 5.  '안드로이드 프로그래밍' 도서를 구매한 고객에 대하여 도서명, 고객명, 성별, 주소 출력 (고객명으로 오름차순 정렬)
SELECT B.bookName, C.clientName, C.clientGender, C.clientAddress
FROM booksale BS
	INNER JOIN book B on B.bookNo=BS.bookNo
    INNER JOIN client C ON C.clientNo= BS.clientNo
WHERE bookName='안드로이드 프로그래밍'
ORDER BY C.clientName;


-- 6.  ‘도서출판 강남'에서 출간된 도서 중 판매된 도서에 대하여 ‘총 매출액’ 출력
SELECT P.pubName,sum(BS.bsQty*B.bookPrice) AS '총 매출액'
FROM book B
	INNER JOIN publisher P ON P.pubNo=b.pubNo
    INNER JOIN booksale BS ON BS.bookNo =B.bookNo
WHERE P.pubName='도서출판 강남';
-- 7.  ‘서울 출판사'에서 출간된 도서에 대하여 판매일, 출판사명, 도서명, 도서가격, 주문수량, 주문액 출력
SELECT BS.bsDate,P.pubName,B.bookName,B.bookPrice,BS.bsQty,B.bookPrice*BS.bsQty
FROM booksale BS
	INNER JOIN book B ON B.bookNo=BS.bookNo
    INNER JOIN publisher P on P.pubNo=B.pubNo
WHERE P.pubName='서울 출판사';

-- 8.  판매된 도서에 대하여 도서별로 도서번호, 도서명, 총 주문 수량 출력
SELECT B.bookNo,B.bookName,sum(BS.bsQty)AS '총 주문 수량'
FROM book B
	INNER JOIN  booksale BS on B.bookNo =BS.bookNo
 group by B.bookNo;

-- 9.  판매된 도서에 대하여 고객별로 고객명, 총구매액 출력 ( 총구매액이 100,000원 이상인 경우만 해당)
SELECT C.clientName , sum(B.bookPrice*BS.bsQty)AS'총 구매액'
FROM booksale BS
	INNER JOIN client C on C.clientNo=BS.clientNo
    INNER JOIN book B on B.bookNo=BS.bookNo
GROUP BY C.clientNo
Having sum(B.bookPrice*BS.bsQty)>=100000;

-- 10. 판매된 도서 중 ＇도서출판 강남'에서 출간한 도서에 대하여 고객명, 주문일, 도서명, 주문수량, 출판사명 출력 
-- (고객명으로 오름차순 정렬)
SELECT C.clientName, BS.bsDate,B.bookName,BS.bsQty,P.pubName
FROM booksale BS
	INNER JOIN client C ON C.clientNo=BS.clientNo
    INNER JOIN book B ON B.bookNo=BS.bookNo
    INNER JOIN publisher P ON B.pubNo=P.pubNo
WHERE P.pubName='도서출판 강남'
ORDER BY C.clientName;



-- -------------------------------------------------------------------------------------
-- 외부조인 (outer join)
-- 왼쪽 테이블 기준
-- 왼쪽테이블 (client) 데이터 모두 출력
-- client에는 있지만 오른쪽 테이블 (booksale)에 없는 값은 null로 출력
-- null로 출력된 고객의 의미 :한번도 구매한 적이 없는 고객
SELECT *
FROM client C
	left outer join booksale BS
    on C.clientNo=BS.clientNo
order by C.clientNo;

-- 고객중에 한번도 구매한 적이 없는 고객의 고객번호,고객명 출력
select C.clientNo,C.clientName
from client C
left outer join booksale BS
on C.clientNo=BS.clientNo
where BS.clientNo is null
order by C.clientNo;
 
-- 도서 중에 한번도 판매된 적이 없는 도서의 도서번호, 도서명 출력
SELECT B.bookNo,B.bookName
FROM book B
	LEFT OUTER JOIN booksale BS
    ON B.bookNo=BS.bookNo
WHERE BS.bookNo IS NULL
ORDER BY B.bookNo;

-- 위의 자료에 출판사명 추가
SELECT B.bookNo,B.bookName, P.pubName
FROM book B
	inner join publisher P on p.pubNo=B.pubNo
	LEFT OUTER JOIN booksale BS ON B.bookNo=BS.bookNo
WHERE BS.bookNo IS NULL
ORDER BY B.bookNo;

-- 오른쪽 (right)테이블 기준
-- 오른쪽 테이블 (booksale) 데이터 모두 출력
SELECT*
FROM client C
	RIGHT OUTER JOIN booksale BS
    ON C.clientNo=BS.clientNo
ORDER BY C.clientNo;

-- 한번이라도 주문한 적이 있는 고객의 고객번호, 고객명 출력
-- 중복된 경우 한번만 출력

SELECT  distinct C.clientNo ,C.clientName
FROM client c
	RIGHT OUTER JOIN booksale BS
    on C.clientNo=BS.clientNo
ORDER BY C.clientNo;

-- 완전 외부 조인(full outer join)
-- MySQL에서는 full 키워드를 지원하지 않는다.
-- left join과 right join을 union해서 사용할 수 있다.

select *
from client c
	left join booksale bs
	on c.clientNo = bs.clientNo

UNION

select *
from client c
	right join booksale bs
	on c.clientNo = bs.clientNo;
