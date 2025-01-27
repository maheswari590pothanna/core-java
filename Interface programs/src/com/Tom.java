package com;

class Tom  implements Person{
	@Override
	public void eat()
	{
		System.out.println("tom is eating");
	}

	public static void main(String[] args) {
		Tom tom=new Tom();
		tom.eat();
		System.out.println("age:"+Person.age);
	}

}
