package com.challenge.ninjacart;

import java.util.Scanner;

class Elevator {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int maxCapacity = sc.nextInt();
			int maxWeight = sc.nextInt();
			int weight[] = new int[n + 1];
			int capacity[] = new int[n + 1];
			int weightAtFloor[] = new int[n];
			int people[] = new int[n];
			for (int i = 1; i < n; i++) {
				people[i] = sc.nextInt();
			}
			int currentSize = 0;
			int currentWeight = 0;
			for (int i = 1; i < n; i++) {
				int floor[] = new int[people[i]];
				for (int j = 0; j < people[i]; j++) {
					floor[j] = sc.nextInt();
				}
				for (int j = 0; j < people[i]; j++) {
					capacity[floor[j]]++;
					int pWeight = sc.nextInt();
					weight[floor[j]] += pWeight;
					weightAtFloor[i] += pWeight;
				}
			}
			sc.close();
			int i = 1;
			for (; i < n; i++) {
				currentSize = currentSize - capacity[i] + people[i];
				if (currentSize > maxCapacity)
					break;
				currentWeight = currentWeight - weight[i] + weightAtFloor[i];
				if (currentWeight > maxWeight)
					break;
			}
			System.out.println(i);
		}
	}
}