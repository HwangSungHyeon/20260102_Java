package able;

public interface Actionable {
	
	public abstract void move();
	public void drink(); // abstract(추상 메서드)를 넣지 않아도 기본적으로 들어있다.
	
//	public int num = 0; //인스턴스 변수 불가
//	// 변수 뒤에 = 0; 을 붙여 초기화를 시켜주면 오류가 나지않고 static이 생략되어있다.
//	public static int count = 0;
//	
//	public final int a = 20;
}

/*
    인터페이스
    추상클래스의 일종
    기본적으로 추상메서드를 가진다.
    인스턴스 변수, 인스턴스 메서드 불가
    static 변수, static 메서드, final 가능
    
    인터페이스 구현 하는 이유
    1. 프로그램 전반의 규칙을 강제
    2. 다형성
    3. 다중 상속
    





*/