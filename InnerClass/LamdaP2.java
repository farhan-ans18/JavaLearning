interface Greeting {
	String greet(String name);
}
public class LamdaP2 {

	public static void main(String[] args) {
		
		// Accessing through Anonymous class
		
		Greeting  greeting = new Greeting() {
			public String greet(String name) {
				return "Name = " + name;			
				}
		};
		
		System.out.println(greeting.greet("farhan"));
		
		// Accessing through lambda expression
		
		Greeting greeting2 = (String name) -> "Name = " + name; // return name;
        System.out.println(greeting2.greet("farhan"));
	}

}
