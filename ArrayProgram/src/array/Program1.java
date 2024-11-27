package array;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] marks = new int[n];
		System.out.println("Enter the elements");
		
		for(int i = 0; i<marks.length; i++) {
			if(i==2 || i==3 || i==4) {
				marks[i] = sc.nextInt();
			}
		}
		
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
	}

}
