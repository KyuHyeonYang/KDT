-- 뷰 생성
CREATE VIEW client_view
AS
SELECT clientNo, clientName,clientAddress
FROM client;

-- 뷰에서 데이터 조회(테이블 처럼 사용)
SELECT*FROM client_view;
-- 뷰를 통해 데이터 변경 가능
-- 뷰를 통해 insert 수행
-- 열 이름 리스트 생략
INSERT INTo client_view VALUES('10','케인','제주'); 
-- 원본 테이블 client 에도 insert 되었는지  확인
select*FROM client; -- 원본 테이블client 에도 데이터 insert 됨(변경가능)
-- 없는 데이터는 null값으로 저장

-- not null로 설정되어 있는 경우엔 insert안됨 아래 코드로 변경
ALTER TABLE client MODIFY clientAddress varchar(100) NULL;
ALTER TABLE client MODIFY clientGender varchar(2) NULL;

-- 주의! 뷰에 명시된 열 이외 사용 불가
-- 뷰에 없는 열 사용시 오류 
INSERT INTo client_view VALUES('11','케인','010-1111-2222','제주'); 

insert into client_view (clientNo, clientName,clientPhone,clientAddress)
values ('11','케인','010-1111-2222','제주');

-- 뷰를 통해 업데이트 수행
-- clientAddress 열은 뷰에 포함되어 있으므로 변경가능
update client_view set clientAddress='서울시' where clientNo='1';
select*from client_view; -- 뷰 데이터 변경
select*from client; -- 원본테이블 변경

-- 뷰를 통해 delete 수행
-- 뷰를 통해 삽입한 데이터 삭제 가능
-- 뷰를 통해 삽입하지 않은 데이터도 삭제가능
delete from client where clientNo='10';
select*from client_view; -- 뷰 데이터 변경확인
select*from client; -- 원본데이터 변경 확인

-- 뷰의 구조 변경 :alter 문 사용
alter view client_view
AS
select clientNo,clientName,clientAddress,clientHobby
from client;

select*from client_view;

-- 뷰 연습문제
-- 자주 사용되는 쿼리문을 뷰로 생성 
-- 뷰 이름 :top5_sales_clients
-- 총 주문액 top5 고객 출력
-- 고객번호,고객명,총주문수량,총주문액 출력

-- 이너조인사용
create view top5_sales_clients
AS
select  C.clientNo 고객번호, clientName 고객이름,
			sum(BS.bsQty) AS'총 주문수량',sum(B.bookPrice) AS'총 주문액'
FROM booksale BS
		inner join client C on BS.clientNo=C.clientNo
        inner join book B on BS.bookNo=B.bookNo
group by 고객번호
order by '총 주문액'desc
limit 0,5;


select*from top5_sales_clients;

-- 인라인 뷰 사용

create view top5_sales_clients2
AS
select  C.clientNo 고객번호, clientName 고객이름,
			sum(BS.bsQty) AS'총 주문수량',sum(B.bookPrice) AS'총 주문액'
FROM (select BS.bsQty,BS.bookNo,BS.clientNo
		from booksale BS)BS,
        (select B.bookNo,B.bookPrice
        from book B)B,
        (select C.clientNo,C.clientName
        from client C)C
where C.clientNo=BS.clientNo AND BS.bookNo=B.bookNo
group by C.clientNo
order by '총 주문액'desc
limit 5;
select*from top5_sales_clients2;

-- ------------------------------------------
-- 원본 테이블에서 데이터 변경시 뷰에 자동반영됨
-- booksale 테이블 에서 주문수량 변경하고 뷰에 바로 반영되는지 확인 : 바로 반영됨
update booksale set bsQty =5 where clientNo='4';

-- ----------------------------------------------------
-- 저장 프로시저 (stored Procedure)

drop procedure if exists clientProc;
delimiter $$
create procedure clientProc()
begin 
	select*from client;
end $$
DELIMITER ;

-- 저장 프로시저 호출
CALL clientProc();

-- 메소드=함수=프로시저
--  매개변수가 있는 저장 프로시저
-- 매개변수 유형 :IN/OUT
-- IN매개변수 :호출 시 전달되는 값을 받는 매개변수로
			-- 저장 프로시저안에서 변수로 사용
            -- 형식 :(IN 매개변수명 데이터타입(크기))
            -- 주의 !: 매개변수명이 테이블의 열이름과 동일하면 안됨

