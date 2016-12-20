-- 관리자 계정 접속
conn system/system;

-- 관리자 계정으로 oshare/oshare 계정생성
create user oshare identified by oshare;

-- 계정 lock 풀기
alter user oshare identified by oshare account unlock;

-- 기본권한 설정(create table / insert / update / delete / select)
grant connect, resource to oshare;

-- 권한주기(create session, create table, create view, create sequence)
grant create session, create table, create view, create sequence to oshare;

-----------------------------------------------------------------------------------------------------------
SELECT * FROM TAB;

-- oshare로 로그인
conn oshare/oshare;
SHOW USER;

/* 시퀀스 생성 / 초기화 */
-- BOARD
DROP SEQUENCE SEQ_BOARD_NO;
CREATE SEQUENCE SEQ_BOARD_NO
START WITH 1
INCREMENT BY 1;

-- CART
DROP SEQUENCE SEQ_CART_NO;
CREATE SEQUENCE SEQ_CART_NO
START WITH 1
INCREMENT BY 1;

-- COMMENTS
DROP SEQUENCE SEQ_COMMENT_NO;
CREATE SEQUENCE SEQ_COMMENT_NO
START WITH 1
INCREMENT BY 1;

-- MESSAGE
DROP SEQUENCE SEQ_MESSAGE_NO;
CREATE SEQUENCE SEQ_MESSAGE_NO
START WITH 1
INCREMENT BY 1;

-- PRODUCT_REVIEW
DROP SEQUENCE SEQ_REVIEW_NO;
CREATE SEQUENCE SEQ_REVIEW_NO
START WITH 1
INCREMENT BY 1;

-- RESERVATION
DROP SEQUENCE SEQ_RESERV_NO;
CREATE SEQUENCE SEQ_RESERV_NO
START WITH 1
INCREMENT BY 1;

-- SHARING
DROP SEQUENCE SEQ_SHARING_NO;
CREATE SEQUENCE SEQ_SHARING_NO
START WITH 1
INCREMENT BY 1;

-- MEMBER
DROP SEQUENCE SEQ_MEMBER_NO;
CREATE SEQUENCE SEQ_MEMBER_NO
START WITH 1
INCREMENT BY 1;

-- MEMBER_GRADE
DROP SEQUENCE SEQ_MEMBER_GRADE_NO;
CREATE SEQUENCE SEQ_MEMBER_GRADE_NO
START WITH 1
INCREMENT BY 1;

-- WISHLIST
DROP SEQUENCE SEQ_WISHLIST_NO;
CREATE SEQUENCE SEQ_WISHLIST_NO
START WITH 1
INCREMENT BY 1;


/*  테이블 생성 / 초기화 */

-- 회원정보
DROP TABLE MEMBER CASCADE CONSTRAINTS;
CREATE TABLE MEMBER (
  MEMBER_NO               NUMBER CONSTRAINT UNIQUE_MEMBER_NO  UNIQUE,
	MEMBER_ID               VARCHAR2(30)  NOT NULL CONSTRAINT MEMBER_ID_PK PRIMARY KEY,
	MEMBER_PWD              VARCHAR2(30)  NOT NULL ,
	MEMBER_NAME             VARCHAR2(30)  NOT NULL ,
	MEMBER_BIRTH            DATE  NOT NULL ,
	MEMBER_ADDR             VARCHAR2(300)  NOT NULL ,
	MEMBER_BANK             VARCHAR2(60)  NOT NULL ,
	MEMBER_ACCOUNT          VARCHAR2(16)  NOT NULL ,
	MEMBER_VALID_MONTH      NUMBER  NOT NULL ,
	MEMBER_VALID_YEAR       NUMBER  NOT NULL ,
	MEMBER_SHARING_COUNT    NUMBER  NULL ,
	MEMBER_PHONE            VARCHAR2(15)  NULL 
);

