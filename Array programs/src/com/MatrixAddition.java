package com;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int r=sc.nextInt();
		System.out.println("enter the no of columns");
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		int[][] b=new int[r][c];
		int[][] d=new int[r][c];
		System.out.println("enetr the elements for the matrix a:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enetr the elements for the matrix b:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("sum of matrix one and elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(d[i][j]+" ");
		}
			System.out.println("\t");
	}
	}
}
