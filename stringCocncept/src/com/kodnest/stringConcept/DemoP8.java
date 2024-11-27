package com.kodnest.stringConcept;

import java.util.Scanner;

public class DemoP8 {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String s = new String(sc.nextLine());
   reverseString(s);
    
	}
	
	public static void reverseString(String str) {
		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length];
		
		int j = arr2.length-1;
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = arr2[j];
			j--;
		}
		
		String str2 = new String(arr2);
		System.out.println(str2);
	}

}
