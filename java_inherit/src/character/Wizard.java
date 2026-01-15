package character;

import common.GameCharacter;

public class Wizard extends GameCharacter{
	
	public Wizard(String name) {
		super(name);
	}
	
	@Override
	public void weapon() {
		System.out.println("지팡이");
	}
}
