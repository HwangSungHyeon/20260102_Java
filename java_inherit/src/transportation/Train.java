package transportation;

import common.Transportation;

public class Train extends Transportation{
	
	public Train(String name) {
		super(name);
	}
	
	@Override
	public void speed() {
		System.out.println("평균 속도 : +-300km/h");
	}
	public void seats() {
		System.out.println("탑승인원 : 951인승");
	}
}
