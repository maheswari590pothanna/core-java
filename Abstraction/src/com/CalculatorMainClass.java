package com;

import java.util.Scanner;

public class CalculatorMainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a and b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculator calc=new CalculatorImple();
		calc.add(a,b);
		calc.mul(a,b);
		sc.close();

	}
}


