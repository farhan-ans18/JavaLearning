package p2;

import p1.A;

public class C extends A{
  public static void main(String[] args) {
  C obj = new C();
  // obj.fun1(); private not allowed
  //obj.fun2(); default not allowed in different packages
  obj.fun3();
  obj.fun4();
  }
}
