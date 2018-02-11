package com.java8.stream;

public class Person {

	private String name;
	private Gender gender;
	private int age;
	
	public Person(String name, Gender gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		//System.out.println("getName() called for " + name);
		return name;
	}

	public Gender getGender() {
		//System.out.println("getGender() called for " + name);
		return gender;
	}

	public int getAge() {
		//System.out.println("getAge() called for " + name);
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