-- 프로시저 생성: 괙명을 전달받아서 해당되는 고객의 정보 출력
drop procedure if exists clientProc2;
delimiter $$
create procedure clientProc2(IN cName varchar(20))
begin 
	select*from client where clientName=cName;
end $$
DELIMITER ;

-- 호출하면서 값 전달
CALL clientProc2('호날두');

-- in매개변수가 있는 연습문제
-- 저장 프로시저 생성 :bookStockProc()
-- 재고 수량 전달하고 전달된 재고수량보다 많은 도서 정보 출력
-- 도서번호, 도서명, 저자, 가격, 재고 , 출판사명 출력
drop procedure if exists bookStockProc;
DELIMITER $$
CREATE PROCEDURE bookStockProc(in bStock int)
begin 
  SELECT B.bookNo,B.bookName,B.bookAuthor,B.bookPrice,B.bookStock,P.pubName
  from book B inner join publisher P on B.pubNo =p.pubNo
  where bookStock >bStock;
  end $$


call bookStockProc(5);

-- out: 출력 매개변수
-- 형식 :(out 매개변수명 데이터 타입)
-- 프로시저에서 결과를 반환하기 위해 사용하는 매개변수 (1개의 값을 받음)
-- 프로시저에서 출력할 값을 출력 매개변수에 저장하고 
 -- select into 출력 매개변수;
-- 저장 프로시저 call하면서 출력매개변수 값을 받아서 @변수에 저장하고 사용
	-- call 프로시저명(@변수);
    -- select @변수;
-- out 매개변수가 있는 저장 프로시저

drop procedure if exists bookMaxProc;
DELIMITER $$
create procedure bookMaxProc(out maxPrice INT)
begin
select MAX(bookPrice)into maxPrice from book;
end$$
DELIMITER ;

-- 호출하면 프로시저에서  maxPrice 변수에 결과값을 저장하여 반환
-- 반환된 값을 변수 (@maxPrice)로 받아서 출력
CALL bookMaxProc(@maxPrice);
select @maxPrice;

-- out 매개변수 연습문제
-- 도서가격이 25,000원 이상인 도서수를 out매겨번수로 전달하여 출력
drop procedure if exists bookPriceProc;
DELIMITER $$
create procedure bookPriceProc(out bPrice INT)
begin
select (select bookNo, bookName, bookPrice
        from book
        where bookPrice >= 25000) book;
end$$
DELIMITER ;
CALL bookPriceProc(@bookPrice>=25000);
select @bPrice;-- 오류남
-- ---------------------------------------------------------------------
-- 작동함
drop procedure if exists bookCountProc;
DELIMITER $$
create procedure bookCountProc(out bCount INT) -- 도서수를 out매개변수 bcount에 저장
begin
select count(*)into bCount
from book
where bookPrice>=25000;
end$$
DELIMITER ;
CALL bookCountProc(@bCount);
select @bCount;

-- IN/OUT 매개변수 둘 다 사용하는 경우 
-- 프로시저명:bookPriceCountProc
-- 금액을 전달하고 이 금액 이상에 해당되는 도서 수 반환하는 프로시저 
drop procedure if exists bookPriceCountProc;
DELIMITER $$
create procedure bookPriceCountProc(in bPrice int,out bCount INT) -- 도서수를 out매개변수 bcount에 저장
begin
select count(*)into bCount 
From book 
where bookPrice>=bPrice;

end$$
DELIMITER ;

CALL bookPriceCountProc(25000,@bCount);
select @bCount;

-- if 문

/*
   IF~THEN
   ELSE
   END IF;
*/

DROP PROCEDURE IF EXISTS bookPriceCheckProc; -- 동일한 이름의 프로시저 존재하면 삭제하고
DELIMITER $$
CREATE PROCEDURE bookPriceCheckProc(IN bNo VARCHAR(10)) -- 새로 생성
BEGIN
	-- 변수 선언 
    DECLARE bAVG INT;
    DECLARE bPrice INT;
    
    -- 도서 평균 가격 계산해서 변수 bAVG에 저장  
    SELECT AVG(bookPrice) INTO bAVG FROM book;
    
    -- 전달된 도서번호에 해당되는 도서가격을 찾아서 변수 bPrice에 저장 
    SELECT bookPrice INTO bPrice FROM book WHERE bookNo = bNo;
    
    IF bPrice >= bAVG THEN
		SELECT bAVG 평균, bPrice 도서가격, '평균가 이상' 가격수준;
    ELSE 
		SELECT bAVG 평균, bPrice 도서가격, '평균가 이하' 가격수준;
	END IF;    
