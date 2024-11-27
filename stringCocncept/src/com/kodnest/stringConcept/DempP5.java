package com.kodnest.stringConcept;

public class DempP5 {

	public static void main(String[] args) {
		String str = new String("Kodnest");
		String str1 = str.intern();
		String str2 = "Kodnest";
		
		if(str1==str2) {
			System.out.println("references are equal");
		}
		else {
			System.out.println("references are not equal");
		}
      System.out.println("=========================================");
      
      String s1 = "Sourav";
      String s2 = "Sachin";
      
      if(s1.compareTo(s2)>0) {
    	  System.out.println("String " + s1 + " is greater");
      }
      else if(s1.compareTo(s2)<0) {
    	  System.out.println("String " + s2 + " is greater");
      }
      else {
    	  System.out.println("String " + s1 + " and " + s2 + "both are equal");
      }
      
      System.out.println("=========================================");
      
      String s4 = "Java Python SQL HTML CSS Javascript Reactjs";
      String arr[] = s4.split(" ");
      for(String x : arr) {
    	  System.out.println(x);
      }
    	
      System.out.println("=========================================");
      
      String s5 = "Farhan";
      char ch[] = s5.toCharArray();
      for(char x : ch ) {
    	  System.out.println(x);
      }
	}

}
