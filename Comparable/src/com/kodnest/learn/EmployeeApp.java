package com.kodnest.learn;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {
			ArrayList list = new ArrayList();
			
			list.add(new Employee("Farhan", "Developer", 200000));
			list.add(new Employee("Dheeraj", "Administrator", 100000));
			list.add(new Employee("Saurabh", "Testing", 250000));
			list.add(new Employee("Bishwajeet", "Developer", 200500));
			list.add(new Employee("Rashid", "Developer", 206000));
			list.add(new Employee("Deepak", "Testing", 207000));
			
			System.out.println(list);
	}

}
