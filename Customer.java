package com.bank.java.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {

	private String name;
	private int id;
	private SavingAccount savingAccountOne;
	private Set<CurrentAccount> currentAccounts = new HashSet();;
	private Customer coOnwer;
	
	public Customer(String name, int id, SavingAccount savingAccountOne) {
		super();
		this.name = name;
		this.id = id;
		this.savingAccountOne = savingAccountOne;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SavingAccount getSavingAccountOne() {
		return savingAccountOne;
	}

	public void setSavingAccountOne(SavingAccount savingAccountOne) {
		this.savingAccountOne = savingAccountOne;
	}


	public Set<CurrentAccount> getCurrentAccounts() {
		return currentAccounts;
	}

	public void setCurrentAccount(CurrentAccount currentAccount) {
		this.currentAccounts.add(currentAccount);
	}

	public Customer getCoOnwer() {
		return coOnwer;
	}

	public void setCoOnwer(Customer coOnwer) {
		this.coOnwer = coOnwer;
	}
}