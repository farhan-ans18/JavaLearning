package p2;

import p1.Calculator;

public class Addition {

	public static void main(String[] args) {
		
		// accessing calculator in different package
		
		int sum = Calculator.add(10, 5);
		System.out.println("Sum = " + sum);

	}

}
