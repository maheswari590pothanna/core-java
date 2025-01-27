package com.number;

public class ABMainClass {

	public static void main(String[] args) {
//		String s1 = "ABC";
//		String s2 = "ABC";
//		
//		System.out.println(s1==s2);      >>>true
//		System.out.println(s1.equals(s2));  >>> true
		
    // literals are stored inside the constant pool
	// it does not allow duplicates
		
		String str1=new String("hello");
		String str2=new String("hello");
		
		StringBuilder sb=new StringBuilder(str1);
		System.out.println(sb.toString().equals(str2));
//		
//		System.out.println(str1 ==str2);    // false
//		System.out.println(str1.equals(str2));  // true
//		System.out.println();
		// with new operator strings will store inside the non constant pool
		// duplication is allowed
		
		
//		public class A
//		{
//			static {
//				System.out.println(1);
//			}
//			A(){
//				System.out.println(2);
//			}
//			{
//				System.out.println(3);
//			}
//		}
//		
//		class B extends A
//		{
//			static {
//				System.out.println(4);
//			}
//			B(){
//				System.out.println(5);
//			}
//			{
//				System.out.println(6);
//			}
//			public static void main(String[] args) {
//				B b=new B();
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		//		A a=new B();
//		a.run();
		// b.display();
	}

}
