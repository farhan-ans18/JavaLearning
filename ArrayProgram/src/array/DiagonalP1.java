package array;

import java.util.Scanner;

public class DiagonalP1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int m = sc.nextInt();

		int[][] arr = new int[m][m];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<m; j++) {
			System.out.println("Enter the elements for " + i + " & " + j);
				arr[i][j] = sc.nextInt();
			}
		}
		
		printArray(arr);
		System.out.println();
		getDiagonalElement(arr);
		System.out.println();
		int res = getDiagonalSum(arr);
		System.out.println("The sum of PDS element = " + res);
		
	}
	
	public static void getDiagonalElement(int[][] arr) {
		System.out.println("Principal Diagonal array are: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i==j) {
				System.out.print(arr[i][j] + " ");
				}
			}
		}
	}
	
	public static void printArray(int[][] arr) {
		System.out.print("Array : [");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]);
				if(j<arr.length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		System.out.print("]");
	}
	
	public static int getDiagonalSum(int[][] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i==j) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}
	
	
	

}
