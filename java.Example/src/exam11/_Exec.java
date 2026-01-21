package exam11;

import java.util.HashSet;
import java.util.Set;

public class _Exec {

	public static void main(String[] args) {
		
		// Set - 중복 허용 X
		Set<String> set = new HashSet<>();
		System.out.println("set : "+ set); // 결과 : []
		set.add("사과");
		System.out.println("set : "+ set); // 결과 : [사과]
		set.add("바나나");
		System.out.println("set : "+ set); // 결과 : [사과, 바나나]
		set.add("포도");                    // 위치가 정확하지 않으므로 인덱스가 없다.
		System.out.println("set : "+ set); // 결과 : [포도, 사과, 바나나]
		set.add("사과");
		System.out.println("set : "+ set); // 결과 : [포도, 사과, 바나나] 중복되지 않으므로 추가나 수정이 되지 않는다.
		System.out.println("담긴 개수 : "+ set.size()); // 결과 - 단긴 개수 : 3
		
		if(set.contains("사과")) { // 사과가 있는지 없는지 판별
			System.out.println("사과가 있네.");
		}
		
		for(String s : set) {
			System.out.println(s);
		}
		
		set.remove("포도");
		System.out.println("set : "+ set);
		
//		set.remove("체리");
//		System.out.println("set : "+ set);
		
		// 이렇게 하는 이유는 오류가 뜨는걸 방지 하기 위해
		if(set.contains("체리")) { // 체리가 있으면 지우고 없으면 출력하지 않는다.
			set.remove("체리");
			set.add("cherry");
		}
	}

}
