package exam09;

import java.util.HashMap;
import java.util.Map;

public class _Exec {

	public static void main(String[] args) {
		
		// index 가 너무 많을 경우에 일일히 그 위치를 다 찾을 수 없으므로 순서가 상관없는 HashMap 을 써준다.
		// HashMap (맵) - 앞에는 key, 뒤에는 value   /   순서가 없으므로 인덱스가 없다.
		HashMap<String, String> map = new HashMap<>(); // Map 객체 만들기
		//     < key  ,  value>
		System.out.println("map : "+map);  // 결과 : {}
		map.put("name", "홍길동");
		System.out.println("map : "+map);  // 결과 : {name=홍길동}
		map.put("kor", 90 +"");
		System.out.println("map : "+map);  // 결과 : {name=홍길동, kor=90}
		map.put("eng", 80 +"");
		System.out.println("map : "+map);  // 결과 : {name=홍길동, kor=90, eng=80}
		map.put("name", "이성순");           // 같은 key 가 없으면 추가, 같은 key 가 있으면 수정.
		System.out.println("map : "+map);  // 결과 : {name=이성순, kor=90, eng=80}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("ㅡㅡ> "+ map.keySet()); // 결과 : ㅡㅡ> [name, kor, eng]
		for(String key : map.keySet()) { // 향상된 for 문
			System.out.println(key + " : "+ map.get(key)); // 결과 - name : 이성순
//			                                                        kor : 90
//			                                                        eng : 80
		}
		
//		System.out.println("ㅡㅡㅡ> "+ map.get("name")); // 결과 : ㅡㅡㅡ> 이성순
//		System.out.println("ㅡㅡㅡ> "+ map.get("kor"));  // 결과 : ㅡㅡㅡ> 90
//		
//		map.put("name", "장천용");
//		System.out.println("map : "+ map); // 결과 : {name=장천용, kor=90, eng=80}
//		
//		map.remove("kor"); // 삭제
//		System.out.println("map : "+ map); // 결과 : {name=장천용, eng=80}
//		
//		Map<Integer, String> map2 = new HashMap<>();
//		map2.put(1, "홍길동");
//		System.out.println("map2 : "+ map2); // 결과 : {1=홍길동}
//		map2.put(2, "홍길동");                 // key 는 중복이 되지않지만 value 는 중복이 가능하다.
//		System.out.println("map2 : "+ map2); // 결과 : {1=홍길동, 2=홍길동}
		
		
	}

}
