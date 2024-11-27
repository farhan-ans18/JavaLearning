package com.Algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {45,12,87,22,78,67};
		insertionSort(arr);

	}
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int item = arr[i];
			int j = i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = item;
		}
		
		for(int el : arr) {
			System.out.print(el + " ");
		}
	}

}
