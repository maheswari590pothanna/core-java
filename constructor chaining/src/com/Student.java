package com;

public class Student {
	Student (int age)
	{
		this(5.6);
		System.out.println("age:"+age);
	}
	Student(String name)
	{
		System.out.println("name:"+name);
	}
	Student(double height)
	{
		this("tom");
		System.out.println("height:"+height);
	}
	public static void main(String[] args) {
		Student s=new Student(22);
	}

}
