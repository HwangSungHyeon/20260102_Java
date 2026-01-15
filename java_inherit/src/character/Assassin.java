package character;

import common.GameCharacter;

public class Assassin extends GameCharacter{
	
	public Assassin(String name) {
		super(name);
	}
	
	@Override
	public void weapon() {
		System.out.println("수리검");
	}
}
