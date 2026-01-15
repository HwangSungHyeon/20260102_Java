package sangsog;

import common.Appliance;
import products.Aircon;
import products.Microwave;
import products.Refrigerator;
import products.Television;

public class MainMethod {

	public static void main(String[] args) {
		
//		Television tv = new Television();
//		
//		tv.power();
//		tv.power();
//		
//		Refrigerator refrigerator = new Refrigerator();
//		
//		Aircon air = new Aircon("LG휘센",310);
//		
//		System.out.println( air );
//		
//		// Microwave microwave = new Microwave(); 
		
		int a=10,b=20,c=30,d=40,e=50;
		// 서로 다른 이름을 가진 변수 여러개를 하나의 이름으로 묶어주기
		int[] arr = new int[5];
		int[] arr2 = new int[6];
		int[] arr3 = new int[7];
		int[][] temp1 = new int[3][];
		temp1[0] = arr;
		temp1[1] = arr2;
		// 같은 타입의 1차원 배열 여러개라면 2차원 배열 하나로 묶어주기
		
		int num= 10;
		String name = "이순신";
		int[] score = new int[10];
		// 서로 다른 타입의 종류도 다르다면 클래스로 묶어주기
		// ↓
		class student{
			int num;
			String name;
			int[] score;
		}
		
		// 클래스가 여러개 필요하다면
		// 데이터를 중점으로 다루는 클래스가 있고, 메서드를 중점으로 다루는 클래스가 있으니
		// 데이터관련 클래스들 여러개는 공통점이 있는 경우 부모클래스로 묶어준다.
		// 메서드를 중점으로 다루는 클래스가 여러개라면 추상 부모클래스 또는 인터페이스로 묶어준다.
		
		
		Aircon air = new Aircon("캐리어", 290);
		Television tv = new Television();
		tv.ch = 11;
		
		//Appliance app1 = new Appliance(); // 추상클래스인 부모클래스는 객체생성 불가
		Appliance app1;
		app1 = air;
		// 하나의 타입으로 여러가지 타입을 다룰 수 있다.(다형성)
		Appliance app2 = new Television();
		// app2.ch = 34; // 불가능
		
		Appliance app3 = new Refrigerator();
		Appliance app4 = new Aircon();
		
		
	}

}

/*
    추상 클래스, 추상 메서드
    
    추상클래스 만드는 이유
    - 상속관계에서 공통적인 부분을 부모클래스에 두는데
      자식클래스마다 특징 적인 동작을 위해 추상메서드가 만들어 두어야 한다.
    - 자식클래스에게 규칙을 강제화 하기 위해
    - 설계도를 만들기 위해
    - 다형성을 안정하게 쓰기 위해(추상클래스를 만드는 가장 큰 이유)
    
    추상클래스 사용하면 안되는 이유
    - 단순 규칙만 필요할때
      -> 공통 코드는 하나도 없고 메서드만 있는경우
      
    - 여러 클래스에 동시에 적용해야 할때
      -> 자바는 상속을 오직 하나만 할 수 있다.
    
    -> 이런 경우는 인터페이스 사용
    
    인터페이스란 추상클래스의 일종이다.
    
   
 */
// 자바의 상속
// - 오버라이딩 개념 : 부모클래스로부터 상속받은 메서드의 내용을 변경하는 것
// - 다형성 : 하나의 객체가 여러 가지 형태를 가질 수 있는 것
// - protected : 패키지가 달라도 자식이 사용 가능하게 하는 접근 제한자
// - 추상화 : 자식클래스들의 공통성을 모아 부모클래스를 정의할 수 있는 것
// - final : final 클래스 - 다른 클래스에서 상속받을 수 없게 만든다.
//           final 메서드 - 자식클래스에서 메서드 재정의(오버라이딩)를 할 수 없게 한다.
// - instance of : 어떤 클래스의 타입인지 알아낼 수 있는 것

// 하나를 가지고 여러가지를 표현해주는 다향성 때문에 상속을 사용한다.
// 상속 공부하기 위해 사용할만한 주제 ( 여러종류를 가지고 있는 카테고리 - 부모, 부모가 가지고 있는 공통점이 있어야 한다. )
// 동물에 대한 상속 - 동물(부모)
// 직원 급여 계산 시스템 - 직원(부모) - 
// 결제 시스템 - 결제(부모) - 카드 결제,현금,이체는 (자식)
// 게임 캐릭터 - 캐릭터(부모) - 직업(자식)
// 교통 수단 시스템 - 교통수단(부모) - 버스,기차,차,오토바이,자전거 (자식)




