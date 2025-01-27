package com;
// accessing access modifiers in the same class
public class Student {
	public int age=22;
	
	public Student(){
		System.out.println("hai hello");
	}

	public static void study()
	{
		System.out.println("studying java");
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("age:"+s.age);
		study();
	}


}
