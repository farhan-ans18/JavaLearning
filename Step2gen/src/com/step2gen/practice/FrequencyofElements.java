package com.step2gen.practice;

import java.util.*;

public class FrequencyofElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        
        for(int i=0; i<arr.length; i++) {
       	 arr[i] = sc.nextInt();
        }
        
        System.out.println(getMajority(arr));
       
	}
	
	public static int getMajority(int[] arr) {
		Map<Integer, Integer> countMap = new HashMap<>();
	       for(int num : arr) {
	    	   countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	    	   
	    	   if(countMap.get(num) > arr.length/2) {
	    		   return num;
	    	   }
	       }
	       
	       return -1;
	}

}
