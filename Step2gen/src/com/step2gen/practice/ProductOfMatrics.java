package com.step2gen.practice;

public class ProductOfMatrics {

	public static void main(String[] args) {
		int a[][] = {    
                {1, 3, 2},    
                {3, 1, 1},    
                {1, 2, 2}    
             };    
    
//Initialize matrix b    
int b[][] = {    
                {2, 1, 1},    
               {1, 0, 1},    
               {1, 3, 1}    
           };    
		int[][] c = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
