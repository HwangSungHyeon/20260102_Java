package products;

import common.Appliance;

public class Television extends Appliance{ // TV
	
	public int sound;
	public int ch;
	
	// 컴퓨터에게 주석을 건다라고 생각하면 된다.
	// 계속 컴파일되지 않게 컴퓨터에게 말해 준다 라는 의미.
	@Override  
	public void power() {
		onoff = !onoff;
		if(onoff)
			System.out.println("TV 전원이 켜짐");
		else
			System.out.println("TV 전원이 꺼짐");
	}
}
