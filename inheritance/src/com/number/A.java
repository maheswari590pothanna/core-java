package com.number;

public class A {
	int a;
	static double b;

	private void display() {
		System.out.println("hi");
	}

	static void run() {
		System.out.println("hello");
		int a;
	}

}

class B extends A {

	//@Override
	static void run()
	{
		System.out.println("run method");
	}
	
}

//	int a;
//	double b;
//	final static int c = 0;
//
//	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
//
//	}
//
//}
