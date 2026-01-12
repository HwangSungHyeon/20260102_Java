package study20260112;

public class Student {
	
	static String schoolName; // 클래스 변수
	
	public String name; // 인스턴스 변수
	public String age;  // 인스턴스 변수
	private int tall;   // 인스턴스 변수
	private int grade;  // 인스턴스 변수
	
	// 변수 초기화 순서
	// 명시적 초기화 -> 초기화 블럭 -> 생성자 메서드
	// 최종적으로 들어가는 변수는 생성자 메서드 이다.
	
	{  // 인스턴스 초기화 블럭을 이용한 변수 초기화
		name = "이성계";
	}
	
	public Student() { }  // 생성자 메서드
	public Student(String name, String age, int tall) {
		this.name = name; // 현재 만들어서 사용하려는 객체 : this
		this.age = age;
		this.tall = tall;
	} // Overloading 매개변수 갯수가 같아도 타입만 다르면 가능하다.
	public Student(String name, int tall) {
		this.name = name;
		this.tall = tall;
	}
	
	// 클래스 객체에 저장되어있는 값을 출력할때
	// 자바에서는 일반적으로 toString 메서드를 사용한다.
	public String toString() {
		return name+" : "+age+" : "+tall+" : "+grade;
	}
}
