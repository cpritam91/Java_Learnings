package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class CollectionPractice {

	@SuppressWarnings("unchecked")
	@Test
	public void sortInts() {
		
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("Pritam", 53);
		myMap.put("Sumit", 21);
		myMap.put("Subodh", 44);
		
		List<MapEntry> myList = new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry : myMap.entrySet()) {
			MapEntry myEntry = new MapEntry(entry.getKey(), entry.getValue());
			myList.add(myEntry);
		}
		
//		Collections.sort(myList);
		Collections.sort(myList,new Comparator<MapEntry>(){

			@Override
			public int compare(MapEntry o1, MapEntry o2) {
				return o2.getValue() - o1.getValue();
			}
			
		});
		List<Integer> valueList = myList.stream().map(p -> p.getValue()).collect(Collectors.toList()); 
		@SuppressWarnings("serial")
		List<Integer> expectedList = new ArrayList<Integer>() {{
			
			add(53);
			add(44);
			add(21);
			
		}};
		Assert.assertArrayEquals(expectedList.toArray(), valueList.toArray());
		
		Deque<Integer> myQueue = new LinkedList<>();
		
	}

}
