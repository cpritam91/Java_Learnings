package com.java.access2;

import com.java.access1.A;

public class B extends A {
	public int getC() {
		
		//Can't access default method/variable of superclass from outside package.
		//getAdefault();
		//Can access protected variable of superclass from outside package.
		return a;
	}
	
}
