-- 서브쿼리

-- 단일 행 서브쿼리(=)
-- 고객 호날두의 주문수량 조회
-- (1)서브쿼리:client 테이블에서 고객명 '호날두'로 검색해서 client No찾음
-- (2)메인쿼리 :booksale 테이블에서 (1)에서 찾은clientNo 에 해당되는 정보를 출력
-- 고객번호 주문일 주문수량 출력

SELECT bsDate,bsQty
FROM booksale
where clientNo=(SELECT clientNo
				FROM client
                WHERE clientName='호날두');
                
-- 고객명 호날두가 주문한 총 주문수량 출력
-- (1)서브쿼리:클라이언트 테이블에서 고객명 호날두의 클라이언트 넘버 찾기
-- (2)메인쿼리 :북세일에서 클라이언트넘버에 해당되느 ㄴ주문에 대해서 총 주문수량 총합
SELECT sum(bsQty) AS'총 주문수량'
FROM booksale
WHERE clientNo =(select clientNo
					FROM client
                    WHERE clientName='호날두');
                    
-- 가장비싼도서의 도서명과 가격출력
-- (1)가장 비싼 도서 찾아서
-- (2)해당 도서의 도서명과 가격 출력
SELECT  bookName,bookPrice
FROM book
where bookPrice =( 	SELECT max(bookPrice)
					FROM book);
                    
-- --------------------------------------------------
-- 단일 행 서브퀴리 비교 연산자 사용
-- 1. 도서의 평균 가격보다 비싼 도서에 대해 도서명, 가격 출력
-- 서브쿼리에서 평균 도서 가격을  반환

SELECT bookName, bookPrice
FROM book
WHERE bookPrice >(SELECT AVG(bookPrice)
				  FROM book);
                  
-- 책의 평균 가격:26,400
select round(avg(bookPrice))
from book;

-- -------------------------------------------
-- 다중 행 서브쿼리(IN, NOT IN):여러 행 반환시 사용
-- 단일행 반환시 사용해도 된다
-- 서브쿼리 결과가 단일행인지 다중행인지 모를 경우 IN사용하면 된다

-- 도서를 구매한 적이 있는 고객의 고객명 출력
-- (1)booksale 에 있는 clientNo는 모두 구매한 고객
-- (2)client 테이블에서 (1)clientNo에 해당되는 고객의 
-- 고객번호,고객명 출력

SELECT clientName,clientNo
FROM client 
WHERE clientNo IN (SELECT clientNo
					FROM booksale);
                    
-- 한번도 주문한 적이 없는 고객의 고객번호,고객명 출력     
SELECT clientName,clientNo
FROM client 
WHERE clientNo NOT IN (SELECT clientNo
					FROM booksale);               

-- 중첩 서브쿼리
-- 도서명이 '안드로이드 프로그래밍'인 도서를 구매한 고객의 고객번호와고객명 출력
-- (1)BOOK테이블에서 도서명이 '안드로이드 프로그래밍'인 도서의 BOOKNO를 찾고
-- (2)BOOKSALE 테이블에서 (1)BOOKNO 를 구매한 고객의 CLIENTNO를 찾고 
-- (3)CLIENT 테이블에서 (2) CLIENT에 해당되는 고객의 고객번호,고객명 출력

SELECT clientName,clientNo
FROM client
WHERE clientNo IN(SELECT clientNo
				  FROM booksale 
				  WHERE bookNo IN(SELECT bookNo
								  FROM book
								  WHERE bookName='안드로이드 프로그래밍'));

-- =:결과가 1행인 경우 사용 가능 (여러 행인 경우에 사용하면 오류 )
-- IN:결과가 1행 또는 여러행 모두 사용 가능

-- 고객명 기준으로 정렬
select clientName
from client
where clientNo in (select clientNo
                    from bookSale
                    where bookNo in (select bookNo
                                        from book
                                        where bookName = '안드로이드 프로그래밍'))
order by clientName;



