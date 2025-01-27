package com;

public  class B extends A {
	B()
	{
		System.out.println("hi");
	}
	
		@Override
		public void sleep()
		{
			System.out.println("mahi is sleeping");
		}

		@Override
		public  void add(int a,int b)
		{
			
			System.out.println(a+b);
		}
	

}
