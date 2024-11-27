package Practice;

class InstanceBlock {
     
	static int x = 10;
	static int y;
	
	//Instance 
	int a = 10;
	int b;
	
	// static block 
	static {
		System.out.println("Static block called");
	}
	
	//instance block 
	{
		System.out.println("Instance block called");
	}
	
	// static method 
	public static void fun1() {
		System.out.println("Static method fun1 called");
	}
	
//	Non- static method
	public void fun2() {
		System.out.println("Non-static method fun2 called");
	}
	
//	constructor with no parameter
	
	public InstanceBlock() {
		System.out.println("constructor with no parameter called");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main method started");
      InstanceBlock b = new InstanceBlock();
      fun1();
      b.fun2();
      
      System.out.println("x = " + x + " y= " +y);
      System.out.println("a = " + b.a + " b= " + b.b);
	}

}
