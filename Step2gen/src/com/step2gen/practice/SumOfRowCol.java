package com.step2gen.practice;

public class SumOfRowCol {

	public static void main(String[] args) {
		 int a[][] = {       
                 {1, 2, 3},    
                 {4, 5, 6},    
                 {7, 8, 9}    
             };    
		 
		 int row = a.length;
		 int col = a[0].length;
		 
		 for(int i=0; i<row; i++) {
			 int rowSum = 0;
			 for(int j=0; j<col; j++) {
				 rowSum += a[i][j];
			 }
			 System.out.println("Row " + (i+1) + " Sum : " + rowSum);
		 }
		 
		 for(int i=0; i<row; i++) {
			 int colSum = 0;
			 for(int j=0; j<col; j++) {
				 colSum += a[j][i];
			 }
			 System.out.println("col " + (i+1) + " Sum : " + colSum);
		 }
	}

}
