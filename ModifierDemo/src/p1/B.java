package p1;

public class B {
  public static void main(String[] args) {
	  A obj = new A();
	  //obj.fun1(); private declared method visibility is only within the same class
	  obj.fun2(); // default declared method visibility is within the same class or different class of same package
	  obj.fun3(); //protected declared method visibility is within the same class, same package, different class of same package and sub-class of different packages
	  obj.fun4(); // public declared method visibility is everywhere
	  
  }
}
