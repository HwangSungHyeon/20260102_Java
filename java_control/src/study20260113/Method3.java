package study20260113;

import java.util.Arrays;

public class Method3 {

	public static void main(String[] args) {
		
//		int[] a = new int[5];
//		a[0] = 20;
//		a[2] = 50;
//		
//		User[] users = new User[5];
//		
//		// User 클래스 객체 생성
//		users[0] = new User("lee","1234","이순신","01011112222");
//		
////		users[0].setName("이순신"); // set 은 저장의 의미
//		
//		System.out.println( users[0].getName()); // get 은 출력의 의미
		
		
		User[] users = { 
				new User("lee","1234","이순신","01011112222"),
				new User("kim","4321","김유신","01023324234"),
				new User("sky","129394","한석봉","01083748293"),
				new User("gold","8472","문익점","01088337744"),
				new User("greenking","12345","정약용","01032229933")
		};
		
		UserService us = new UserService();
//		us.findId(users);
//		
//		us.findPassword(users);
		
		System.out.println(Arrays.toString(users));
		
		us.login(users);
		
		
		
		
		
		
	}

}
