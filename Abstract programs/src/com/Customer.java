package com;

public  class Customer extends Amazon{
	@Override
	void pay(int  amount)
	{
		System.out.println("paying "+amount);
	}
	@Override
	void buy(String product)
	{
		System.out.println("buying "+product);
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.pay(60000);
		c.buy("Laptop");
		
	}
	

}
