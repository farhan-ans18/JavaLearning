package com.Algorithm;
import java.util.*;
public class PracticeGenerics {
	public static void main(String[] args) {
		ArrayList ll = new ArrayList();
		ll.add(new Employee("Farhan", 22));
		ll.add(new Employee("Dheeraj", 23));
		ll.add(new Employee("Saurabh", 22));
		ll.add(new Employee("Bishwajeet", 22));
		System.out.println(ll);
		System.out.println(ll.getFirst());
	} 
		
}
