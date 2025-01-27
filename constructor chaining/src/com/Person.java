package com;

public class Person {
	String name;
	int age;

	void sleeping() {
		System.out.println(name + "age is" + age + "sleeping");
	}
}
class Human extends Person
{
	int id;
	void work()
	{
		System.out.println("id :"+id+"is "+"working");
	}
}
class Devil extends Person
{
	void study()
	{
		System.out.println("hlo student");
	}
}
