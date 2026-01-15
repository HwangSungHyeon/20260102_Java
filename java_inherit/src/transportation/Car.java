package transportation;

import common.Transportation;

public class Car extends Transportation{
	
	public Car(String name) {
		super(name);
	}
	
	@Override
	public void speed() {
		System.out.println("평균 속도 : +-100km/h");
	}
	public void seats() {
		System.out.println("탑승 인원 : 5인승");
	}
}
