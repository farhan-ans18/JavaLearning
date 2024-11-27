package com.kodnest.stringConcept;

public class Demop4 {

	public static void main(String[] args) {
		String s1 = "Hello world ";
		String s2 = "Hello      bolo   ";
		
		System.out.println(absDiff(s1, s2));
		

	}
	
	public static String absDiff(String a, String b) {
		int count1 =countWhiteSpace(a);
		int count2 = countWhiteSpace(b);
		
		int countDiff = Math.abs(count1 - count2);
		
		String check = (countDiff%2==0)? "Even":"Odd";
		
		return check + " " + countDiff;
	}
	
	public static int countWhiteSpace(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == ' ') {
				count++;
			}
		}
		return count;
	}

}
