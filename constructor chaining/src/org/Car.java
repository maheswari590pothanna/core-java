package org;

public class Car {
	String brand;
	int cost;
	
	Car(String brand)
	{
		this.brand=brand;
		
	}
	Car(String brand,int cost)
	{
		this(brand);//just doing avoiding the code repetition
		this.cost=cost;
	}
	public static void main(String[] args) {
		Car c =new Car("suzuki",2000);
		System.out.println(c.brand);
		System.out.println(c.cost);
	}

}
