package Practice;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("main() executing..");
		Main2 m = new Main2();
		
	}
	
	// constructor 
	public Main2() {
		System.out.println("Main2 Constructor");
	}
	
	// instance block is called after the object is created but before the constructor is called....
	
	{
		System.out.println("Instance block");
	}

}
