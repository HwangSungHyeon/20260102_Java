package exam04;

public class Student {
	
	String name;
	int score;
	
	// 생성자는 객체를 만들 때 쓰는 것.
	// 매개변수가 없는 생성자 - 기본 생성자
	// 매개변수가 있는 생성자
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "(" + score + ")";
	}
	
	
}
