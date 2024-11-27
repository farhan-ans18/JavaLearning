class Outer3 {
	void fun1() {
		System.out.println("Outer class method");
		class Inner {
			void fun2() {
				System.out.println("Inner calss method");
			}
		}
			
			Inner inner = new Inner();
			inner.fun2();
		}
	}

public class Program5 {

	public static void main(String[] args) {
		Outer3 outerObj = new Outer3();
		outerObj.fun1();
	}

}