-- BOARD생성
DROP TABLE BOARD CASCADE CONSTRAINTS;
CREATE TABLE BOARD (
   BOARD_NO                  NUMBER  NOT NULL CONSTRAINT BOARD_NO_PK PRIMARY KEY ,
  MEMBER_ID                 VARCHAR2(30)  NOT NULL CONSTRAINT BOARD_MEMBER_ID_FK REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE ,
   PRODUCT_NAME              VARCHAR2(50)  NOT NULL ,
   PRODUCT_CATEGORY          VARCHAR2(50)  NOT NULL ,
   BOARD_TYPE                VARCHAR2(50)  NOT NULL ,
   PRODUCT_PRICE_PER_DAY     NUMBER  NOT NULL ,
   PRODUCT_CONDITION         VARCHAR2(10)  NOT NULL ,
   DEALING_TYPE              VARCHAR2(20)  ,
   PRODUCT_DETAIL            VARCHAR2(4000)  NOT NULL ,
   REG_DATE                  DATE  NOT NULL ,
   THUMBNAIL                 VARCHAR2(500) ,
   VIEWCOUNT                 NUMBER  NOT NULL 
);
commit;
select * from board;
-- 예약
DROP TABLE RESERVATION CASCADE CONSTRAINTS;
CREATE TABLE RESERVATION (
	RESERV_NO             NUMBER  NOT NULL CONSTRAINT RESERV_NO_PK PRIMARY KEY ,
	BOARD_NO              NUMBER  NOT NULL CONSTRAINT RESERV_BOARD_NO_FK REFERENCES BOARD(BOARD_NO) ON DELETE CASCADE,
	RESERV_START          DATE  NOT NULL ,
	RESERV_END            DATE  NOT NULL ,
	REG_DATE              DATE  NOT NULL 
);

-- SHARING 현황
DROP TABLE SHARING CASCADE CONSTRAINTS;
CREATE TABLE SHARING (
	SHARING_NO            NUMBER  NOT NULL CONSTRAINT SHARING_NO_PK PRIMARY KEY ,
  BOARD_NO              NUMBER  NOT NULL CONSTRAINT BOARD_NO_FK REFERENCES BOARD(BOARD_NO) ON DELETE CASCADE,
  SELLER_ID             VARCHAR2(30)  NOT NULL CONSTRAINT SELLER_ID_FK REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE,
	BUYER_ID              VARCHAR2(30)  NOT NULL CONSTRAINT BUYER_ID_FK REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE,
	SHARING_START         DATE  NOT NULL ,
	SHARING_END           DATE  NOT NULL ,
	TRANSACTION_STATE     VARCHAR2(30)  NOT NULL ,
	TOTAL_PRICE           NUMBER  NULL ,
	PRODUCT_COUNT         NUMBER  NOT NULL 
);

-- 장바구니생성
DROP TABLE CART CASCADE CONSTRAINTS;
CREATE TABLE CART (
	CART_NO          NUMBER  NOT NULL CONSTRAINT CART_NO_PK PRIMARY KEY ,
	BOARD_NO         NUMBER  NOT NULL ,
	MEMBER_ID        VARCHAR2(30)  NOT NULL CONSTRAINT MEMBER_ID_FK REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE
);

-- 댓글 생성
DROP TABLE COMMENTS CASCADE CONSTRAINTS;
CREATE TABLE COMMENTS (
	COMMENT_NO               NUMBER  NOT NULL CONSTRAINT COMMENT_NO_PK PRIMARY KEY ,
	BOARD_NO                 NUMBER  NOT NULL CONSTRAINT COMMENTS_BOARD_NO_FK REFERENCES BOARD(BOARD_NO) ON DELETE CASCADE,
	comment_subject			 varchar2(30),
	COMMENT_CONTENTS         VARCHAR2(600) NOT NULL ,
 	MEMBER_ID                VARCHAR2(30)  NOT NULL CONSTRAINT COMMENTS_MEMBER_ID_FK REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE,
	PARENT_COMMENT_NO        NUMBER  CONSTRAINT COMMENTS_PARENT_COMMENT_NO_FK REFERENCES COMMENTS(COMMENT_NO) ON DELETE CASCADE, 
  	REG_DATE                 DATE  NOT NULL
);

-- 배송지 생성(MEMBER_ID, DELIVERY_NAME 복합키)
DROP TABLE DELIVERY_LOCATION CASCADE CONSTRAINTS;
CREATE TABLE DELIVERY_LOCATION (
	MEMBER_ID                VARCHAR2(30)  NOT NULL CONSTRAINT DELIVERY_MEMBER_ID_FK REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE ,
	DELIVERY_NAME            VARCHAR2(30)  NOT NULL ,
	DELIVERY_LOCATION_ADDR   VARCHAR2(300)  NOT NULL ,
  CONSTRAINT COMPLEX_DELIVERY_PK PRIMARY KEY(MEMBER_ID, DELIVERY_NAME)
);

