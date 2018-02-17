package com.practice.interfaces;

public class ImplementingClass implements TestInterface {

	@Override
	public void modifyVariable() {
		//variable = 20; //Can't modify variable as it is final by default.
	}
	
}
