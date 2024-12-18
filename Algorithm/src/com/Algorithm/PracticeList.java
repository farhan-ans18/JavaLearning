package com.Algorithm;

import java.util.ArrayList;

public class PracticeList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		// add() method;
		
		al.add(55);
		al.add(87);
		al.add(98);
		al.add(106);
		al.add(78);
		
		System.out.println(al + " ");
		
		// al2
		
		al2.add(88);
		al2.add(70);
		al2.add(65);
		al2.add(110);
		al2.add(44);
		
		System.out.println(al2);
		
		// remove() method (remove element by accepting particular index)
		
		al.remove(3);
		System.out.println(al + " ");
		
	    // add(index, object); Adding element at particular index;
		al.add(1, 99);
		System.out.println(al + " ");
		
		// addAll(object) will add all elements of other arraylist inside another arraylist at last
		al.addAll(al2);
		
          System.out.println(al);
          
         // addAll(index, object) will add all elements of other arraylist inside another arraylist at particular index
		
		al2.addAll(3, al2);
		System.out.println(al2);
		
		// addFirst()
		al.addFirst(34);
		System.out.println(al);
		
		// removeAll()
		
		
		al.addFirst(al2);
		System.out.println(al);
		
		al.remove(al2);
		System.out.println(al);
		
		al.removeAll(al2);
		System.out.println(al);
		
		al.set(2, 100);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		
		System.out.println(al2.contains(110));
		
		
		
		
		
	}

}
