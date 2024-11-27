package com.step2gen.practice;

public class IdentityMetrices {

	public static void main(String[] args) {
		int[][] a = {{1,0,0},{0,1,0},{0,0,1}};
		
		
		System.out.println(isIdentity(a));
		

	}
	
	public static boolean isIdentity(int[][] a) {
		int row = a.length;
		int col = a[0].length;
		
		if(row!=col) {
			System.out.println("Matrix shoul be a square matrix");
		}
		else {
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(i==j && a[i][j] !=1)return false; 
					if(i!=j && a[i][j] !=0)return false;
				}
			}
		}
		
		return true;
	}

}
