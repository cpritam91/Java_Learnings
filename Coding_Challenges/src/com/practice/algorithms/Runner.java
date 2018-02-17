package com.practice.algorithms;

import java.util.*;

public class Runner {

	private static int[][] findDistance(char[][] input, int size) {
		int[][] result = new int[size][size];
		for (int i = 0; i < size; i++) {
			Arrays.fill(result[i], Integer.MAX_VALUE);
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (input[i][j] == '0') {
					findDistanceRecursive(input, result, size, i, j, 0);
				}
			}
		}
		return result;
	}

	private static void findDistanceRecursive(char[][] input, int[][] result, int size, int i, int j, int currVal) {
		if(i >= size || j >= size || i < 0 || j < 0) {
			return;
		}
		result[i][j] = Math.min(result[i][j], currVal);
		if(i+1 < size && result[i+1][j] > result[i][j] + 1)
			findDistanceRecursive(input, result, size, i+1, j, result[i][j]+1);
		if(i-1 >= 0 && result[i-1][j] > result[i][j] + 1)
			findDistanceRecursive(input, result, size, i-1, j, result[i][j]+1);
		if(j+1 < size && result[i][j+1] > result[i][j] + 1)
			findDistanceRecursive(input, result, size, i, j+1, result[i][j]+1);
		if(j-1 >= 0 && result[i][j-1] > result[i][j] + 1)
			findDistanceRecursive(input, result, size, i, j-1, result[i][j]+1);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		char[][] input = new char[rows][];
		for (int i = 0; i < rows; i++) {
			char[] inputRow = sc.next().toCharArray();
			input[i] = inputRow;
		}
		sc.close();
		
		int[][] result = findDistance(input, rows);
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<rows; j++)
				System.out.print(result[i][j] + " ");
			System.out.println(); 
		}		 
	}

}