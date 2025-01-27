package org;

public class Student extends Thread{
	@Override
	public void run()
	{
		System.out.println("Studying java");
		Thread t=Thread.currentThread();
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.getName());
	}


}


