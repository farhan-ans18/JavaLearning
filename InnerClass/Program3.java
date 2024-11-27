class Outer1 {
	static int x = 100;
	public static void fun1() {
		System.out.println("outer static method");
	}
	
	class Inner1 {
		public static void fun2() {
			System.out.println("Outer static x = " + x);
			fun1();
		}
	}
}
public class Program3 {

	public static void main(String[] args) {
		Outer1.Inner1.fun2();
	}

}
