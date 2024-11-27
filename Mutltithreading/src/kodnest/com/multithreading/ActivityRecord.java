package kodnest.com.multithreading;

public class ActivityRecord {

	public static void main(String[] args) {
		Thread t1 = new Activities();
		Thread t2 = new Activities();
		Thread t3 = new Activities();
		
       t1.setName("login");
       t2.setName("print");
       t3.setName("mul");
       
       t1.start();
       t2.start();
       t3.start();
       

	}

}
