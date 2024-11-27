class Outer2 {
	static int x = 100;
	int y = 200;
	
	public static void fun1() {
		System.out.println("Outer static method");
	}
	
	public void fun2() {
		System.out.println("Outer non-static method");
	}
	
	static class Inner{
		public void fun() {
			// accessing static components (directly)
			System.out.println("Outer static x = " + x);
            fun1();
            
            // accessing non-static method (through object)
            
            Outer2 outerObj = new Outer2();
            System.out.println("Outer non-static y = " + outerObj.y);
            outerObj.fun2();
			
		}
	}
}
public class Program4 {

	public static void main(String[] args) {
		Outer2.Inner inner = new Outer2.Inner();
		inner.fun();

	}

}
