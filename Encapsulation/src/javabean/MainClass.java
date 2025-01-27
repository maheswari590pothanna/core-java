package javabean;

public class MainClass extends Student {
	
	MainClass(int age)
	{
	
		System.out.println("reading book");
	}
	public static void main(String[] args) {
		MainClass m=new MainClass(20);
	}
}
