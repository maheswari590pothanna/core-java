package com;

public class Son extends Father{
	Son()
	{
		super(100);
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Son s=new Son();
	}

}
