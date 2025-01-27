package com;

public class Interf {
	    static {
	        System.out.println("Parent static block");
	    }
	}

	class Child extends Interf {
	    static {
	        System.out.println("Child static block");
	    }
	}



