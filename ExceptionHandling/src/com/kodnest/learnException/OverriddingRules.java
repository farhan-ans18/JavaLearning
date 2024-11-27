package com.kodnest.learnException;



class Demo1 {
	 void display(){
		System.out.println("This is Demo's displays");
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
}



class Demo2 {
	void display1() {
		System.out.println("This is Demo1's displays");
		Demo1 d = new Demo1();
		d.display();
	}
}

class Demo3 {
	void display2() {
		System.out.println("This is Demo2's displays");
		Demo2 d1 = new Demo2();
		d1.display1();
	}
}
public class OverriddingRules {
	
 public static void main(String[] args) {
	 try {
	System.out.println("This is Overriding's display");
	Demo3 d2 = new Demo3();
	d2.display2();
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
}
}
