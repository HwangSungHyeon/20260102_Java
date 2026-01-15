package character;

import common.GameCharacter;

public class Archer extends GameCharacter{
	
	public Archer(String name) {
		super(name);
	}
	
	@Override
	public void weapon() {
		System.out.println("활");
	}
}
