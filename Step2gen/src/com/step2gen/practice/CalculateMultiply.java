package com.step2gen.practice;

public class CalculateMultiply {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
//		for(int i=0; i<arr.length; i++) {
//			int el = ((arr[i]*10) - ((i+1)*9));
//			System.out.print(el + " ");
//		}
		
		modify(arr);

	}
	
	public static  void modify(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (arr[i]*10 - arr[i] + digit(arr[i]));
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int digit(int x) {
		int digit = 0;
		while(x>0) {
			digit = digit + (x%10);
			x = x/10;
		}
		
		return digit;
	}

}