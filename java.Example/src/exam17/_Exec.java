package exam17;

public class _Exec {
	
	// 인스턴스 내부 클래스
	// 외부 클래스의 인스턴스가 생성되어야만 내부 클래스도 존재할 수 있다.
	// 외부 클래스의 자원을 내 것처럼 사용
	// 생성방법 : 외부객체.new 내부클래스()
	public static void main(String[] args) {
		
		// 1. 외부 객체 생성
		Outer outer = new Outer();
		// 2. 외부 객체를 통해 내부 객체 생성
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}

}
