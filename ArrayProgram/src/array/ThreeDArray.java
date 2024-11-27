package array;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[][][] arr = new int[a][b][c];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the elements for " + i + ", " + j + " ," + k);
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("3D array printing");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {

				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " "); 
				}
				System.out.println();
			}
	
		}
		

	}

}
