package sangsog;

import budget.Expense;
import budget.Income;
import budget.Transfer;
import common.Transaction;

public class MainMethod6 {

	public static void main(String[] args) {
		
		int count = 0;
		System.out.println("잔액 : "+count+"원");
		
		Transaction[] transaction = {
			new Income(600000, "2026-01-02", "알바비"),
			new Expense(30000, "2026-01-04", "식비"),
			new Transfer(50000, "2026-01-09", "계좌이체")
		};
		
		for(Transaction a : transaction) {
			count = a.calculate(count);
			a.date();
			a.memo();
			System.out.println("잔액 : "+count+"원");
		}
		System.out.println();
	}

}
