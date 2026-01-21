package exam15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		
		// 영수증
		// 라면 1000원 5개 5000원
		// 맥주 5000원 3개 15000원
		// 소주 5000원 2개 10000원
		// --------------------
		// 합계 : 30000원
		// 상품이름, 상품가격, 갯수
		
		Scanner sc = new Scanner(System.in);
		
		List<String[]> list = new ArrayList<>();
		
		String name = "라면";
		int price = 1000;
		int count = 5;
		int tot = price * count;
		
		name = "맥주";
		price = 5000;
		count = 3;
		tot = price * count;
		
		name = "소주";
		price = 5000;
		count = 2;
		tot = price * count;
	}

}
