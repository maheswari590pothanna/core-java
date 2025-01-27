package org;

public interface Calculator {
	void add(int a,int b);
	void sub(int a,int b);
	void mul(int a,int b);
	void div(int a,int b);
	
	// all the methods inside the interface is public abstract methods

}
class CalculatorImple  implements Calculator
{
	@Override
	public void add(int a,int b)
	{
		System.out.println("sum of the "+a+" and "+b+" is "+(a+b));
	}
	@Override
	public void sub(int a,int b) 
	{
		System.out.println("difference of the "+a+" and "+b+" is "+(a-b));
	}
	@Override
	public void mul(int a,int b)
	{
		System.out.println("product of the "+a+" and "+b+" is "+(a*b));
	}
	@Override
	public void div(int a,int b)
	{
		System.out.println("division of the "+a+" and "+b+" is "+(a/b));
	}
}