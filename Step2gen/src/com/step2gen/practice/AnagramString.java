package com.step2gen.practice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1 = "Grab";
		String str2 = "Brag";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		}else {
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			if(Arrays.equals(s1,s2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}

	}

}
