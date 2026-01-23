package exam30;

import java.util.Map;

public class StudentDAO {
	// 낱개로 받는 방법
//	public int setInsert(String name, String ssn, String phone, String address) {
//	   System.out.println("-- setInsert() --");
//	   System.out.println("name : "+ name);
//	   System.out.println("ssn : "+ ssn);
//	   System.out.println("phone : "+ phone);
//	   System.out.println("address : "+ address);
	
	// 배열로 받는 방법
//	public int setInsert(String[] array) {
//	   System.out.println("-- setInsert() --");
//	   System.out.println("name : array[0]);
//	   System.out.println("ssn : "+ array[1]);
//	   System.out.println("phone : "+ array[2]);
//	   System.out.println("address : "+ array[3]);
	
	// Map으로 받는 방법
	public int setInsert(Map<String, String> map) {
		System.out.println("-- setInsert() --");
		System.out.println("name : "+ map.get("name"));
		System.out.println("ssn : "+ map.get("ssn"));
		System.out.println("phone : "+ map.get("phone"));
		System.out.println("address : "+ map.get("address"));
		
		return 0;
	}
}
