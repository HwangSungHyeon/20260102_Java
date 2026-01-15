package common;

public abstract class PaymentSystem {
	
	protected String name;
	
	public PaymentSystem(String name) {
		this.name = name;
	}
	public final void money() {
		System.out.println(name + " 돈이 줄어든다.");
	}
	
	public abstract void method();
}
