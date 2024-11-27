package com.Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Employee1App {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Employee1("Farhan", "Developer", 200000));
		list.add(new Employee1("Dheeraj", "Administrator", 100000));
		list.add(new Employee1("Saurabh", "Testing", 250000));
		list.add(new Employee1("Bishwajeet", "Developer", 200500));
		list.add(new Employee1("Rashid", "Developer", 206000));
		list.add(new Employee1("Deepak", "Testing", 207000));
		
		System.out.println(list);
		
		Collections.sort(list);
		 
		System.out.println(list);
		
	}

}
