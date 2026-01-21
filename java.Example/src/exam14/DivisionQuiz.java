package exam14;

import java.util.Scanner;

public class DivisionQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		String num1_ = sc.nextLine(); 
		
		int num1 = 0;
		try {
			num1 = Integer.parseInt(num1_);
		} catch(Exception e) {
			num1 = -1;
		} 
		System.out.println("num1 : "+ num1);
		
//		String temp = num1_;
//		for(int i = 0; i <= 9; i++) {
//			temp = temp.replace(i + "", "");
//		}
//		System.out.println("temp : ["+ temp + "]");
//		
//		int num1 = 0;
//		if(temp.equals("")) {
//			num1 = Integer.parseInt(num1_);
//			System.out.println("num1 : "+ num1);
//		} else {
//			System.out.println("숫자만 입력 가능합니다.");
//		}
		
//		
//		System.out.print("두 번째 정수 : ");
//		String num2_ = sc.nextLine();
//		int num2 = Integer.parseInt(num2_);
		
//		int result = num1 / num2;
//		System.out.println("결과 : " + num1 + " / "+ num2 + " = " + result);
	}

}
