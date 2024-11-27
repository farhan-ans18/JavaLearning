package com.step2gen.practice;

import java.util.Scanner;

public class MaxnumOf1s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		int row = 0;
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 1) {
					count++;
				}
				
				if(count > max) {
					max = count;
					row = i;
				}
			}
		}
		
		System.out.println("Row: " + row + " Max: " + max );
	}

}