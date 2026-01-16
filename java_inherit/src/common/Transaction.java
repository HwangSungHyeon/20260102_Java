package common;

public abstract class Transaction {
	
	protected int amount;
	protected String date;
	protected String memo;
	
	public Transaction(int amount, String date, String memo) {
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}
	public final void date() {
		System.out.println(date);
	}
	public final void memo() {
		System.out.println(memo);
	}
	
	public abstract int calculate(int count);
}
