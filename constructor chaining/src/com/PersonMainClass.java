package com;

public class PersonMainClass {
	static void display(Person obj) {
		if (obj instanceof Human) {
			Human e = (Human) obj;
			System.out.println(e.id);
			e.work();
		} else if (obj instanceof Devil) {
			Devil s = (Devil) obj;
			s.study();
		}
	}

	public static void main(String[] args) {
		display(new Human());
		display(new Devil());
	}
}
