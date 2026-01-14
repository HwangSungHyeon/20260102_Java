package products;

import common.Appliance;

public class Aircon extends Appliance{ // 에어컨
	
	// 상속관계에서 자식클래스 안에서는 this.name = name; 이라는 표현은 올바르지 않다.
	// 그래서 부모로부터 물려받았다는걸 표현하는 것은 super(name); 이라고 써야한다.
	
	public Aircon() {}
	public Aircon(String name, int powerCon) {
		super(name, powerCon); // 부모클래스의 생성자 메서드이다.
	}
	
	@Override
	public void power() {
		onoff = !onoff;
		if(onoff) System.out.println("냉방을 시작합니다.");
		else System.out.println("자동건조를 시작합니다. 바이!");
	}
}
