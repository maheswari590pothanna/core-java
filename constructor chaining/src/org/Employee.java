package org;

public class Employee {
	int id;
	String name;
	double sal;
	 
	
	Employee(int id)
	{
	this.id=id;
		
	}
	Employee(int id,String name)
	
	{
		this(id);
		this.name=name;
	}
	Employee(int id,String name,double sal)
	{
		this(id,name);
		this.sal=sal;
	}
	public static void main(String[] args) {
		Employee e =new Employee(22,"mani",6.5);
		System.out.println("id:"+e.id +" "+"name:"+e.name+" "+"sal:"+e.sal);
	}
	

}
