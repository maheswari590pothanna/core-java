package com;

public   class Pen {
	String color;
	static int  cost;
	 Pen(String color,int cost)
	{
		this.color=color;
		this.cost=cost;
		System.out.println("hey hello pen costructor");
	}
	void write()
	{
		System.out.println("pen is writing");
	}
	static void erase()
	{
		System.out.println("we can not erase");
	}
	 class Pencil
	{
		 void purchase()
		{
			System.out.println("it is writing");
		}
	}
	


}
