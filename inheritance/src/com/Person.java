package com;

public class Person {
	protected String name;
	protected String address;
	public Person()
	{
	System.out.println("from the super class");
	name="maggi";
	address="anantapur";
	}
	public void display()
	{
		System.out.println("name"+name);
		System.out.println("address"+address);
	}
	public static void main(String[] args) {
		System.out.println("hello main method");
	}

}
