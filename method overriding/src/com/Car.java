package com;

public class Car extends Vehicle {
	@Override
	void start()
	{
		super.start();
		System.out.println("car started");
		super.start();
	}
	

}
