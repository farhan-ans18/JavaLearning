package kodnest.com.multithreading;

public class BathroomApp {

	public static void main(String[] args) {
		try {
		Bathroom bathroom = new Bathroom();
		Thread t1 = new Thread(bathroom);
		Thread t2 = new Thread(bathroom);
		Thread t3 = new Thread(bathroom);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Other");
		
		t1.start();
		t2.start();
		t3.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
