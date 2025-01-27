package org;

public abstract class Person {
	abstract void eat();

	abstract void walk();

}

abstract class Employee extends Person
{
	abstract void work();


}
class Tom extends Employee
{
	@Override

	void eat()
	{
		System.out.println("the person is eating");
	}
	@Override
	void walk()
	{
		System.out.println("the person is walking");
	}
	@Override
	void work()
	{
		System.out.println("employee is working");
	}
	public static void main(String[] args) {
		Tom t=new Tom();
		t.eat();
		t.work();
		t.walk();
	}
}
