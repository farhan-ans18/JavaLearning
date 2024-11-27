package com.Algorithm;

public class GenericApp {

	public static void main(String[] args) {
		DemoBox<String> d = new DemoBox<String>();
		d.setItems("Farhan");
		d.display();
		
		DemoBox<Integer> f = new DemoBox<Integer>();
		f.setItems(22);
		f.display();
		
		DemoBox<Employee> e = new DemoBox<Employee>();
		e.setItems(new Employee("Farhan", 22));
		e.display();
		
	}

}
