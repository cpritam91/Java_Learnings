package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Pritam", Gender.MALE, 26));
		people.add(new Person("Srabona", Gender.FEMALE, 25));
		people.add(new Person("Sucheta", Gender.FEMALE, 15));
		
		//List of names of all females with age more than 18
		List<String> names = people.stream().filter(person -> person.getAge() > 18)
										.filter(person -> person.getGender().equals(Gender.FEMALE))
										.map(person -> person.getName().toUpperCase())
										.collect(Collectors.toList());
		System.out.println(names);
	}

}
