package com;

public class InsertElement {
	public static void main(String[] args) {
		int[] a= {23,34,65,21,78};
		int[] ar=insertArr(a,39,2);
		if(a==null)
			System.out.println("insertion failed");
		else
		{
			System.out.println("insertion done");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i] +"");
			}
		}
		static int[] insertArr(int[] x,int ele,int in)
		{
			if(in<0 || in>x.length)
				return null;
			int[] y= new int[x.length+1];
			y[in]=ele;
			for(int i=0;i<x.length;i++)
			{
				if(i<in)
					y[i]=x[i];
				else
					y[i+1]=x[i];
			}
			return y;
		}
	}

}
