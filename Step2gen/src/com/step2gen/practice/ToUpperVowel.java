package com.step2gen.practice;

public class ToUpperVowel {

	public static void main(String[] args) {
		String str = "hello world";
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i] >= 'a' && arr[i] <='z') && !(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' )) {
				arr[i] = (char)(arr[i]-32);
			}
		}
		
		arr.toString();
		System.out.println(arr);

	}

}
