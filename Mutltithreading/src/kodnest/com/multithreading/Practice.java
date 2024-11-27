package kodnest.com.multithreading;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Farhan");
		t.setPriority(1);
		System.out.println(t);

	}

}
