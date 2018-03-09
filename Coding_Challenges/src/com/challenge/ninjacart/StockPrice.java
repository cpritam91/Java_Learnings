package com.challenge.ninjacart;

import java.util.Scanner;

class StockPrice {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0, maxSum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum < 0) {
				sum = 0;
			}
			maxSum = sum > maxSum ? sum : maxSum;
		}
		System.out.println(maxSum);
	}
}