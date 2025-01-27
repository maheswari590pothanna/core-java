package com;

public class Vehicle 
{
	String brand="suzuki";

}
class Bike extends Vehicle
{
	String color="red";
	void ride()
	{
		System.out.print("ride the bike");
	}
}
class Car extends Vehicle
{
	int cost=400000;
	void drive()
	{
		System.out.print("drive the car");
	}
}

