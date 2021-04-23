package com.bank.test.main;


import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import com.bank.java.main.Customer;
import com.bank.java.main.SavingAccount;

import junit.framework.Assert;


class CustomerTest {

	@Test
	void testCreateCustomer() {
		Customer cust = new Customer("Ram", 1, null);
		Assert.assertNotNull(cust);
	}
	
	@Test
	void testAddSavingAccount() {
		Customer cust = new Customer("Ram", 1, null);
		Assert.assertNotNull(cust);
		SavingAccount sAccount = new SavingAccount(123, 100000d);
		cust.setSavingAccountOne(sAccount);
		Assert.assertNotNull(cust.getSavingAccountOne());
	}
	
	@Test
	void testSavingAccountTransactions() {
		Customer cust = new Customer("Ram", 1, null);
		Assert.assertNotNull(cust);
		SavingAccount sAccount = new SavingAccount(123, 100000d);
		cust.setSavingAccountOne(sAccount);
		Assert.assertNotNull(cust.getSavingAccountOne());
		sAccount.deposite(15000d);
		sAccount.deposite(20000d);
		sAccount.withdraw(20000d);
		
		Assert.assertEquals(115000d, sAccount.getBalance());
	}
	
	@Test
	void testSavingAccountWithDrawalLimit() {
		Customer cust = new Customer("Ram", 1, null);
		Assert.assertNotNull(cust);
		SavingAccount sAccount = new SavingAccount(123, 100000d);
		cust.setSavingAccountOne(sAccount);
		Assert.assertNotNull(cust.getSavingAccountOne());
		sAccount.deposite(15000d);
		sAccount.deposite(30000d);
		sAccount.withdraw(20000d);
		
		try {
			sAccount.withdraw(85000d);
			fail("Ammount withdrown more than allowed limit");
		}catch(Exception e) {
			System.out.println("Customer not able to withdraw more than limit");
		}
	}

}
