package com.Algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {23,18,24,12,10};
		selectionSort(arr);

	}
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int min = arr[i];
			int pos = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<min){
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		
		for(int el : arr) {
			System.out.print(el + " ");
		}
	}

}
