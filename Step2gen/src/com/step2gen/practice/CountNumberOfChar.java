package com.step2gen.practice;

public class CountNumberOfChar {

	public static void main(String[] args) {
		String str = "Farhan Ansari";
		
		int count = 0;
		
		for(char c : str.toCharArray()) {
			if(c != ' ') {
			count++;
			}
		}
		System.out.println(count);

	}

}
