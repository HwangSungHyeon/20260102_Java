package sangsog;

import products.Aircon;
import products.Refrigerator;
import products.Television;

public class MainMethod {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.power();
		tv.power();
		
		Refrigerator refrigerator = new Refrigerator();
		
		Aircon air = new Aircon("LG휘센",310);
		
		System.out.println( air );
	}

}

// 자바의 상속
// - 오버라이딩 개념
// - 다형성 : 하나의 객체가 여러 가지 형태를 가질 수 있는 것
// - protected : 패키지가 달라도 자식이 사용 가능하게 하는 접근 제한자
// - 추상화 : 자식클래스들의 공통성을 모아 부모클래스를 정의할 수 있는 것
// - final
// - instance of

// 하나를 가지고 여러가지를 표현해주는 다향성 때문에 상속을 사용한다.
// 상속 공부하기 위해 사용할만한 주제 ( 여러종류를 가지고 있는 카테고리 - 부모, 부모가 가지고 있는 공통점이 있어야 한다. )
// 동물에 대한 상속 - 동물(부모)
// 직원 급여 계산 시스템 - 직원(부모) - 
// 결제 시스템 - 결제(부모) - 카드 결제,현금,이체는 (자식)
// 게임 캐릭터 - 캐릭터(부모) - 직업(자식)
// 교통 수단 시스템 - 교통수단(부모) - 버스,기차,차,오토바이,자전거 (자식)




