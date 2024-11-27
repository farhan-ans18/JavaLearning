package com.kodnest.learnException;

public class BankApp {

	public static void main(String[] args) {
	System.out.println("Main connection Established");
	Bank bank = new Bank();
	bank.initiateAtm();
	System.out.println("Main Connection Terminated");
	}

}
