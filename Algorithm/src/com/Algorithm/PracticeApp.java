package com.Algorithm;

import java.util.*;

public class PracticeApp {

	public static void main(String[] args) {
		ArrayList ll = new ArrayList();
		
		ll.add(23);
		ll.add(24);
		ll.add(25);
		ll.add(26);
		
		System.out.println(ll);
		
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		
		System.out.println();
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		 System.out.println();
		for(Object el : ll) {
			System.out.print(el + " ");
		}
	}

}
