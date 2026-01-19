package exam04;

import java.util.ArrayList;
import java.util.List;

public class _Exec {
	
	// ※하나의 변수에 여러가지 값을 넣어줄 수 있는 것은 '배열, List, 객체' 가 있다.
	public static void main(String[] args) {
		
//		Student s1 = new Student("홍길동",80);
//		Student s2 = new Student("이성순",90);
//		Student s3 = new Student("장천용",100);
//		
		List<Student> list = new ArrayList<>(); // []
//		list.add(s1); // 결과 : [s1]
//		list.add(s2); // 결과 : [s1,s2]
//		list.add(s3); // 결과 : [s1,s2,s3]
		
		// 위 아래는 같은 결과를 갖는다. list.add 안에 바로 넣을수도 있다.
		list.add(new Student("홍길동",80)); // 결과 : [s1]
		list.add(new Student("이성순",90)); // 결과 : [s1,s2]
		list.add(new Student("장천용",100)); // 결과 : [s1,s2,s3]
		
		
	}

}
