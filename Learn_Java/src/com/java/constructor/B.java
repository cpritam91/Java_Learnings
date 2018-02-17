package com.java.constructor;

public class B extends A {

	public B() {
		//This call has to be done in compulsion as there is no default parent class constructor.
		//Calling of parent class constructor can't be prevented from child class.
		super(10);
	}
}
