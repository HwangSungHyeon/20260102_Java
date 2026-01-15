package payment;

import common.PaymentSystem;

public class Card extends PaymentSystem{
	
	public Card(String name) {
		super(name);
	}
	
	@Override
	public void method() {
		System.out.println("체크카드");
	}
}
