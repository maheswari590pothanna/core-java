package com;

public class Customer implements uber {
	public void payAmount()
	{
		System.out.println(".....");
	}
	public void bookCab()
	{
		System.out.println(".......");
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.payAmount();
		c.bookCab();
	}

}
