package com.bank.java.main;

import java.time.LocalDate;

public class TransactionLog {

	public String transactionType;
	public Double transactionAmount;
	public LocalDate transactionDate;
	public Double balance;
	
	public TransactionLog(String transactionType, Double transactionAmount, LocalDate transactionDate, Double balance) {
		super();
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.balance = balance;
	}
	
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	
	
}
