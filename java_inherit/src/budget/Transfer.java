package budget;

import common.Transaction;

public class Transfer extends Transaction{

	public Transfer(int amount, String date, String memo) {
		super(amount, date, memo);
	}

	@Override
	public int calculate(int count) {
		return count - amount;
	}



}
