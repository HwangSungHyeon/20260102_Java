package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):1
		// -> -목록-
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):2
		// -> -등록-
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):3
		// -> -수정-
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):4
		// -> -삭제-
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):0
		// -> ==프로그램 종료==
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):5
		// -> 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제)
		
		List<ProductDTO> productList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제) :");
			String menu = sc.nextLine();
			if (menu.equals("0")) {
				break;
			} else if (menu.equals("1")) { // 목록
				int hab = 0;
				for (int i = 0; i<productList.size(); i++) {
					productList.get(i).display();
					hab += productList.get(i).getTotal();
				}
				System.out.println("-----------------------");
				System.out.println("합계 : "+ hab);
			} else if (menu.equals("2")) { // 등록
				System.out.print("상품 입력 : ");
				String productName = sc.nextLine();
				System.out.print("가격 입력 : ");
				String productPrice_ = sc.nextLine();
				int productPrice = Integer.parseInt(productPrice_);
				System.out.print("갯수 입력 : ");
				String productCount_ = sc.nextLine();
				int productCount = Integer.parseInt(productCount_);
				
				ProductDTO dto = new ProductDTO(productName, productPrice, productCount);
				productList.add(dto);
				
//				String product = productName + ", " + productPrice + "원 ";
//				product += productCount + "개, " + total;
//				System.out.println(product);
				
			} else if (menu.equals("3")) {
				System.out.println("-수정-");
			} else if (menu.equals("4")) {
				System.out.println("-삭제-");
			}
		}
		System.out.println("--프로그램 종료--");
		
	}

}
