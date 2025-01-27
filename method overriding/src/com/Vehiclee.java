package com;

public class Vehiclee {

	protected void start() {
		System.out.println("Vehicle is starting");
	}
}

class Zeep extends Vehiclee {
	public void start() {
		System.out.println("Zeep is starting");
	}
}
