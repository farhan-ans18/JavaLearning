package kodnest.com.multithreading;

public class Warrior implements Runnable {
   String astra1 = "Sarpastra";
   String astra2 = "Bharmastra";
   String astra3 = "Parshupastra";
@Override
public void run() {
	String name = Thread.currentThread().getName();
	if(name.equals("Arjun")) {
		arjunaAcquiredAstra();
	}else {
		karnaAcquiredAstra();
	}
	
}

public void arjunaAcquiredAstra() {
	try {
		Thread.sleep(5000);
		synchronized (astra1) {
			System.out.println(Thread.currentThread().getName() + " Has acquired Resource-1 " + astra1);
			Thread.sleep(5000);
			synchronized (astra2) {
				System.out.println(Thread.currentThread().getName() + " Has acquired Resource-2 " + astra2);
				Thread.sleep(5000);
				synchronized (astra3) {
					System.out.println(Thread.currentThread().getName() + " Has acquired Resource-3 " + astra3);
					Thread.sleep(5000);
				}
			}
		}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}

public void karnaAcquiredAstra() {
	try {
		Thread.sleep(5000);
		synchronized (astra3) {
			System.out.println(Thread.currentThread().getName() + " Has acquired Resource-1 " + astra3);
			Thread.sleep(5000);
			synchronized (astra2) {
				System.out.println(Thread.currentThread().getName() + " Has acquired Resource-2 " + astra2);
				Thread.sleep(5000);
				synchronized (astra1) {
					System.out.println(Thread.currentThread().getName() + " Has acquired Resource-3 " + astra1);
					Thread.sleep(5000);
				}
			}
		}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}
   
}
