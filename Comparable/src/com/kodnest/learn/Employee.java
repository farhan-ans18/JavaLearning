package com.kodnest.learn;

public class Employee  {
	   String name;
	   String department;
	   int salary;
	   
	   public Employee(String name, String department,int salary) {
		   this.name = name;
		   this.department = department;
		   this.salary = salary;
	   }


	public String toString() {
		return "Name: " + name + " Department: " + department + " Salary " + salary + "||";
	}
	   
	}
