package exam21;

public class _Exec {

	public static void main(String[] args) {
		
		// 익명클래스로 구현
		Greeter morning = new Greeter() {
			@Override
			public void sayHello() {
				System.out.println("좋은 아침입니다!");
			}
		};
		morning.sayHello();
		
		// 람다로 구현 : (피라미터) -> {실행문}
		Greeter morning2 = ()-> System.out.println("좋은 아침입니다!");
		
		morning2.sayHello();
	}

}
