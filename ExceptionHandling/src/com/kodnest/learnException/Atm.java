package com.kodnest.learnException;

import java.util.Scanner;

public class Atm {
   void authentication() throws Exception {
	   try {
		   System.out.println("Connection to Database Esatblished");
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Etnter your userId and Password");
		   int userId = sc.nextInt();
		   int pass = sc.nextInt();
		   int res = userId/pass;
		   System.out.println("Authentication result is " + res);
	   }
	   finally {
	   System.out.println("Connection to Database Terminated");
	   }
   }
   
}