-- 쪽지
DROP TABLE MESSAGE CASCADE CONSTRAINTS;
CREATE TABLE MESSAGE (
	MESSAGE_NO              NUMBER CONSTRAINT MESSAGE_NO_PK PRIMARY KEY ,
	SENDER                  VARCHAR2(30)  NOT NULL CONSTRAINT MESSAGE_SENDER_FK REFERENCES MEMBER(MEMBER_ID) ,
	RECEIVER                VARCHAR2(30)  NOT NULL CONSTRAINT MESSAGE_RECEIVER_FK REFERENCES MEMBER(MEMBER_ID) ,
	MESSAGE_CONTENT         VARCHAR2(300)  NULL ,
	SENDING_DATE            DATE  NOT NULL  
);

-- 상품후기
DROP TABLE PRODUCT_REVIEW CASCADE CONSTRAINTS;
CREATE TABLE PRODUCT_REVIEW (
	REVIEW_NO                         NUMBER  NOT NULL CONSTRAINT REVIEW_NO_PK PRIMARY KEY,
	MEMBER_ID                         VARCHAR2(30)  NOT NULL CONSTRAINT REVIEW_MEMBER_ID_FK REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE,
	PRODUCT_REVIEW_CONTENTS           VARCHAR2(600)  NOT NULL ,
	REG_DATE                          DATE  NOT NULL ,
	BOARD_NO                          NUMBER  NOT NULL CONSTRAINT REVIEW_BOARD_NO_FK REFERENCES BOARD(BOARD_NO) ON DELETE CASCADE,
	REVIEW_PARENT_NO				number,
	review_subject					varchar2(30)		
);
insert into PRODUCT_REVIEW values(SEQ_REVIEW_NO.nextval,'eee','참 좋네요',sysdate,2)

select * from product_review;	

	SELECT
    P.REVIEW_NO , M.MEMBER_ID , P.PRODUCT_REVIEW_CONTENTS ,	P.REG_DATE   
		FROM BOARD B JOIN MEMBER M
		ON B.BOARD_NO='2' JOIN product_review P ON B.BOARD_NO = P.BOARD_NO; 

select * from MEMBER_GRADE;
--판매자등급
DROP TABLE MEMBER_GRADE CASCADE CONSTRAINTS;
CREATE TABLE MEMBER_GRADE (
	GRADE_NO              NUMBER  NOT NULL CONSTRAINT GRADE_NO_PK PRIMARY KEY ,
	MEMBER_ID             VARCHAR2(30)  NOT NULL ,
	MEMBER_REVIEW         VARCHAR2(600)  NOT NULL ,
	MEMBER_POINT          NUMBER  NOT NULL
);

-- 위시리스트
DROP TABLE WISHLIST CASCADE CONSTRAINTS;
CREATE TABLE WISHLIST (
	WISHLIST_NO           NUMBER  NOT NULL CONSTRAINT WISHLIST_NO_PK PRIMARY KEY ,
	BOARD_NO              NUMBER  NOT NULL CONSTRAINT WISHLIST_BOARD_NO_FK REFERENCES BOARD(BOARD_NO) ON DELETE CASCADE ,
	MEMBER_ID             VARCHAR2(30)  NOT NULL CONSTRAINT WISHLIST_MEMBER_ID_FK REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE
);

select * from tab;

-----------------------------------------------------------------------------------------------------------------------------

INSERT INTO 
MEMBER(MEMBER_NO,MEMBER_ID,MEMBER_PWD,MEMBER_NAME,MEMBER_BIRTH,MEMBER_ADDR,MEMBER_BANK,MEMBER_ACCOUNT,MEMBER_VALID_MONTH,MEMBER_VALID_YEAR,MEMBER_SHARING_COUNT,MEMBER_PHONE) 
VALUES(1,'qwe','123','테스트',sysdate,'경기도성남시판교동','국민은행','0000000010000000',02,2019,2,'01012345678');


select * from COMMENTS;
select * from PRODUCT_REVIEW;

