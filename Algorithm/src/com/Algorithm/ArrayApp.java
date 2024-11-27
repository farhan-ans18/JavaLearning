package com.Algorithm;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Array Implementation");
		System.out.println("Enter Array Size");
		ArrayImplementation arr = new ArrayImplementation(4);
		System.out.println();
		int size = arr.length();
		
		while(true) {
			try {
			System.out.println("Please choose an option");
			System.out.println("PRESS-1 for Insert");
			System.out.println("PRESS-2 for Delete");
			System.out.println("PRESS-3 for Display");
			System.out.println("PRESS-4 for Sort");
			System.out.println("PRESS-5 for Search");
			System.out.println("PRESS-Any number other than 1 t0 5 to Exit");
			System.out.println();
			
			int operations = Integer.parseInt(sc.next());
			
			switch(operations) {
			case 1:
				System.out.println("Enter index number valid from 0 to " + (size-1) + " and an element to insert in array");
				arr.insert(sc.nextInt(), sc.nextInt());
				System.out.println();
				break;
			
			case 2:
				System.out.println("Enter index number to delete the element");
				arr.delete(sc.nextInt());
				System.out.println();
				break;
				
			case 3:
				System.out.println("Array Elements are: ");
				arr.display();
				System.out.println();
			    break;
			    
			case 4:
				System.out.println("Elements got sorted");
				arr.sort();
				arr.display();
				System.out.println();
				break;
			
			case 5:
				System.out.println("Enter a value to search in Array");
				int res = arr.binarySearch(sc.nextInt());
				if(res >= 0) {
					System.out.println("Element found at " + res);
				}
				else {
					System.out.println("Element not found");
				}
				System.out.println();
				break;
				
				default :
				System.out.println("Thank You! Program Terminated");
				return;
			}
			}catch(Exception e) {
					System.out.println("Please Enter a valid number: ");
					sc.nextLine();
					System.out.println();
				}
			
		}
	}

}
