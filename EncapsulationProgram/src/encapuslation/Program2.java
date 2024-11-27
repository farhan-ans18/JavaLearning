package encapuslation;

import java.util.Scanner;

class BankAccount {
	private int accNum;
	private String accHolder;
	private double balance;
	private int pin;
	
	public void setAccNum(int accNum,int pin) {
		if(pin == this.pin) {
		this.accNum = accNum;
		}
		else {
			System.out.println("Wrong Pin Entered!");
		}
	}
	public int getAccNum(int pin) {
		if(pin==this.pin) {
		return accNum;
		}
		else {
			System.out.println("Wrong pin Entered!");
			return 0;
		}
	}
	
	public void setAccHolder(String accHolder, int pin) {
		if(pin==this.pin) {
		this.accHolder = accHolder;
		} else {
			System.out.println("Wrong Pin Entered!");
		}
	}
	public String getAccHolder(int pin) {
		if(pin==this.pin) {
		return accHolder;
		}
		else {
			System.out.println("Wrong pin Entered!");
			return "";
		}
		
		
	}
	
	public void setBalance(double balance, int pin) {
		if(pin==this.pin) {
		this.balance = balance;
		}
		else {
			System.out.println("Wrong pin Entered!");
		}
	}
	public double getBalance(int pin) {
		if(pin==this.pin) {
		return balance;
		}
		else {
			System.out.println("Wrong pin Entered!");
			return 0;
		}
	}
}
public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount saving = new BankAccount();
		
		System.out.println("Enter you Account number: ");
		int accNum = sc.nextInt();
		
		System.out.println("Enter you Acount Name:");
		sc.nextLine();
		String accHolder = sc.nextLine();
		
	    System.out.println("Enter your balance");
	    double balance = sc.nextDouble();
	    
	    System.out.println("Enter your Pin");
	    int pin = sc.nextInt();
	    
		
		saving.setAccNum(accNum, pin);
		saving.setAccHolder(accHolder, pin);
		saving.setBalance(balance, pin);
		
		System.out.println("Account Number: " + saving.getAccNum(pin));
		System.out.println("Account Holder: " + saving.getAccHolder(pin));
		System.out.println("Account Balance: " + saving.getBalance(pin));
		
		

	}

}
