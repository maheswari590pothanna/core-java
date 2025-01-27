package com.number;

public class Vehicle {

//	public int speed() {
//		return 66;
//	}
	
	
	static void sound() {
		System.out.println("vehicle sound");
	}

}

class Car extends Vehicle {
//	//@Override
//	public int speed() {
//		return 100;
//	}
	//@Override
	static void sound() {
		System.out.println("Car sound");
	}

}
