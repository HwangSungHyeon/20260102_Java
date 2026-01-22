package exam20;

public class _Exec {

	public static void main(String[] args) {
		
		RemoteControl tv = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
		};
		
		tv.turnOn();
	}

}