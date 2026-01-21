package exam10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _Exec {

	public static void main(String[] args) {
		
		List<Map<String, String>> list = new ArrayList<>(); // []
		// 작은가방에서 큰가방으로 넣을때 큰가방의 <> 안에는 작은 가방의 Map<> 를 넣어준다.
		
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int mat = 70;
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		Map<String, String> map1 = new HashMap<>();
		map1.put("name", name);
		map1.put("kor", kor + "");
		map1.put("eng", eng + "");
		map1.put("mat", mat + "");
		map1.put("tot", tot + "");
		map1.put("avg", avg + "");
		list.add(map1); // [map1]
		
		name = "이성순";
		kor = 99;
		eng = 88;
		mat = 77;
		tot = kor + eng + mat;
		avg = tot / 3.0;
		Map<String, String> map2 = new HashMap<>();
		map2.put("name", name);
		map2.put("kor", kor + "");
		map2.put("eng", eng + "");
		map2.put("mat", mat + "");
		map2.put("tot", tot + "");
		map2.put("avg", avg + "");
		list.add(map2); // [map1, map2]
		
		name = "장천용";
		kor = 100;
		eng = 100;
		mat = 100;
		tot = kor + eng + mat;
		avg = tot / 3.0;
		Map<String, String> map3 = new HashMap<>();
		map3.put("name", name);
		map3.put("kor", kor + "");
		map3.put("eng", eng + "");
		map3.put("mat", mat + "");
		map3.put("tot", tot + "");
		map3.put("avg", avg + "");
		list.add(map3); // [map1, map2, map3]
		
		for(int i = 0; i < list.size(); i++) {
			Map<String, String> map = list.get(i);
			
			String msg = "";
			msg += ","+ map.get("name");
			msg += ","+ map.get("kor");
			msg += ","+ map.get("eng");
			msg += ","+ map.get("mat");
			msg += ","+ map.get("tot");
			msg += ","+ map.get("avg");
			
			System.out.println(msg.substring(1));
		}
	}

}
