package sangsog;

import character.Archer;
import character.Assassin;
import character.Warrior;
import character.Wizard;
import common.GameCharacter;

public class MainMethod3 {

	public static void main(String[] args) {
		
		GameCharacter[] character = {
				new Warrior("전사"),
				new Archer("궁수"),
				new Wizard("마법사"),
				new Assassin("암살자")
		};
		
		for(GameCharacter a : character) {
			a.skill();
			a.weapon();
			
		}
	}

}


