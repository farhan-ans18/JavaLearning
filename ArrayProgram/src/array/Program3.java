package array;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the elments for index + " + i);
			nums[i] = sc.nextInt();
		}
		
		reversedArray(nums, n);
	}
	
	public static void reversedArray(int[] arr, int n) {
		int[] reverse = new int[n];
		
		for(int i=0; i<n; i++) {
			reverse[i] = arr[(n-i)-1];
		}
		
		System.out.print("Reversed Array : [");
		for(int el : reverse) {
			System.out.print(el + " ");
			
		}
	}

}
