package payment;

import common.PaymentSystem;

public class Cash extends PaymentSystem{
	
	public Cash(String name) {
		super(name);
	}
	
	@Override
	public void method() {
		System.out.println("5만원");
	}
}
