package com.Algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 0, 1, 2 };
		int n = 5;
		bubbleSort(arr,n);

	}

	
	public static void bubbleSort(int[] arr, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;		
				}
			}
		}
		for(int el : arr) {
			System.out.print(el + " ");
		}
	}
}
