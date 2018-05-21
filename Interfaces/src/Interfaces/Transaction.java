package Interfaces;

import java.util.Date;

public class Transaction implements ITransactions {

	String transactionTaxCode;
	Date transactionDate;
	double transactionAmount;
	
	@Override
	public void showAllTransaction() {
		
		System.out.println("Transaction: \t" + transactionTaxCode);
		System.out.println("Date: \t\t" + transactionDate);
		System.out.println("Amount: \t" + getTransactionAmount());
		
	}

	@Override
	public double getTransactionAmount() {

		switch(transactionTaxCode) {
			case "T1" :
			{
				transactionAmount = transactionAmount / 1.2;
				break;
			}
			case "T0" :
			case "T2" :
			case "T3" :
			case "T4" :
			case "T5" :
			case "T6" :
			case "T7" :
			case "T8" :
			case "T9" :
			{
				transactionAmount = transactionAmount / 1.0;
				break;
			}
			default:
			{
				transactionAmount = transactionAmount / 1.0;
				break;
			}
		}
		return transactionAmount;
	}

}
