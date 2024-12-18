package com.step2gen.practice;

import java.util.*;

public class DuplicatesItems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        
        for(int i=0; i<arr.length; i++) {
       	 arr[i] = sc.nextInt();
        }
        
        Set<Integer> unique = new TreeSet<>();
        Set<Integer> duplicates = new TreeSet<>();
        
        for(int el : arr) {
        	if(isPrime(el)) {
        	if(!unique.add(el)) {
        		duplicates.add(el);
        	}
        	}
        }
        int sum = 0;
        for(int ele : duplicates) {
        	System.out.print(ele + " ");
        }
        
        
	
        
        
        
//        System.out.println(duplicates(arr));
//        for(int el : arr) {
//        	System.out.print(el + " ");
//        }
	}
	
//	public static List<Integer> duplicates(int[] arr){
//		List<Integer> res = new ArrayList<>();
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] == arr[j]) {
//					if(!res.contains(arr[j])) {
//						res.add(arr[j]);
//					}
//				}
//			}
//		}
//		return res;
//	}

	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, prime
    }
	
}
