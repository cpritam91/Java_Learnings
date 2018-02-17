package com.practice.aop.model;

public class Triangle {

	private String name;

	public String getName() {
		System.out.println("inside getName");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
