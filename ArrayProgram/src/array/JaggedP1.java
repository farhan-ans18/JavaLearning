package array;

import java.util.Scanner;

public class JaggedP1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1D length ");
		int[][] arr = new int[sc.nextInt()][];
		System.out.println("Enter 2D length for each 1D ");
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter 2D length for 1D " + i);
			arr[i] = new int[sc.nextInt()];
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter array for " + i + " and " + j);
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Jagged Array printing");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
