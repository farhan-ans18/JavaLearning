package com.Algorithm;

public class Employee {

	String name ;
	int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name : " + name + ", Age : " + age;
	}
}
