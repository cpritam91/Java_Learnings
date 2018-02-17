package com.challenge.ge;

import java.util.Scanner;

public class TotalDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int startIndex = sc.nextInt();
		int startX = arr[startIndex];
		int xN1 = sc.nextInt();
		int yN1 = sc.nextInt();
		sc.close();
		double totalDistance = getTotalDistance(arr,startX,xN1,yN1);
		System.out.println(totalDistance);
	}

	private static double getTotalDistance(int[] arr, int startX, int xN1, int yN1) {
		
		double distance;
		if(xN1 < startX) {
			distance = moveRightFirst(arr, startX, xN1, yN1);
		} else if(xN1 > startX) {
			distance = moveLeftFirst(arr, startX, xN1, yN1);
		} else {
			if((startX - nextSmaller(arr, startX)) < (nextLarger(arr, startX) - startX)) {
				distance = moveLeftFirst(arr, startX, xN1, yN1);
			} else {
				distance = moveRightFirst(arr, startX, xN1, yN1);
			}
		}
		return distance;
	}

	private static double moveLeftFirst(int[] arr, int startX, int xN1, int yN1) {
		double distance = 0d;
		distance += startX - min(arr);
		distance += distanceBetween2Points(min(arr), 0, xN1, yN1);
		distance += distanceBetween2Points(xN1, yN1, nextLarger(arr, startX), 0);
		distance += max(arr) - nextLarger(arr, startX);
		return distance;
	}

	private static double moveRightFirst(int[] arr, int startX, int xN1, int yN1) {
		double distance = 0d;
		distance += max(arr) - startX;
		distance += distanceBetween2Points(max(arr), 0, xN1, yN1);
		distance += distanceBetween2Points(xN1, yN1, nextSmaller(arr, startX), 0);
		distance += nextSmaller(arr, startX) - min(arr);
		return distance;
	}
	
	public static double distanceBetween2Points(int x1, int y1, int x2, int y2) {
		double xSquare = Math.pow((double)x2 - x1, 2);
		double ySquare = Math.pow((double)y2 - y1, 2);
		return Math.sqrt(xSquare + ySquare);
	}
	
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			max = num > max ? num : max;
		}
		return max;
	}
	
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int num : arr) {
			min = num < min ? num : min;
		}
		return min;
	}
	
	public static int nextLarger(int[] arr, int x) {
		int nextLarger = Integer.MAX_VALUE;
		for(int num : arr) {
			if(num > x && num < nextLarger) {
				nextLarger = num;
			}
		}
		return nextLarger;
	}
	
	public static int nextSmaller(int[] arr, int x) {
		int nextSmaller = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num < x && num > nextSmaller) {
				nextSmaller = num;
			}
		}
		return nextSmaller;
	}
}
