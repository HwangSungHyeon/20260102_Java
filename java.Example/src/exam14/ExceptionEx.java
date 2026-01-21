package exam14;

public class ExceptionEx {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30};
		
		// (null 처리, 공백처리, 예외처리) 잘하는게 가장중요!
		try {
		System.out.println("--- 계산 시작 ---");
		int result = numbers[0] / 10;
		System.out.println("값 출력 : " +numbers[5]);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음 ("+ e.getMessage() + ")");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스");
		} catch (Exception e) {
			// 모든 예외의 조상인 Exception은 가장 마지막에 작성
			System.out.println("알 수 없는 오류가 발생했습니다.");
		} finally {
			System.out.println("--- 무조건 실행됨 ---");
		}
	}

}
