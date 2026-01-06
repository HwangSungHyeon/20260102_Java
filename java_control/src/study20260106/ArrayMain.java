package study20260106;

public class ArrayMain {

	public static void main(String[] args) {
		
		String a = "good"; // 파란색은 사용자정의 데이터타입. 밑에 있는 작업을 하지 않아도 됨. 따라서 String 변수이름 = 문자열; 을 하면된다.
		String aa = new String("member"); // new가 사용되는 변수는 모두 참조변수이다. 참조변수의 특징은 다른곳에 접근할 수 있다. ex) a.~~~ 가능 c.~~~ 불가능
		
		System.out.println( aa +"    "+ a);
		
		
		String word = "i like banana";
		
		System.out.println( word );
		// .뒤에 나오는 메서드를 입력하기전에 보게되면 괄호안에 데이터타입을 보고 문자열이 들어갈지 숫자가 들어갈지 확인할 수 있다.
		System.out.println( word.charAt(4)); // charAt 안에 index 번호를 넣어주면 문자 하나를 뽑아올수있다.
		
		System.out.println( word.indexOf('b')); // indexOf 안에 문자를 넣어주면 위치를 알려준다.
		
		System.out.println( word.substring(2)); // substring 안에 번호를 넣어주면 시작위치를 바꿀 수 있다.
		
		String name = "이순신-김유신-김춘추-이성계-박문수-박팽년";
		
		System.out.println( name );
		
		String[] names = name.split("-"); // 문자열을 ("-")기준으로 나눠서 배열에 저장해라 라는 뜻.
		// String[] names = {"이순신","김유신","김춘추","이성계","박문수","박팽년"} 바로 위에 있는 내용과 같은 뜻이다.
		
		System.out.println( names[0] );
		
		// 반복문으로 이름을 전부 출력하세요.(한줄에 하나씩)
		for(String Name : names ) {
//			if(Name.charAt(0) == '김') // 성이 김씨인 사람만 출력해라
			if(Name.indexOf('신') != -1) // 신이 들어간 사람만 출력해라(배열에 없을 경우에 -1로 뜬다)
			System.out.println( Name );
		}
		
		String[] fruits = {
				"사과", "딸기", "배", "수박",
				"바나나", "복숭아", "파인애플", "아포카도",
				"오렌지", "감", "한라봉", "망고"
				};
		
		// 문제1. fruits 배열에서 과일이름이 3자 이상인것만 출력하세요. ( length() )
		
		for(String fruit : fruits) {
			if(fruit.length() >= 3) 
		    // for 문 내부에 들어갈때 length는 배열의 크기를 나타내지만 if 문 안에 넣으면 문자열의 크기를 나타내어 비교가능.
			System.out.println( fruit );
		}
		
		// 문제2. fruits 배열에서 딸기와 수박은 제외하고 출력하세요.
		
		for (String fruit : fruits) {
			if(!fruit.equals("딸기") && !fruit.equals("수박"))  
			// 문자열을 비교하기 위해서는 equals를 사용하고, 같다라는 뜻이므로 제외하려면 앞에 !(not)을 붙여준다.
				System.out.println(fruit);
		}
		
		System.out.println("\n\n\n");
		
		// 문제3. 과일을 한줄에 4개씩 세줄로 출력할 것이다.
		// 1차원 배열로 2차원 배열처럼 표현하기 위해 연습.
		for( int i = 0; i < fruits.length; i++) {
			if( i % 4 == 0)
				System.out.println();
			
			System.out.print( fruits[i] +" ");
		}
		
		
//		int b;    // 주황색은 기본 데이터타입
//		
//		char c = 'a'; // null이 존재하지않는 문자(한글자)
//		
//		char[] temp = new char[5]; // null이 존재하는 문자열(문자를 나열시킨것)
//		
//		temp[0] = 'g'; temp[1] = 'o'; temp[2] = 'o'; temp[3] = 'd';
//		
//		System.out.println( temp );
		
		
		
//		int[] arr = new int[5];   // 5개의 배열
//		// arr 은 참조변수이다. 참조 변수는 메모리주소를 저장할 수 있는 변수이다.
//		// 배열의 인덱스는 0부터 시작이다.
//		// 배열은 무조건 반복문을 이용한다.
//		
//		System.out.println(arr);
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 55;
//		arr[3] = 11;
//		arr[4] = 99;
//		
//		System.out.println(arr[2]);
//		
//		for(int i = 0; i < arr.length; i++) {  // arr.length 는 배열의 크기. 따라서 여기에서는 5보다 작다라고 표현.
//			
//			System.out.println( arr[i] ); 
//		}
//		
//		for(int num : arr) {  // 향상된 for 문. 위에 설정한 배열의 데이터타입은 int 이므로 같은타입으로 변수를 만들어주고 :(클론) arr(배열의 이름)을 쓴다.
//			if(num > 50)
//			System.out.println( num ); // 출력은 num(변수의 이름).
//		}
//		
//		
//		
//		
//		
//		int[] arr2 = {10,20,30};  // 10,20,30이 들어있는 3개의 배열
		
		
	}

}

/*
    배열 - 동일한 데이터타입의 데이터 저장공간이 연속적으로 나열되어있는 구조
    정적 배열 - 프로그램 실행 중에 크기 변경이 불가능한 배열
    동적 배열 - 프로그램 실행 중에 크기 변경이 가능한 배열
          





*/