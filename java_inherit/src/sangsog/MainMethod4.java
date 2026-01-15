package sangsog;

import common.PaymentSystem;
import payment.Card;
import payment.Cash;
import payment.Transfer;

public class MainMethod4 {

	public static void main(String[] args) {
		
		PaymentSystem[] payment = {
			new Card("이순신"),
			new Cash("김춘추"),
			new Transfer("정약용")
		};
		
		for(PaymentSystem a : payment) {
			a.method();
			a.money();
		}
	}

}
