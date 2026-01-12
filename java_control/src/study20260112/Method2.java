package study20260112;

public class Method2 {

	public static void main(String[] args) {
		
		Vending orange = new Vending("환타 오렌지",1500,4);
		Vending top = new Vending("Top 블랙",2700,3);
		
		System.out.println(orange);
		System.out.println(top);
		
		orange.buy(1400);
		System.out.println(orange);
		orange.buy(1800);
		System.out.println(orange);
		orange.buy(1800);
		System.out.println(orange);
		orange.buy(1800);
		System.out.println(orange);
		top.buy(2600);
		System.out.println(top);
		top.buy(2800);
		System.out.println(top);
		
		orange.check();
		System.out.println(orange);
		
		orange.stockUp(5);
		System.out.println(orange);
		orange.stockUp(6);
		System.out.println(orange);
	}

}
