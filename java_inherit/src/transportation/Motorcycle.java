package transportation;

import common.Transportation;

public class Motorcycle extends Transportation{
	
	public Motorcycle(String name) {
		super(name);
	}
	
	@Override
	public void speed() {
		System.out.println("평균 속도 : +-70km/h");
	}
	public void seats() {
		System.out.println("탑승 인원 : 2인승");
	}
}
