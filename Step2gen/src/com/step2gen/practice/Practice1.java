package com.step2gen.practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         int[] arr = new int[sc.nextInt()];
         
         for(int i=0; i<arr.length; i++) {
        	 arr[i] = sc.nextInt();
         }
         
         reversed(arr);
         printing(arr);
         
	}
	
//	public static void reversed(int[] arr) {
//		int n = arr.length;
//	    int left = 0; 
//	    int right = n-1;
//	    while(left < right) {
//	    	int temp = arr[left];
//	    	arr[left] = arr[right];
//	    	arr[right] = temp;
//	    	left++;
//	    	right--;
//	    }
//	}
	
	public static void reversed(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
	}
	
	public static void printing(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
   
}
