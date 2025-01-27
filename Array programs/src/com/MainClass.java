package com;

public class MainClass {
	public static void main(String[] args) 
	{
		int[] a= {10,20,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(".......");

		String[] fruits= {"Apple","Banana","Cherry","Mango"};
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
	}

}
// i<3 -> bad practice hard code
// i<a.length -> good practice
