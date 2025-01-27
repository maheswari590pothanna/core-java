package com;

public class Demo {
	public static void main(String[] args) {
		// Array creation
		int [] a;
		// array creation
		a=new int[3];

		// printing array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("length"+a.length);

		System.out.println(" .....");
		//array initialization
		a[0]=100;
		a[2]=200;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//Array decleration
		double[] x;
		// Array creation
		x=new double[3];


		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println("length "+x.length);
		x[0]=1.5;
		x[2]=4.6;
		System.out.println(x[0]);



	}

}
