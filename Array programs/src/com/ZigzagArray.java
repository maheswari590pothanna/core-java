package com;

public class ZigzagArray {
	
	public static void main(String[] args) {
		int[] a= {1,3,5,7,9};
		int[] b= {2,4,6,8};
		int[] c=merge(a,b);
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i] +" ");
		}
	}
	static int[] merge(int[] x,int[] y)
	{
		int i=0,j=0,k=0;
		int[] c=new int[x.length+y.length];
		while(i<x.length && j<y.length)
		{
			c[k++]=x[i++];
			c[k++]=y[j++];
		}
		while(i<x.length)
		{
			c[k++]=x[i++];
		}
		while(j<y.length)
		{
			c[k++]=y[j++];
		}
return c;
		
	}

}
