package Practice;

import java.util.Scanner;

public class ProgramMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		
//	    for(int i=0; i<n; i++) {
//	    	int input = sc.nextInt();
//	    	if(input < min) {
//	    		min = input;
//	    	}
//	    }
	    
		while(n>0) {
			int input = sc.nextInt();
			if(input < min) {
				min = input;
			}
			n--;
		}
	    System.out.println("Minimum is : " + min);
	    
	    

	}

}
