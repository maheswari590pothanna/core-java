package org;

import java.util.ArrayList;

public class MainClass1 {
	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<Person>();
		al.add(new Employee());
		al.add(new Student1());
		for(Person p:al)
		{
			if(p instanceof Student1)
			{
				Student1 s=(Student1)p;
				System.out.println(s.marks);
			}
			if(p instanceof Employee)
			{
				Employee e=(Employee)p;
			System.out.println(e.salary);	
			}
		}
		
	}

}