-- --------------------------------------------------------
-- 다중 행 서브 쿼리(EXISTS, NOT EXISTS)
-- EXISTS : 서브 쿼리 결과가 행을 반환하면 참이 되는 연산자
-- 도서를 구매한 적이 있는 고객
-- (1) bookSale에 조건에 해당되는 행이 존재하면 참 반환
-- (2) client 테이블에서 이 clientNo에 해당되는 고객의 고객번호, 고객명 출력

select clientNo, clientName
from client
where exists (select clientNo
                from bookSale
                where client.clientNo = bookSale.clientNo);
-- 참고 :위에서 IN사용한 경우
select clientNo,clientName
from client
where clientNo in (select clientNo
						from booksale);
                        
-- 한번도 주문한 적이 없는 고객의 고객번호, 고객명 출력
-- 서브쿼리에서 조건에 해당되는 행이 없으면 TRUE 반환
select clientNo, clientName
from client
where not exists (select clientNo
                  from bookSale
                  where client.clientNo = bookSale.clientNo);

-- NULL인 경우 IN과 EISTS 차이
-- clienthobby 에 null 포함
-- exists : 서브쿼리 결과에 null 값 포함
-- null 값 포함하여 모든 clientNo출력
select clientHobby from client;
select clientNo from client where exists (select clientHobby
										 from client );


-- in : 서브 쿼리 결과에 null 값 포함되지 않음
-- null 값을 갖지 않는 행만 출력
select clientNo,clientHobby
from client
where clientHobby in (select clientHoby
						from client);
                        
                        
-- ------------------------------------------------------
-- ALL :검색 조건이 서브쿼리의 결과의 모든 값에 만족하면 참이 되는 연산자/조건>all(서브쿼리)
-- 고객번호 2번이 주문한 도서의 최고 주문수량보다 더 많은 도서를 구입한 고객의 고객번호, 주문번호, 주문수량 출력
-- (2번 고객이 주문한 모든 주문 건수에서 발생한 주문수량보다 더 크면 됨)
SELECT clientNo, bsNo, bsQty
FROM booksale
WHERE bsQty> ALL(SELECT bsQty
					FROM booksale
                    WHERE clientNo='2'); 
-- clientNo 2의 주문수량		:5,2,2		
SELECT bsQty
	FROM booksale
    WHERE clientNo='2'; 
-- 모든 주문수량 확인
SELECT bsQty
FROM booksale;

-- ANY 연산자
-- 2번 고객보다 한번이라도 더 많은 주문을 한적이 있는 고객의 고객번호,주문번호,주문수량 출력
-- (최소 한번이라도 크면 됨) /2번 본인도 포함됨
SELECT clientNo, bsNo, bsQty
FROM booksale
WHERE bsQty>ANY (SELECT bsQty
				 FROM booksale
                 WHERE clientNo='2');-- 2,3,5/1,4,4,/7,8,9
                 

-- 2번제외
SELECT clientNo, bsNo, bsQty
FROM booksale
WHERE bsQty>ANY (SELECT bsQty
				 FROM booksale
                 WHERE clientNo='2')
			AND clientNo !='2'; -- 1,4,4/7,8,9

-- 1. 고객 '호날두'가 주문한 도서의 총 구매량 출력
-- (1)호날두의 clientNo 찾아서 
-- (2)booksale에서 (1)에 해당되는 총구매량 산출
SELECT sum(bsQty) AS '총 구매량'
FROM booksale
WHERE clientNo = (SELECT clientNo -- in사용가능
					FROM client
                    WHERE clientName='호날두');
-- 2. '정보출판사'에서 출간한 도서를 구매한 적이 있는 고객명 출력
-- (1)정보출판사의 pubNo 찾기
-- (2) (1)에서 출간한 도서의 도서번호bookNo 찾기 
-- (3) (2)bookNo를 구매한 고객번호clientNo 찾기
-- (4) (3)clientNo에 해당되는 clientName출력 
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo
					FROM booksale
                    WHERE bookNo IN(SELECT bookNo
									FROM book 
									WHERE pubNo IN (SELECT pubNo -- in 사용 가능
													FROM publisher 
													WHERE pubName='정보출판사')));
                    
                    
