package exam08;

public class DBExec {

}


/*
   mysql -u javaUser -p
   show databases;
   use javaExample;
   show tables;
   
   테이블 만들기
   create table jusorok (
   no int not null auto_increment primary key,
   name varchar(50) not null,
   phone varchar(15) not null,
   createdDate DATETIME DEFAULT CURRENT_TIMESTAMP
   );
   
   기본키(primary key) : 주민번호, 학번, 사번 ,군번 등등
   - 한테이블에 하나 가능
   - 중복 X
   - null 허용안함.
   
   unique
   - 한테이블에 여러개 가능
   - 중복 X
   - null 허용함.
   
   DB 설계(모델링)
   (회원 테이블) create table member (
   (회원 번호)  no int not null auto_increment unique,
   (아이디)    id varchar(50) not null,
   (비밀번호)   password varchar(50) not null,
   (이름)      name varchar(50) not null,
   (전화번호)   phone varchar(50) not null,
   (등록일)    createDate DATETIME DEFAULT CURRENT_TIMESTAMP);
   
   desc member; 
   : 데이터를 표로 보여준다.
   
   select * from member; 
   : member table에 있는 데이터 화면에 출력
   
   insert into member (필드명...) values (값...);
   -> insert into member (필드명, 필드명, 필드명)
      values (값, 값, 값);
   
   -> insert into member (no, id, password, name, phone, createdDate)
      values (null, 'hong', '1234', '홍길동', '010-1111-1111', now());
      
     insert into member (no, id, password, name, phone, createdDate)
     values (null, 'lee', '1324', '이순신', '010-2222-2222', now());
     
     insert into member (no, id, password, name, phone, createdDate)
     values (null, 'kim', '12345', '김춘추', '010-3333-3333', now());
     
   * 제약조건 ==> 무결성(결점이 없는것)
     1. primary key (기본키)
     2. foreign key (참조키, 외래키)
     3. unique
     4. not null
     5. default
     6. enum ("남자","여자")
     7. CHECK (price > 0)
     
     select * from member;
     : 저장 되어 있는 데이터 모두 출력
     
     select no, id, name from member;
     : 적어놓은 특정 데이터만 출력
     
     select no, id, name from member order by no asc;
     : 순서대로 출력
     
     update member set name = '홍성순' where no = 3;
     : 3번에 있는 이름을 홍성순으로 바꾼다는 뜻.
     
     select no, id, name from member where id = 'hong';
     : id가 'hong'인 것의 데이터를 출력
     
     select no, id, name from member wher name = '이순신';
     : name이 '이순신'인 것의 데이터를 출력
     
     select no, id, name from member where no > 3;
     : no가 3 이상인 것의 데이터만 출력
     
     select no, id, name from member where no > 3 and name = '이순신';
     select no, id, name from member where no > 3 or name = '이순신';
     : no가 3 이상인 것의 데이터와 name이 '이순신'인 것의 데이터를 출력
     
     delete from member where no = 1;
     : no가 1번인 것의 데이터를 삭제
     
     select : 조회, 검색
     insert : 삽입, 추가, 등록
     update : 수정
     delete : 삭체
     
     * SQL 명령어 분류
     DDL : 데이터 정의어 - ( create, alter, drop, truncate ) 테이블을 대상으로 보통 작용
     DML : 데이터 조작어 - ( select, insert, update, delete ) => record 테이블 내부에 데이터를 대상으로 작용
     DCL : 데이터 제어어 - grant, revoke
     TCL : 트랜잭션 - commit, rollback
     
     * 회원관리 : <목록>, <상세보기>, <등록>, <수정>, <삭제>
     * 상품관리 : <목록>, <상세보기>, <등록>, <수정>, <삭제>
     
     
     인터프리터 (통역)
     컴파일 (번역)
     
     * 객체지향
     - 추상화
     - 상속
     - 다형성
     - 캡슐화
     
     Node
     중간에 끼워놓기 좋은 프로그램.
     ex12) Friend
           SimpleLinkedList
   
   
   
   
*/
