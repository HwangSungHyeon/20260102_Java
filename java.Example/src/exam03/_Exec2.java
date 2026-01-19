package exam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Exec2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(); // 결과 : []
		numbers.add(50); // 결과 : [50]
		numbers.add(10); // 결과 : [50,10]
		numbers.add(30); // 결과 : [50,10,30]
		
		// 1. 오름차순 정렬(기본)           오름차순과 내림차순은 알아만 둘것.
		Collections.sort(numbers);
		System.out.println("오름차순 : "+ numbers);
		
		// 2. 내립차순 정렬
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("내림차순 : "+ numbers);
	}

}
