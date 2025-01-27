package com;

public class SmallestElement {
	public static void main(String[] args) {
		double small=Double.MAX_VALUE;
		double[] ar= {2.3,4.3,5.4,6.5,7.5};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		System.out.println(small+" is the small element");
	}

}

