package com;

public class MainClasss {
	static void display(Employee obj)
	{
		obj.work();
	}
	public static void main(String[] args) {
		MainClass m=new MainClass();
		display(new Tester());
		display(new Employee());
	}

}
