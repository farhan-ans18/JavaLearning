package kodnest.com.multithreading;

public class Bathroom implements Runnable{
  synchronized public void run() {
	  try {
	  String name = Thread.currentThread().getName();
	  System.out.println(name + " is entering in the bathroom");
	  Thread.sleep(5000);
	  System.out.println(name + " is using the bathroom");
	  Thread.sleep(5000);
	  System.out.println(name + " is existing the bathroom");
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
