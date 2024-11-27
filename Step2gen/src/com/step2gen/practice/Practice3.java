package com.step2gen.practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        
        for(int i=0; i<arr.length; i++) {
       	 arr[i] = sc.nextInt();
        }
        
        System.out.println(evenSum(arr));
	}
	
	public static int evenSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum += arr[i];
			}
		}
		
		return sum;
	}

}
