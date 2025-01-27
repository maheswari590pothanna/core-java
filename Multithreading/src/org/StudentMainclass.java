package org;

public class StudentMainclass {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("child thread");
		s.setPriority(4);
		s.start();
	}

}
