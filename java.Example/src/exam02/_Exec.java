package exam02;

public class _Exec {

	public static void main(String[] args) {
		int num = 10;
		
		String[] strs = new String[num]; 
		
		for(int i = 0; i < strs.length; i++) {
			String name = "홍길동";
			String ssn = "111111-1111111";
			String age = "19";
			strs[0] = name + "," + ssn + "," + age;
		}
		
	}

}
