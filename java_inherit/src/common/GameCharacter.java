package common;

public abstract class GameCharacter {
	
	protected String name;
	public GameCharacter(String name) {
		this.name = name;
	}
	public final void skill() {
		System.out.println(name + "스킬을 쓴다.");
	}
	
	public abstract void weapon();
}