-- 3. 고객 '베컴'이 주문한 도서의 최고 주문수량보다 더 많은 도서를 구매한 고객명 출력
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo
					FROM booksale
                    WHERE bsQty >ANY (SELECT bsQTy FROM booksale WHERE bsQty>
                                 ANY (SELECT bsQty FROM booksale WHERE clientNo 
                                 IN(SELECT clientNo FROM client WHERE clientName='베컴')))); -- All 안나옴
																					-- ANY나옴 호날두,옴바페
-- --------------------------------------------------------------------------------------------------------
-- ALL 사용시 :메시 호날두 옴바페 나옴
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo
					FROM booksale
                    WHERE bsQty >ALL (SELECT bsQTy 
										FROM booksale 
                                        WHERE clientNo = (SELECT clientNo -- IN 사용가능
															FROM client 
                                                            WHERE clientName='베컴'))); 
 -- -----------------------------------------------------------------------------------------------------------                                
-- MAX()사용
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo
					FROM booksale
                    WHERE bsQty > (SELECT MAX(bsQTy) 
									FROM booksale 
									WHERE clientNo = (SELECT clientNo -- IN 사용가능
															FROM client 
                                                            WHERE clientName='베컴')));
    
-- ----------------------------------------------------------------------------------------------------------								
-- 4.서울에 거주하는 고객에게 판매한 도서의 총 판매량 출력
SELECT sum(bsQty) AS '서울고객의 총구매량'
FROM booksale
WHERE clientNo IN (SELECT clientNo
					From client
                    WHERE clientAddress like '서울%');
                    
-- ------------------------------------------------------------------------------------------------------------
-- 스칼라 서브쿼리
-- select 절에서 사용
-- 1 개으 ㅣ열의 스칼라 값으로 반환
-- 고객별로 총 주문수량 출력, 고객명도 같이 출력

SELECT clientNo ,(SELECT clientName
					FROM client 
                    where client.clientNo=booksale.clientNo), sum(bsQty)
FROM booksale
GROUP BY clientNo;

-- 스칼라 서브쿼리
-- 도서별로 총주문수량 출력, 도서명도 같이 출력
SELECT bookNo,sum(bsQty),(SELECT bookName
										FROM book
                                        WHERE book.bookNo=booksale.bookNo)AS '도서명'
FROM booksale
group by bookNo;

-- -----------------------------------------------
/*인라인 뷰 (InLine View) 서브 쿼리  ***어려웠음****
FROM 절에서 사용
즉, 테이블명 대신 인라인 뷰 쿼리 결과(가상 테이블 : 뷰) 사용
서브 쿼리 결과로 반환되는 데이터는 다중 행, 다중 열이어도 상관 없음
가상의 뷰 형태로 제공
개발 중에 뷰가 필요한 모든 경우 뷰를 생성하면 관리할 양이 많아 트랜잭션 관리나 성능 상 문제가 발생할 수 있기 때문에 필요한 시점에 따라 필요한 뷰을 인라인 뷰로 생성해서 사용
결과는 인라인 뷰 서브쿼리에 있는 SELECT문에서 찾고자 하는 속성의 값으로만 이루어진 테이블로 반환된다.*/

-- 인라인 뷰 서브 쿼리 예
-- 인라인 뷰 서브 쿼리
-- 도서 가격이 25,000 이상인 도서에 대하여 도서별로 도서명, 도서가격, 총 판매수량, 총 판매액 출력
select bookName, bookPrice, 
	   sum(bsQty) as '총판매수량', 
       sum(bookPrice * bsQty) as '총 판매액'
from (select bookNo, bookName, bookPrice
        from book
        where bookPrice >= 25000) book, bookSale
where book.bookNo = bookSale.bookNo
group by book.bookNo
order by '총 판매액' desc;

-- 고객별 주문수량 출력 고객명,주소 출력  /인라인 뷰 서브쿼리 사용 ***잘모름****
SELECT client.clientNo,clientName 이름,clientAddress ,
		sum(bsQty) AS '주문수량'
FROM (SELECT clientNo,clientName,clientAddress
	  FROM client) client,
      (select bookPrice,bookNo
		from book)book,
        (select bookNo,clientNo,bsQty
        from booksale) booksale -- 인라인 뷰 사용,

WHERE client.clientNo=booksale.clientNo
group by client.clientNo;
