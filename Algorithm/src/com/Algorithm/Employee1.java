package com.Algorithm;

public class Employee1 implements Comparable<Employee1> {
   String name;
   String department;
   int salary;
   
   public Employee1(String name, String department,int salary) {
	   this.name = name;
	   this.department = department;
	   this.salary = salary;
   }

@Override
public int compareTo(Employee1 o) {
	   if(this.name.compareTo(o.name)>0) {
		   return 1;
	   }
	   else {
		   return -1;
	   }
 }

public String toString() {
	return "Name: " + name + " Department: " + department + " Salary " + salary + "||";
}
   
}
