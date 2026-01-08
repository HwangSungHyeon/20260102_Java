package study20260108;

public class Movie {
	
	String title;  // 영화 제목
	String dir;    // 영화 감독
	int limitAge;  // 관람 연령
	int year;      // 개봉 년도
	
	// 생성자 메서드
	// 변수들 아래에 있는데 생략되어 안보이는 것처럼 보인다.
	Movie() {  // 객체를 초기화
		title = "주토피아2";
	}
	// 매개변수가 있는 생성자 메서드(유저가 직접 만들어야 한다.)
	Movie(String title, int year) { // Overloading : 메서드를 이름만 같게 하고 나머지는 다 다르게 하는 것. 
		this.title = title;
		this.year = year;
	}
}
