package com;

public  class Concrete  extends Main{
	public void run() {
		System.out.println("Running");
	}
	public static void main(String[] args) {
		Concrete c=new Concrete();
		c.run();
		System.out.println("hello");
	}

}
