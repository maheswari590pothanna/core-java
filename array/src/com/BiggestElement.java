package com;

public class BiggestElement {
	public static void main(String[] args) 
	{
		int[] ar= {12,23,45,56,86,76};
		int big=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
			}
		System.out.println("the biggest element in the array:"+big);
	}
}


