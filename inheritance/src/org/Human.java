package org;

public class Human  extends Employee implements Person{

	@Override
	public void display() {
		System.out.println("human class");
		
	}
	public static void main(String[] args) {
		Human h=new Human();
		h.display();
		h.work();
	}
	

}
