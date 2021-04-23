package com.bank.java.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Account {

	protected int accountNumber;
	protected Double balance;
	protected List<TransactionLog> logList = new ArrayList<>();
	
	public Account() {
		
	}
	
	public Account(int accountNumber, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public abstract Double deposite(Double amount);
	public abstract Double withdraw(Double amount);
	
	protected void addHistoryLog(String action, Double amount) {
		logList.add(new TransactionLog(action, amount, LocalDate.now(), this.balance));
	}
	
	public void getHistory() {
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Account No:["+accountNumber+"]");
		System.out.println("Transaction_Date() | Mode | Transaction_Amount | Balance");
		
		logList.forEach(x -> {
			System.out.println(x.getTransactionDate()+" | "+x.getTransactionType()+" | " 
		   +x.getTransactionAmount()+ " | "+ x.getBalance());
		});
		
		System.out.println("----------------------------------------------------------");
	}
	
	public void printBalance( ) {
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Account No:["+this.getAccountNumber()+"], Balance:["+this.getBalance()+"]");
		
		
		System.out.println("----------------------------------------------------------");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}
}