package com.step2gen.practice;

import java.util.*;

public class FrequencyChar {

	public static void main(String[] args) {
		String str = "picture perfect";
		
		char[] arr = str.toCharArray();
		
		Map<Character, Integer> count = new HashMap<>();
		
		for(char c : arr) {
			count.put(c, count.getOrDefault(c, 0)+ 1);
		}
		
		for(Map.Entry<Character, Integer> entry : count.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
