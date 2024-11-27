package com.kodnest.stringConcept;

public class DemoP7 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("Hello Everyone how are you?");
		System.out.println(s1.capacity());
		s1.append("Today is very Special day");
		System.out.println(s1.capacity());
		System.out.println(s1);
		
         System.out.println("====================================");
         
		StringBuilder s2 = new StringBuilder();
		System.out.println(s2.capacity());
		s2.append("Hello Everyone how are you?");
		System.out.println(s2.capacity());
		s2.append("Today is very Special day");
		System.out.println(s2.capacity());
		System.out.println(s2);
		
		System.out.println("====================================");
		
		StringBuffer s3 = new StringBuffer();
		s3.ensureCapacity(100);
		System.out.println(s3.capacity());
		
		System.out.println("====================================");
		
		s1.delete(0, 5);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		

	}

}
