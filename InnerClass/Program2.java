class Outer {
	int x = 100;
	void fun1() {
		System.out.println("Outer class");
	}
	
	class Inner {
		void fun2() {
			System.out.println("Inner class");
			System.out.println("outer class x value = " + x);
			fun1();
		}
	}
}
public class Program2 {

	public static void main(String[] args) {
		Outer outerObj = new Outer();
		Outer.Inner innerObj = outerObj.new Inner();
		innerObj.fun2();
	}

}
