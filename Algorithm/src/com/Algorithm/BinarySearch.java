package com.Algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {20,30,40,50,60};
		int key = 50;
		int position = binarySearch(arr,key);
		if(position!= -1) {
			System.out.println("Elment found at " + position);
		}else {
			System.out.println("Element not found");
		}
	}
	
	public static int binarySearch(int[]arr, int key) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid] == key) {
				return mid;
			}else if(key > arr[mid]) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return -1;
	}

}
