package transportation;

import common.Transportation;

public class Bus extends Transportation{
	
	public Bus(String name) {
		super(name);
	}
	
	@Override
	public void speed() {
		System.out.println("평균 속도 : +-90km/h");
	}
	public void seats() {
		System.out.println("탑승 인원 : 45인승");
	}
}
