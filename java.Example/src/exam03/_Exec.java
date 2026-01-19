package exam03;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		// 리스트 : 배열의 값이 크면 써주는 것
		// Generric(제너릭) : 리스트에 들어가는 자료형에 제한을 건다. List<>안에 타입을 넣어주면 리스트에 그 타입만 받아들이게 제한을 건다.
		List<Integer> list = new ArrayList<>(); // 리스트 생성. List가 부모타입, ArrayList가 자식타입.
		System.out.println("List : "+list);     // 결과 : [] 
		
		list.add(1);  // int 타입
		System.out.println("List : "+list); // 결과 : [1]
		
		list.add(2);
		System.out.println("List : "+list); // 결과 : [1,2]
		
		list.add(300);
		System.out.println("List : "+list); // 결과 : [1,2,300]
		
		System.out.println("리스트의 길이 : "+list.size());
		
		System.out.println("리스트의 0번째 인덱스 값 : "+list.get(0));
		System.out.println("리스트의 1번째 인덱스 값 : "+list.get(1));
		System.out.println("리스트의 2번째 인덱스 값 : "+list.get(2));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 "+ i + "번째 인덱스의 값 : "+ list.get(i));
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		list.remove(2);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 "+ i + "번째 인덱스의 값 : "+ list.get(i));
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		list.set(0, 100);  // set은 값을 수정하는것 () 괄호 안에 앞에는 인덱스, 뒤에는 수정할 값.
		for(int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 "+ i + "번째 인덱스의 값 : "+ list.get(i));
		}
		// 공통모듈
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		int i = 0;
		for (int a : list) {
			System.out.println("리스트의 "+ i + "번째 인덱스의 값 : "+ list.get(i));
			i++;
		}
	}

}
