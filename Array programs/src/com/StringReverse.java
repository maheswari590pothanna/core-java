package com;

public class StringReverse {
	public static void main(String[] args) {
		String s="java";
		char[] ch= s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		System.out.println("================");
		
		StringBuffer s1=new StringBuffer("mahi");
		s1.reverse();
		System.out.println(s1);
	}

}

// String ->length();
// Array ->length
