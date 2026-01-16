package budget;

import common.Transaction;

public class Income extends Transaction{

	public Income(int amount, String date, String memo) {
		super(amount, date, memo);
	}

	@Override
	public int calculate(int count) {
		return count + amount;
	}


	
}
