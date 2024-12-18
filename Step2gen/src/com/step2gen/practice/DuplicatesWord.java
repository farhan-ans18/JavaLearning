package com.step2gen.practice;

import java.util.*;

public class DuplicatesWord {

	public static void main(String[] args) {
		String str = "Big black bug bit a big black dog on his big black nose"; 
		str = str.toLowerCase();
		String[] words = str.split(" ");
		
		Set<String> unique = new HashSet<>();
		Set<String> duplicate = new HashSet<>();
		for(String word : words) {
			if(!unique.add(word)) {
				duplicate.add(word);
			}
		}
		
		for(String word: duplicate) {
			System.out.print(word + " ");
		}
		
	}

}
