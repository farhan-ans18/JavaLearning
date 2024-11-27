package com.step2gen.practice;

import java.util.Scanner;

public class RotateRight {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
    int[] arr = new int[sc.nextInt()];
    
    for(int i=0; i<arr.length; i++) {
   	 arr[i] = sc.nextInt();
    }
    System.out.println("enter d");
    int d = sc.nextInt();
    
    rotateRight(arr, d);
    
    for(int el : arr) {
    	System.out.print(el + " ");
    }
    
	}
	
	public static void rotateRight(int[] arr, int d) {
		int n = arr.length;
		int[] temp = new int[n];
		
		d%=n;
		
		for(int i=0; i<d; i++) {
			temp[i] = arr[n-d+i];
		}
		
		for(int i=0; i<n-d; i++) {
			temp[d+i] = arr[i];
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = temp[i];
		}
	}
}
