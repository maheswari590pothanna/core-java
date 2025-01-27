package com;

public class VehicleMainClass {
	public static void main(String[] args) {
		Bike b=new Bike();
		System.out.println(b.brand);
		b.ride();
		System.out.println("=============================");
		Car c=new Car();
		System.out.println(c.brand);
		c.drive();
	}

}
