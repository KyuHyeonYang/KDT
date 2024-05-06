use mysql;

-- 사용자 계정 조회
SELECT *FROM USER;

-- 사용자 계정 생성
-- CREATE USER 계정명@호스트 identified by 비밀번호;
-- 호스트
	-- localhost :로컬에서 접근 가능
	-- 192.168.172.1: 특정 ip에서 접근 가능
	-- '%' :어디에서나 접근 가능
    

-- 계정생성
create user newuser1@'%' identified by '1111';
-- newuser1으로 Connection 생성해서  서버에 연결되는지 확인
-- 스키마 접근 불가

-- 비밀번호 변경
-- set password for '계정명'@ '호스트' ='새비밀번호';
SET PASSWORD FOR 'newuser1'@'%'='1234';
-- 서버에 연결 해본다 : 기본번호 1111로 하며 안되고  새 비밀번호 1234로 하면 접속가능

-- 계정삭제
-- DROP USER '계정명' @ '호스트';
DROP USER 'newuser1'@'%';
-- Administration/ User and Privilegs 탭에서 확인 :계정삭제됨

-- ------------------------------------------------------------
-- 권한 조회: show grants for 계정명;

-- 권한 부여 : grant 권한 on 데이터베이스.테이블 to 계정@ 호스트;
-- 모든 권한 부여 : grant all privileges on *.* to 계정@ 호스트;

-- 계정 생성
create user newuser1@'%' identified by '1111';

-- newuser1 권한 조회
show grants for newuser1; -- 아무 스키마도 안보임(권한 부여 하지 않았기 때문에)
-- 모든 권한 부여 
GRANT all privileges on *.* to newuser1@ '%';