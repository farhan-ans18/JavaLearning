package array;

import java.util.Scanner;

public class ArrayP2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] arr = {23,45,56,1,2,4};
			int n = sc.nextInt();
			int get = findElement(arr,n);
			System.out.println("Element found at = " + get);
			}

	}

	public static int findElement(int[] arr, int num) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}
	
}
