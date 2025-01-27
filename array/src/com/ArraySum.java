package com;

public class ArraySum {
		public static void main(String[] args) 
		{
			int[] ar= {12,23,45,56,86,76};
			int sum=0;
			for(int i=0;i<ar.length;i++)
			{
				sum=sum+ar[i];
			}
			System.out.println("the sum of the all elements:"+sum);

		}
	}


