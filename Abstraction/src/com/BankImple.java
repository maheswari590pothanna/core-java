package com;

public class BankImple implements Bank {
	int balance=50000;
	public void deposit(int amount)
	{
		System.out.println("depositing rs"+amount);
		balance =balance+amount;
		System.out.println("depositing amount successfully");
		
	}
	public void withdraw(int amount)
	{
		System.out.println("withdraw money"+amount);
		balance=balance-amount;
		System.out.println("withdraw amount successfully");
		
	}
	public void checkbalance()
	{
		System.out.println("avaialable balance:"+balance);
	}

}
