package com.step2gen.practice;

public class CountPunctuation {

	public static void main(String[] args) {
	    String str = "This is a really simple sentence";   
	    int countV = 0;
	    int countC = 0;
	    
	    for(char c: str.toCharArray()) {
	    	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	    		countV++;
	    	}
	    	else if((c >= 'a' && c <='z')||(c >= 'A' && c <='Z')) {
	    		countC++;
	    	}
	    	
	    }
	    System.out.println(countV);
	    System.out.println(countC);
	}

}
