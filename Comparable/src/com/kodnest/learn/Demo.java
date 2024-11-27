package com.kodnest.learn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayDeque<Integer> numbers = new ArrayDeque<>();
		numbers.add(100);
		numbers.add(50);
		numbers.add(150);
		numbers.add(25);
		numbers.add(75);
		numbers.add(125);
		numbers.add(175);
		
		System.out.println("Before Sorting: " + numbers);
		
		ArrayList<Integer> list = new ArrayList<>(numbers);
		
		Collections.sort(list);
		
		System.out.println("After Sorting: " + list);
	}

}
