package com.practice.algorithms;

public class PossiblePairSums {

	public static void main(String[] args) {

		int input[] = {1,2,2,2,3,4,5,5,5,5,5};
		int sum = 7;
		int i = 0, j = input.length -1;
		
		while(i<j) {
			if(input[i] + input[j] == sum) {
				System.out.println("(" + input[i] + "," + input[j] + ")");
				do {
					i++;
				} while (input[i] == input[i-1]);
				do {
					j--;
				} while (input[j] == input[j+1]);
			} else if(input[i] + input[j] > sum) {
				j--;
			} else if(input[i] + input[j] < sum) {
				i++;
			}
		}
	}

}
