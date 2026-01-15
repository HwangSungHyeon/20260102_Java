package sangsog;

import animals.Bird;
import animals.Cat;
import animals.Dog;
import animals.Rabbit;
import common.Animal;

public class MainMethod2 {

	public static void main(String[] args) {
		
		Animal[] animals = {
				new Dog("뭉치", "포메라니안"),
				new Cat("밀키"),
				new Rabbit("느림보"),
				new Bird("참새")
		};
		
		for(Animal a : animals) {
			a.sound();
			a.sleep();
			
			if(a instanceof Dog) // instanceof를 사용하면 어떤 클래스 타입인지 알아낼 수 있다.
				((Dog)a).getBreed();
			System.out.println();
		}
		
//		int a = (int)3.14f; //(int)를 붙여 형변환
//		float f = 24.5f;
//		System.out.println( (int)f ); //(int)를 붙여 형변환
		
//		((Dog)animals[0]).getBreed(); // Dog 타입으로 형변환
//		
//		Dog dog = (Dog)animals[0]; // Dog 타입으로 강제형변환
//		
//		Dog d = new Dog("a","b"); 
//		Animal aa = d; // 자동형변환
	}

}

// Bird 클래스를 만드시오
// 짹쨱 소리 나게 하시오




