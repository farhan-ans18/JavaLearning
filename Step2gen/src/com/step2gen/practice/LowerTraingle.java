package com.step2gen.practice;

public class LowerTraingle {

	public static void main(String[] args) {
		int a[][] = {       
                {1, 2, 3},    
                {8, 6, 4},    
                {4, 5, 6}    
            }; 
		
		int row = a.length;
		int col = a[0].length;
		
		if(row!=col) {
			System.out.println("Matrix shoul be Squared matrix");
		}else {
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(i<j) {  // (i>j) for upperTraingle
						a[i][j] = 0;
					}
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}