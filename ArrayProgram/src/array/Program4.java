package array;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of row: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of column : ");
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.println("Enter the elments for: " + "[" + i + ", " +j + "]");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print("[");
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j]);
				if(j<m-1) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
			System.out.println();
		}
	}

}
