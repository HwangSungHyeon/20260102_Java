package exam18;

public class _Exec {
	
	// 정적 내부 클래스
	// 외부 클래스의 인스턴스 없이도 내부클래스를 만들 수 있다.
	// 메모리 효율을 위해 실무에서 가장 권장되는 방법
	// 외부 클래스의 static 멤버만 접근 가능
	// 생성방법 : new 외부클래스.내부클래스()
	public static void main(String[] args) {
		
		School.Student student = new School.Student();
		student.study();
	}

}
