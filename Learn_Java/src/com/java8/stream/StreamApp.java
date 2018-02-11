package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Pritam", Gender.MALE, 26));
		people.add(new Person("Srabona", Gender.FEMALE, 25));
		people.add(new Person("Sucheta", Gender.FEMALE, 15));
		people.add(new Person("Pritam", Gender.MALE, 15));

		// List of names of all females with age more than 18
		List<String> names = people.stream().filter(person -> person.getAge() > 18)
				.filter(person -> person.getGender() == Gender.FEMALE).map(person -> person.getName().toUpperCase())
				.collect(Collectors.toList());
		System.out.println(names);
		// Print all females
		// people.stream().filter(p -> p.getGender() ==
		// Gender.FEMALE).forEach(System.out::println);

		// Print all females with name in uppercase
		people.stream().filter(p -> p.getGender() == Gender.FEMALE)
				.map(person -> new Person(person.getName().toUpperCase(), person.getGender(), person.getAge()))
				.forEach(System.out::println);
		// Print sum of all the ages
		System.out.println(people.stream().map(p -> p.getAge()).reduce(0, Integer::sum));

		// There is always a single iteration. Internally all the operations are
		// very efficiently
		// merged and only a single iteration is done in the end.

		// Print the person with the max age
		System.out.println(
				people.stream().max((person1, person2) -> person1.getAge() <= person2.getAge() ? -1 : 1).get());
		// No storage. A stream is not a data structure that stores elements;
		// instead, it conveys elements from a source such as a data structure,
		// an array, a generator function, or an I/O channel, through a pipeline

		// Laziness-seeking. Many stream operations, such as filtering,
		// mapping, or duplicate removal, can be implemented lazily, exposing
		// opportunities for optimization. For example, "find the first String
		// with three consecutive vowels" need not examine all the input
		// strings. Stream operations are divided into intermediate
		// (Stream-producing) operations and terminal (value- or
		// side-effect-producing) operations. Intermediate operations are always
		// lazy.
		names = people.parallelStream().filter(p -> p.getAge() < 26).filter(p -> p.getGender() == Gender.FEMALE)
				.filter(p -> p.getName().equals("Srabona")).map(p -> p.getName()).collect(Collectors.toList());
		System.out.println(names);

		// Collecting results in a set
		Set<String> mySet = people.stream().map(p -> p.getName()).collect(Collectors.toSet());
		System.out.println(mySet);

		// Collecting results in a map
		Map<String, Person> myMap = people.stream()
				.collect(Collectors.toMap(p -> p.getName() + ":" + p.getAge(), p -> p));
		System.out.println(myMap);

		// Grouping By
		Map<String, List<Person>> groupMap = people.stream().collect(Collectors.groupingBy(Person::getName));
		System.out.println(groupMap);

		// TODO: Infinite streams, short-circuiting intermediate and terminal
		// operations, parallel streams, consequences, deterministic behavior
		// with sequential, find first person older than 25, avoid side effects,
		// totalling a value, mapping to a collection, non-determinism in some
		// special cases, find any person older than 25
	}

}