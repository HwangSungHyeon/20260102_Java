package exam16;

import java.util.Scanner;

public class CustomExceptionEx {
	
	public static void checkAge(int age) throws Exception{
		if(age < 0) {
			// 강제로 예외를 발생시킴 (메시지를 담아서)
			// throw new Exception("나이는 0보다 작을 수 없습니다")
			throw new InvalidAgeException("잘못된 나이 입력입니다.");
		}
		System.out.println("정상적인 나이입니다:"+age);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int inputAge = sc.nextInt();
		
		try {
			checkAge(inputAge);
		} catch (InvalidAgeException e) {
			System.out.println("??? : "+ e.getMessage());
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("[발생한 예외] : "+ e.getMessage());
		} finally {
			sc.close();
		}
	}

}