END $$
DELIMITER ;

CALL bookPriceCheckProc('1006');

-- 재고 수준 확인하는 프로시저
-- 프로시저명:bookStockCheckProc
-- 도서번호 전달받아서 해당도서의 재고 수량 확인하고 
-- 재고가 7이상이면 
-- '재고상황'열 이름으로 '재고수준위험'출력
-- 재고가 7 미만이면 '재고 수준 보통'출력
DROP PROCEDURE IF EXISTS bookStockCheckProc; -- 동일한 이름의 프로시저 존재하면 삭제하고
DELIMITER $$
CREATE PROCEDURE bookStockCheckProc(IN bNo VARCHAR(10)) -- 새로 생성
BEGIN
	-- 변수 선언 
    
    DECLARE bStock INT;
    
    -- 도서재고수량 확인해서 변수 bStock에 저장  
    SELECT bookStock INTO bStock FROM book where bookNo=bNo;
    
    IF bStock >= 7 THEN
		SELECT bStock 재고  , '재고 수준 보통' 재고상황;
    ELSE 
		SELECT bStock 재고 , '재고 수준 위험' 재고상황;
	END IF;    
END $$
DELIMITER ;

CALL bookStockCheckProc('1003');


-- case 문

-- case문 예제
-- 고객번호 전달하면 '~년대생'출력
drop procedure if exists clientYearCheckProc;
DELIMITER $$
create procedure clientYearCheckProc(in cNo Varchar(10))
begin
select clientNo,clientName,
		case
			when substr(clientBirth,1,3) = '198' then '1980년대생'
			when substr(clientBirth,1,3) = '197' then '1970년대생'
			when substr(clientBirth,1,3) = '199' then '1990년대생'
            else '2000년대생'
        end AS 세대
from client
where clientNo=cNo;
end$$
DELIMITER ;

call clientYearCheckProc('9');

-- case 문 연습문제 
-- 한번이라도 주문한 적이 있는 고객을 대상으로 해서 
-- 고객 등급을 분류하는 프로시저 생성
-- 고객번호를 전달받아서 고객번호 ,고객명,총주문액,고객등급 출력
-- 고객 등급
drop procedure if exists clientClassProc;
DELIMITER $$
create procedure clientClassProc(in cNo Varchar(10))
begin
select C.clientNo 고객번호 ,clientName 고객명,sum(bsQty*bookPrice) 총주문액,
		case
			when  sum(bsQty*bookPrice)>=200000 then '최우수'
			when  sum(bsQty*bookPrice)>=100000 then '우수'
			when  sum(bsQty*bookPrice)>=50000 then '보통'
            else '관심고객'
        end AS 고객등급
FROM client C
	inner join booksale BS on BS.clientNo=C.clientNo
    inner join book B on BS.bookNo=B.bookNo
	
where C.clientNo=cNo
group by C.clientNo;

end$$
DELIMITER ;

call clientClassProc('3');
-- -----------------------------------------------------------------------------------
-- 또는 
DROP PROCEDURE IF EXISTS clientClassProc2;
DELIMITER $$
CREATE PROCEDURE clientClassProc2(IN cNo VARCHAR(10))
BEGIN
	
    DECLARE total INT;
    
    SELECT SUM(B.bookPrice * BS.bsQty) 총주문액 INTO total 
    FROM booksale BS 
		INNER JOIN book B ON B.bookNo = BS.bookNo
    WHERE BS.clientNo = cNo
    GROUP BY BS.clientNo;	

	SELECT clientNo, clientName, total 총주문액,
	   CASE
		WHEN total >= 200000 THEN '최우수'
		WHEN total >= 100000 THEN '우수'
		WHEN total >= 50000 THEN '보통'
		ELSE '관심고객'
	   END AS 고객등급
	FROM client
	WHERE clientNo = cNo;
END $$
DELIMITER ;
