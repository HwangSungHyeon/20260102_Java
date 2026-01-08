package study20260108;

public class JavaClass2 {

	public static void main(String[] args) {
		
		Movie movie = new Movie(); // ()가 붙은건 다 '메서드'이다.
		// new Movie() - 생성자 메서드(new 연산자를 통해 만들어진 공간의 데이터를 초기화 시켜주는 메서드)
		
		System.out.println( movie.title);
		
		movie.title = "아바타 불과재";
		movie.dir = "카메론";
		movie.year = 2026;
		movie.limitAge = 12;
		
		System.out.println( movie.title);
		
		Movie movie2 = new Movie("굿포춘", 2026); // 굿포춘 문자열이 Movie(String title) 안에 들어감
		
		System.out.println( movie2.title);
		System.out.println( movie2.year);
		
		// Music 클래스의 객체 생성하여
		// 음악 제목, 가수 , 재생시간(총몇분) 저장되게하기
		// 매개변수 있는 생성자 메서드로 데이터 저장하고 출력하기
		
		Music music = new Music("Lemon", "요네즈 켄시", 4);
		
		System.out.println( music.musicName);
		System.out.println( music.singer);
		System.out.println( music.time+"분");
		
		Music music2 = new Music(); // 매개변수가 없는 생성자 메서드가 존재하지 않아서 만들 수 없다.
		// 두가지 다 사용하려면 매개변수 있는 생성자 위에 Music(){}를 만들어 준다.
	}

}
