package p2;

public class Main {

	public static void main(String[] args) {
		Child c = new Child();
		c.fun();

	}
}
	
abstract class Parent {
		abstract void fun();
	}
 class Child extends Parent {
	 protected void fun() {
			System.out.println("Child fun");
		}
 }

 interface A {
	 void fun(); // by default public modifier
 }

 class Test implements A {
	  public void fun() {
		 
	 }
 }