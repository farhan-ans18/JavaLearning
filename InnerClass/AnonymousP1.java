interface Greeter {
	void greet();
	void greet2();
}

public class AnonymousP1 {

	public static void main(String[] args) {
		Greeter englishGreet = new Greeter() {
			public void greet() {
				System.out.println("Hello Everyone");
			}
			public void greet2() {
				System.out.println("I am anonymous class");
			}
		};
		
		englishGreet.greet();
		englishGreet.greet2();

	}

}
