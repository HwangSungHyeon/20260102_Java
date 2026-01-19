package exam01;

import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		
		// 이름, 주민번호, 나이
		// 입력 -> 처리 -> 출력
		
		Scanner scanner = new Scanner(System.in);
		
		String strs = "";
		
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("주민번호 : ");
		String SSn = scanner.nextLine();
		System.out.print("나이 : ");
		String age = scanner.nextLine();
		
		strs = strs + "/" + name + "," + SSn + "," + age;
		
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("주민번호 : ");
		SSn = scanner.nextLine();
		System.out.print("나이 : ");
		age = scanner.nextLine();
		
		strs = strs + "/" + name + "," + SSn + "," + age;
		
		System.out.println(strs);
		strs = strs.substring(1); // 원하는 위치를 잘라주는 역할
		System.out.println(strs);
		String[] array = strs.split("/"); // split 을 써서 배열로 만들어준다.
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String imsi = array[0];
		String[] array2 = imsi.split(",");
		System.out.println(array2[0]+ "\t"+array[1]+"\t"+array2[2]);
		
	}

}
