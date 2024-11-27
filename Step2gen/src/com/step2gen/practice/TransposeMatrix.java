package com.step2gen.practice;

public class TransposeMatrix {

	public static void main(String[] args) {
		 int a[][] = {    
                 {1, 2, 3},    
                 {4, 5, 6},    
                 {7, 8, 9}    
              };    
     
        int row = a.length;    
        int col = a[0].length;   
        
        int[][] transpose = new int[row][col];
        
        for(int i=0; i<row; i++) {
        	for(int j=0; j<col; j++) {
        		transpose[i][j] = a[j][i];
        		System.out.print(transpose[i][j] + " ");
        	}
        	System.out.println();
        }
        
        
	}

}
