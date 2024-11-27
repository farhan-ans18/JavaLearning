package com.Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class ComparablePractice {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(56);
		list.add(75);
		list.add(45);
		list.add(89);
		list.add(23);
		list.add(66);
		
		System.out.println("Before Soting: " + list);
		
		Collections.sort(list);
		
		System.out.println("After Soting: " + list);
		

	}

}
