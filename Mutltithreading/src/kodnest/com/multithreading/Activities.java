package kodnest.com.multithreading;

import java.util.Scanner;

public class Activities extends Thread {
	
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("login")) {
			login();
		}
		else if(name.equals("print")) {
			printing();
		}
		else {
			multiplication();
		}
	}
  
	public void login() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Login to website Activity");
			System.out.println("Enter your username and password");
			String userName = sc.nextLine();
			String password = sc.nextLine();
			
			System.out.println("Welcome........ You Login Successfully");
			System.out.println("Login to website Activity");
	}
	
	public void printing() {
		try {
		System.out.println("Printing Activity Started");
		for(int i=0; i<5; i++) {
			System.out.println("Welcome to Kodnest");
			Thread.sleep(5000);
			}
		System.out.println("Printing Activity Ended");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void multiplication() {
		try {
		System.out.println("Mutiplication Activity");
		int a = 100;
		int b = 3;
		Thread.sleep(5000);
		int mul = a* b;
		System.out.println("Multiplication of " + a + " " + b + " " + mul);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
