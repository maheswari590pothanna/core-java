package com;

public class MergeArray {
	public static void main(String[] args) {
		int[] a= {12,23,45,56,67,78};
		int[] b= {23,34,45};
		int[] c=merge(a,b);
		//int[] c=new int[a.length+b.length];
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i] +" ");
		}
	}
	static int[] merge(int[] x,int[] y)
	{
		int[] c=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			c[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			c[i+x.length]=y[i];
		}
	return c;

}
}
