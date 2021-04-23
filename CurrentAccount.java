package com.bank.java.main;

public class CurrentAccount extends Account {

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int accountNumber, Double balance) {
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
			this.balance = this.balance - amount;
			addHistoryLog("Withdraw", amount);
		}
		return balance;
	}
	
	
	
}
