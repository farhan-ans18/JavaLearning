package com.kodnest.learning;

public class Student {
   int usn;
   String name;
   int age;
   
   public Student(int usn, String name, int age) {
	   this.usn = usn;
	   this.name = name;
	   this.age = age;
   }
   
   public String toString() {
	   return usn + " " + name + " " + age;
   }
}
