package com.step2gen.practice;

import java.util.*;

public class DuplicatesChar {

	public static void main(String[] args) {
		String str = "Great responsibility";
		str = str.toLowerCase();
		
		char[] arr = str.toCharArray();
		
		Set<Character> unique = new TreeSet<>();
		Set<Character> duplicate = new TreeSet<>();
		
		for(char c : arr) {
			if(!unique.add(c)) {
				duplicate.add(c);
			}
		}
		
		for(char el : duplicate) {
			System.out.print(el + " ");
		}
		
	}

}
