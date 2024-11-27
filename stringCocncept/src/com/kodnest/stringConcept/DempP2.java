package com.kodnest.stringConcept;

public class DempP2 {

	public static void main(String[] args) {
		String s1 = "Farhan";
		String str1 = new String("Farhan");
		String str2 = new String("FARHAN");
		String s3 = s1 + str1;
		String s4 = s1 + str1;
		
		String s5 = "Farhan" + "Ansari";
		String s6 = "Farhan" + "Ansari";
		
		if(str1==str2) {
			System.out.println("References are equal, refering to the same address");
		}
		else {
			System.out.println("References are not equal, refering to the different address");
		}
		
		if(str1.equals(str2)) {
			System.out.println("values are same");
		}
		else {
			System.out.println("values are not same");
		}
		
		if(s1==str1) {
			System.out.println("References are equal, refering to the same address");
		}
		else {
			System.out.println("References are not equal, refering to the different address");
		}
		
		if(str1.equals(str2)) {
			System.out.println("values are same");
		}
		else {
			System.out.println("values are not same");
		}
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("values are same");
		}
		else {
			System.out.println("values are not same");
		}
		
		
		if(s3==s4) {
			System.out.println("References are equal, refering to the same address");
		}
		else {
			System.out.println("References are not equal, refering to the different address");
		}
		
		if(s3.equals(s4)) {
			System.out.println("values are same");
		}
		else {
			System.out.println("values are not same");
		}

		if(s5==s6) {
			System.out.println("References are equal, refering to the same address");
		}
		else {
			System.out.println("References are not equal, refering to the different address");
		}
		
		if(s5.equals(s6)) {
			System.out.println("values are same");
		}
		else {
			System.out.println("values are not same");
		}


	}

}
