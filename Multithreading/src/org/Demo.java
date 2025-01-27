package org;

public class Demo {
	public static void main(String[] args) {
		// Default thread main is provided
		Thread t1=new Thread();
		System.out.println("Name:"+t1.getName());
		t1.setName("bike thread");
		System.out.println("Name:"+t1.getName());

		// Custom thread name is provided
		Thread t2=new Thread("car thread");
		System.out.println("Name:"+t2.getName());
	}

}
