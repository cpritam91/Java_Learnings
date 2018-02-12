package com.java8.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestLineApp {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\Java_Learnings\\Learn_Java\\src\\com\\java8\\stream\\TextFile.txt"));
		int len = br.lines()
					.mapToInt(String::length)
					.max()
					.getAsInt();
		br.close();
		System.out.println(len);
	}
}
