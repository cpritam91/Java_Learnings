package com.java.access1;

public class B extends A {

	private int getA() {
		//The variable a is protected and is visible inside the package and inheritance tree
		return a;
	}
	
	//Cannot reduce the visibility of method in subclass.
	/*private int getAdefault() {
		return 15;
	}*/
}
