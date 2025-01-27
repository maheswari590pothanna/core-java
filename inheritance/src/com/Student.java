package com;

public class Student extends Person{
	private int roll;
	private String branch;
	public Student()
	{
		System.out.println("from sub classs");
		roll=590;
		branch="cse";
		
	}
	public void displayStudent()
	{
		display();
		
		System.out.println("roll"+roll);
		System.out.println("branch"+branch);
	}

}
