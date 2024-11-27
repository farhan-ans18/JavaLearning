package com.kodnest.stringConcept;

public class DemoP1 {

	public static void main(String[] args) {
		String s1 = "Farhan";
		String s2 = "Farhan";
		
		if(s1==s2) {
			System.out.println("References are equal, refering to the same address");
		}
		else {
			System.out.println("References are not equal, refering to the different address");
		}
		
		if(s1.equals(s2)) {
			System.out.println("values are same");
		}
		else {
			System.out.println("values are not same");
		}

	}

}
