package com;

public class Employee {
	int id;
	String name;
	double sal;
	Employee(int id)
	{

		this("tom",22);
		System.out.println("employee id is:"+id);
		
	}
	Employee(String name,int id )
	{
		this("tom",2.8);
		
		
		System.out.println("name:"+name+"id :"+id);
		
	}
	Employee(String name,double sal)
	{
		
		System.out.println("name :"+name+"sal"+sal);
		
	}
	public static void main(String[] args) {
		Employee e =new Employee(22);
	}

}
