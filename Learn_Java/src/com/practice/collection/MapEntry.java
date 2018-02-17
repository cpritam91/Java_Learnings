package com.practice.collection;

public class MapEntry implements Comparable<MapEntry>{
	
	private String key;
	private int value;
	
	public MapEntry(String key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(MapEntry o) {
		return this.getValue() - o.getValue();
	}
	
	
}
