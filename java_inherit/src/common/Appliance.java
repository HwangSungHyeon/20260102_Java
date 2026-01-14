package common;

public abstract class Appliance { // 가전제품
	protected boolean onoff = false; // 전원 여부
	protected String name; // 제품명
	protected int powerCon; // 소비전력
	
	protected Appliance() {}
	protected Appliance(String name, int powerCon) {
		this.name = name;
		this.powerCon = powerCon;
	}
	
	@Override
	public String toString() {
		return "Appliance [onoff=" + onoff + ", name=" + name + ", powerCon=" + powerCon + "]";
	}
	
	public abstract void power(); // 추상메서드
	
	// 추상 메서드를 가지고 있는 클래스는 반드시 추상 클래스여야만 한다.
	
}
