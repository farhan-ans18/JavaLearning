package com.step2gen.practice;

import java.util.Scanner;

public class Practice4Clockwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        
        for(int i=0; i<arr.length; i++) {
       	 arr[i] = sc.nextInt();
        }
        
        rotate(arr);
        for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
	
	public static void rotate(int[] arr) {
		int i=0;
		int j = arr.length -1;
		
		while(i!=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
		
	}

}
