package com.java.access1;

public class Application {

	public static void main(String[] args) {
		
		A obj = new A();
		//The method getA() from the type A is not visible
		//obj.getA();
		//The variable a is protected and is visible inside the package.
		System.out.println(obj.a);
		obj.getAdefault();
	}

}
