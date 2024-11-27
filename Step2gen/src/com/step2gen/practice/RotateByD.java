package com.step2gen.practice;

import java.util.Scanner;

public class RotateByD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        
        for(int i=0; i<arr.length; i++) {
       	 arr[i] = sc.nextInt();
        }
        System.out.println("enter d");
        int d = sc.nextInt();
        
        rotateLeft(arr, d);
        
        for(int el : arr) {
        	System.out.print(el + " ");
        }
	}
	
	public static void rotateLeft(int[]arr, int d) {
		int n = arr.length;
		
		int[] temp = new int[n];
		
		d%=n; // handling the case when d>n;
		
		// first copying the n-d elements to the first in temp
		for(int i=0; i<n-d; i++) {
			temp[i] = arr[d+i];
		}
		
		// copying the d elements to the last of temp
		
		for(int i=0; i<d; i++) {
			temp[n-d+i] = arr[i];
		}
		
		// copying back the temp array to the original array
		
		for(int i=0; i<n; i++) {
			arr[i] = temp[i];
		}
	}

}
