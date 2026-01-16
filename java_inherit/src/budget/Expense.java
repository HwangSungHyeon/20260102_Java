package budget;

import common.Transaction;

public class Expense extends Transaction{

	public Expense(int amount, String date, String memo) {
		super(amount, date, memo);
	}

	@Override
	public int calculate(int count) {
		return count - amount;
	}



}
