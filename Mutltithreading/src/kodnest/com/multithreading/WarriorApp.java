package kodnest.com.multithreading;

public class WarriorApp {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		
		Thread t1 = new Thread(warrior);
		Thread t2 = new Thread(warrior);
		
		t1.setName("Arjun");
		t2.setName("Karan");
		
		t1.start();
		t2.start();
		
	}

}
