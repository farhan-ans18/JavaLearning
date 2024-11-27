package com.kodnest.learning.straightForward;

import java.util.*;


public class Demo {

	public static void main(String[] args) {
		ArrayDeque ll = new ArrayDeque ();
		ll.add(45);
		ll.add(55);
		ll.add(45);
		ll.add(88);
		
		Iterator itr = ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
