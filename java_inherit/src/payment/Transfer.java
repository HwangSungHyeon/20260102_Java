package payment;

import common.PaymentSystem;

public class Transfer extends PaymentSystem{
	
	public Transfer(String name) {
		super(name);
	}
	
	@Override
	public void method() {
		System.out.println("계좌이체");
	}
}
