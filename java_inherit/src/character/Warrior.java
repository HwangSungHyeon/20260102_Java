package character;

import common.GameCharacter;

public class Warrior extends GameCharacter{
	
	public Warrior(String name) {
		super(name);
	}
	
	@Override
	public void weapon() {
		System.out.println("칼과 방패");
	}
}
