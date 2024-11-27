package com.kodnest.learnException;

public class Bank {
 void initiateAtm() {
	 System.out.println("connection to Bank Established");
	 try {
	 Atm atm = new Atm();
	 atm.authentication();
	 }
	 catch(Exception e) {
		 System.out.println("Issued Reach in Bank and Resolved in Bank");
	 }
	 System.out.println("connection to Bank terminated");
 }
}
