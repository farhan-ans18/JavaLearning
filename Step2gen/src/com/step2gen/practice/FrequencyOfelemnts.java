package com.step2gen.practice;

import java.util.*;

public class FrequencyOfelemnts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        
        for(int i=0; i<arr.length; i++) {
       	 arr[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : arr) {
        	countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Element occurences");
        
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
        	System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        
       
	}


}
