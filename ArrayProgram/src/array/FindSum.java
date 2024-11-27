package array;

import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] =  sc.nextInt();
		}
		System.out.print("Arrays: [");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
			if(i<n-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		int sum = findSum(arr,n);
		System.out.println("Sum: " + sum);
		
	}
	
	public static int findSum(int[] arr, int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
