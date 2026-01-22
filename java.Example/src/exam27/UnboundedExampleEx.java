package exam27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedExampleEx {

	public static void main(String[] args) {
		
		// new ArrayList<> 를 추가하면 추가와 삭제 가능
		List<String> strList = new ArrayList<>(Arrays.asList("Apple","Banana","Cherry"));
		List<Integer> intList = Arrays.asList(1,2,3);
		
		
		
//		strList.add("aaa"); // new ArrayList<>가 없으면 추가 안됨
//		strList.remove(0);  // new ArrayList<>가 없으면 삭제 안됨
		strList.set(1, "한라봉");  // 수정 가능
		System.out.println(strList);
		
//		System.out.println("문자열 리스트 : ");
//		UnboundedExample.printAll(strList);
//		
//		System.out.println("숫자 리스트 : ");
//		UnboundedExample.printAll(intList);
	}

}
