package com;

public class DescZigzagArray {
	public static void main(String[] args) {
		int[] a= {1,9,5,4};
		int[] b= {8,7,1};
		int[] c=merge(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i] +" ");
		}
	}

	static int[] merge(int[] x,int[] y)
	{
		int[] c=new int[x.length+y.length];
		int i=x.length-1;
		int j=y.length-1;
		int k=0;
		while(i>=0 && j>=0)
		{
			if(x[i]>y[j])
			{
				c[k++]=x[i--];
			}
			else
			{
				c[k++]=y[j--];
			}
		}
		while(i>=0)
		{
			c[k++]=x[i--];
		}
		while(j>=0)
		{
			c[k++]=y[j--];
		}
		return c;
	}

}

