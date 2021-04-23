package com.bank.java.main;

import java.time.LocalDate;

public class SavingAccount extends Account {

	private static final Double INTEREST_RATE = 2.5;
	private static final Double WITHDRAWAL_LIMIT = 100000d;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(int accountNumber, Double balance) {
		super(accountNumber, balance);
	}

	@Override
	public Double deposite(Double amount) {
		if(amount > 0) {
			this.balance = this.balance + amount;
			addHistoryLog("Deposite", amount);
		}else {
			System.out.println("Can not deposite "+ amount);
		}
		return balance;
	}

	@Override
	public Double withdraw(Double amount) {
		if(amount > this.balance) {
			throw new RuntimeException("Insufficient Funds");
		}else {
			
			Double currentDayWithdrawal = logList.stream().filter(x -> LocalDate.now().equals(x.getTransactionDate()) && "Withdraw".equals(x.getTransactionType())).mapToDouble(x -> x.transactionAmount).sum();
			if(currentDayWithdrawal + amount > WITHDRAWAL_LIMIT) {
				throw new RuntimeException("Can not withdraw more than "+ WITHDRAWAL_LIMIT + "on same Day");
			}else {
				this.balance = this.balance - amount;
				addHistoryLog("Withdraw", amount);
			}
			
		}
		return balance;
	}
	

	
	public void calculateInterest() {
		Double interest = (this.getBalance() * 0.33 * INTEREST_RATE) / 100;
		this.balance = this.balance + interest;
		addHistoryLog("Interest", interest);
	}

}
