package org;

public class MainRunner {
	public static void main(String[] args) {
		Thread t=new Thread(new Zomato());
		t.start();
		System.out.println("=================");
		Swiggy s=new Swiggy();
		s.start();
	
	}

}
