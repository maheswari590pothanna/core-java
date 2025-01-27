package com.number;

public class Person {
	public void work(Object o)
	{
		System.out.println("hi");
	}

}
class Employee extends Person{
//	@Override
//	private void work() {    //  when we are overriding we cannot decrease the visibility of a method
//		System.out.println("hello");
//	}
	//@Override
	public void work(String a) {
		System.out.println("hello");
		System.out.println(a);
	}
}
