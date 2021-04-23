package com.bank.java.main;

public class BankApplication {

	public static void main(String args[]) {
		System.out.println("Welcome to my Bank");
		
		Customer cust = new Customer("Ram", 1, null);
		System.out.println("Created a Customer, Name:["+ cust.getName()+"], id:["+cust.getId()+"]");
		
		SavingAccount sAccount = new SavingAccount(123, 100000d);
		cust.setSavingAccountOne(sAccount);
		
		System.out.println("Opened Saving Account for cust:"+cust.getName()+ ", Account No:"+cust.getSavingAccountOne().getAccountNumber()+ ",Balance"+cust.getSavingAccountOne().getBalance());
		
		//deposit money
		sAccount.deposite(20000d);
		System.out.println("Deposited 20000");
		
		sAccount.deposite(30000d);
		System.out.println("Deposited 30000");
		
		sAccount.printBalance();
		sAccount.getHistory();
		
		sAccount.withdraw(10000d);
		sAccount.withdraw(10000d);
		sAccount.getHistory();
		
		System.out.println("Calculating Interest");
		sAccount.calculateInterest();
		sAccount.getHistory();
		
		CurrentAccount curAcc = new CurrentAccount(789, 2000d);
		cust.setCurrentAccount(curAcc);
		
		System.out.println("List of current accounts for :"+ cust.getName());
		cust.getCurrentAccounts().forEach(x-> {
			System.out.println("Account No:["+x.getAccountNumber()+"],Balance:["+x.getBalance()+"]");
		});
		
		sAccount.withdraw(90000d);
	}
}