package com.java.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		Map<Item, Integer> testMap = new HashMap<>();
		
		testMap.put(new Item(20), 20);
		testMap.put(new Item(21), 21);
		
		System.out.println(testMap);
	}

}
