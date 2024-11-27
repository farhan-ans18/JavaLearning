package com.step2gen.practice;

public class SubsetsOfString {

	public static void main(String[] args) {
		String str = "Fun";
		int n = str.length();
		int temp = 0;
		String[] arr = new String[n*(n+1)/2];
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				arr[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		
		for(String s1 : arr) {
			System.out.println(s1 + " ");
		}
	}

}
