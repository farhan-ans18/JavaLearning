package com.step2gen.practice;

public class FrequencyOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][] = {       
                 {4, 1, 3},    
                 {3, 5, 7},    
                 {8, 2, 6}    
             };    
		 
		 int row = a.length;
		 int col = a[0].length;
		 
		 int countOdd = 0;
		 int countEven = 0;
		 for(int i=0; i<row; i++) {
			 for(int j=0; j<col; j++) {
				 if(a[i][j] % 2 == 0) {
					 countEven++;
				 }
				 else {
					 countOdd++;
				 }
			 }
		 }
		 
		 System.out.println("Number of Even: " + countEven);
		 System.out.println("Number of Odd: " + countOdd);

	}

}
