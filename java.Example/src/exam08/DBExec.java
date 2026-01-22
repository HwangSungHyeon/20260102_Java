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
           
     * 예외처리 : try ~ catch, throws
     - 갑작스러운 오류에도 프로그램이 죽지 않고 우아하게 대처.
     try {
       ~~~
       ~~~
     } catch (Exception e) {
     
     } finally {
     
     }
     
     throws 란
     - 메서드 뒤에 붙어 **"이 메서드를 실행하면 이런 예외가 발생할 수 있으니
       나를 호출하는 쪽에서 대비하라 ** 라고 경고하는 알림판과 같다.
     
     * 내부클래스
     - 클래스 내부에 선언된 클래스.
     - 외부 클래스의 인스턴스가 생성되어야만 내부 클래스도 존재할 수 있다.
	 - 외부 클래스의 자원을 내 것처럼 사용
	 - 생성방법 : 외부객체.new 내부클래스()
     클래스 멤버
     - (멤버)필드
     - (멤버)메소드
     
     * 정적 내부클래스 (static)
     - 외부 클래스의 인스턴스 없이도 내부클래스를 만들 수 있다.
	 - 메모리 효율을 위해 실무에서 가장 권장되는 방법
	 - 외부 클래스의 static 멤버만 접근 가능
	 - 생성방법 : new 외부클래스.내부클래스()
	 
	 * 지역 클래스 - "메소드 안에서만"
     - 메서드가 호출될 때 잠깐 정의되고 사라지는 클래스
     - 메서드 내부의 지역 변수는 final 이거나 값이 변하지 않아야만 접근 가능
     - 생성방법 : 메서드 내부에서 new로 생성
     
     * 추상메소드
     - public void aaa();
     - 클래스 이름이 없으므로 생성자도 없다.
     - 주로 인터페이스나 추상 클래스를 즉석에서 구현할 때 쓴다.
     - 딱 한번만 쓰고 버릴 객체에 최적화되어 있다.
     - 생성방법 : new 인터페이스/추상메서드 ()
     
     응집도 - 높은게 좋다
     결합도 - 낮은게 좋다
     
                 * Arraylist                          * LinkedList
                 - 연속된 배열                            - 불연속적인 연결 노드  
     데이터 읽기     - 매우 빠름 (인덱스로 즉시 접근)             - 느림 (앞에서부터 찾아가야함)
     추가/삭제      - 느림 (데이터를 뒤로 밀거나 당김)            - 매우 빠름 (연결 선만 바꿈)
     메모리 사용     - 적음                                 - 많음
     
     * 제너릭 사용 이유
     1. 타입 안정성 (Type Safety)
     2. 번거로운 형변환 생략
     
     * wild card : <?>
     - 어떤 타입이든 상관없이 다 받을 수 있다.
     - 타입에 의존하지 않는 단순 출력이나 개수 확인 같은 작업에 사용
     - 타입을 알 수 없으믁로 null 외에는 요소를 추가 할 수 없다.
     <?>
     -> 비제한          <?>          모든 타입      타입에 무관한 단순 기능
     목적 : 타입에 상관없이 공통적인 기능을 수행할 때 사용
     
     <? extends T>
     -> 상한 제한   <? extends T>   T와 그 자식들    데이터 읽기 전용
     목적 : 특정 타입의 자식들을 모두 받아 데이터를 안전하게 읽기 위해 사용
     
     <? super T>
     -> 하한 제한    <? super T>    T와 그 부모들    데이터 쓰기 전용
     목적 : 특정 타입의 부모들을 받아 데이터를 안전하게 저장 하기 위해 사용
     
*/
