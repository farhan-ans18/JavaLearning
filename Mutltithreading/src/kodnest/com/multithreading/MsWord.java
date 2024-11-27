package kodnest.com.multithreading;

public class MsWord implements Runnable{
   public void  run() {
	   String name = Thread.currentThread().getName();
	   if(name.equals("type")) {
		   type();
	   }
	   else if(name.equals("spell")) {
		   spellCheck();
	   }
	   else {
		   autoSave();
	   }
	   
   }
   
   public void type() {
	   try {
		   for(int i=0; i<5; i++) {
			   System.out.println("TYPING....");
			   Thread.sleep(5000);
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   public void spellCheck() {
	   try {
		   for(;;) {
			   System.out.println("SPELL CHECKING....");
			   Thread.sleep(5000);
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   public void autoSave() {
	   try {
		   for(;;) {
			   System.out.println("AUTO SAVING....");
			   Thread.sleep(5000);
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
}
