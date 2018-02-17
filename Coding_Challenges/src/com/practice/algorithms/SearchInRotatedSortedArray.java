package com.practice.algorithms;

public class SearchInRotatedSortedArray {

	public int searchInArray(int arr[], int left, int right, int element) {
		if(left > right) {
			return -1;
		}
		int pivot = left + (right - left)/2;
		if(arr[pivot] == element) {
			return pivot;
		}
		if(pivot <= right && arr[pivot] <= arr[right]) {
			if(element > arr[pivot] && element <= arr[right]) {
				return searchInArray(arr, pivot+1, right, element);
			} else {
				return searchInArray(arr, left, pivot-1, element);
			}
		} else {
			if(element < arr[pivot] && element >= arr[left]) {
				return searchInArray(arr, left, pivot-1, element);
			} else {
				return searchInArray(arr, pivot+1, right, element);
			}
		}
	}
	
	public static void main(String[] args) {
//		int arr[] = {7,8,1,2,3,4,5,6};
		int arr[] = {2};
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
		int result = obj.searchInArray(arr, 0, arr.length - 1, 3);
		System.out.println(result);
	}

}
