package org;

public class MainClass {
	public static void main(String[] args) {
		Amazon a = new Amazon();// Runnable type of object
		Thread t = new Thread(a);// thread type of object

		t.setName("amazon");// passing runnable type of object as a argument in the constructor of thread
		t.start();// setting new path of execution

		Thread u = new Thread(new Amazon());
		u.start();

		Thread r = new Thread(new Amazon(), "Amazon");
		r.start();

		new Thread(new Amazon(), "Amazon").start();
	}

}
