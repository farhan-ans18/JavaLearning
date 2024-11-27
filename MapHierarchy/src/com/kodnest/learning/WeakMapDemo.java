package com.kodnest.learning;

import java.util.WeakHashMap;

public class WeakMapDemo {

	public static void main(String[] args) {
		Student s1 = new Student(121, "Farhan", 22);
		Student s2 = new Student(122, "Dheeraj", 24);
		
		Keys key1 = new Keys(100);
		Keys key2 = new Keys(200);
		
		WeakHashMap weak = new WeakHashMap();
		
		weak.put(key1, s1);
		weak.put(key2, s2);
		
		System.out.println(weak);
		
		key1 = null;
		System.gc();
		
		for(int i=0; i<=500; i++) {
			if(i==500) {
				System.out.println();
				System.out.println("Done");
			}
		}
		
		System.out.println();
		System.out.println(weak);
		
		

	}

}
