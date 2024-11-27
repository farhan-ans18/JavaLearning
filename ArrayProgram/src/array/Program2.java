package array;

import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] tech = new String[n];
		sc.nextLine();
		
		System.out.println("Enter the Eelments");
		
		for(int i=0; i<tech.length; i++) {
			System.out.println("Enter the array for index " + i);
			tech[i] = sc.nextLine();
		}
//       for(String el : tech) {
//    	   System.out.println(el);
//       }
		Arrays.stream(tech).forEach(System.out::println);
	}

}
