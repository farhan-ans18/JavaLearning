package com.kodnest.learnException;

import java.util.Scanner;

public class Demo {
  public static void  main (String args[]) {
	  System.out.println("Connection Established");
	  Scanner sc = new Scanner(System.in);
	  try {
		  System.out.println("Enter two number for division");
		  int num1 = sc.nextInt();
		  int num2 = sc.nextInt();
		  int quotient = num1/num2;
		  System.out.println("Quotient : " + quotient);
	  }
	  catch(ArithmeticException e) {
		  System.out.println("Cannot divide by zero");
	  }
	  catch(Exception e) {
		  System.out.println("Some others error occurred");
	  }
	  System.out.println("Enter the size of array");
	  int[] arr = null;
	  try {
//		  System.out.println("Enter the size of array");
		   arr = new int[sc.nextInt()];
	  } catch(NegativeArraySizeException e) {
		  System.out.println("Array Size can't be in negative! Please give a valid postive size");
	  }
	  catch(Exception e) {
		  System.out.println("Some others error occurred");
	  }
	  
	  try {
		  System.out.println("Enter the element to insert with position");
		  int element = sc.nextInt();
		  int pos = sc.nextInt();
		  arr[pos] = element;
		  System.out.println(element + " Element inserted at position " + pos);
		  System.out.println("The element is " + arr[pos]);		  
	  }
	  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("Please enter position less than or equals to size of array! The given size of array is " + arr.length);
	  }
	  catch(Exception e) {
		  System.out.println("Some others error occurred");
	  }
	  
	  System.out.println("Connection terminated");
	  
	  sc.close();
  }
}
