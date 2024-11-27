interface Addition1 {
	void add();
}

interface Subtraction {
	void subtract(int a, int b);
}

interface Multiplication {
	int mul();
}

interface Divide {
	int div(int a, int b);
}

public class Lamda3 {

	public static void main(String[] args) {
		
     Addition1 sum = () -> System.out.println("Sum of two numner is " + (10+20));
     sum.add();
     
     Subtraction sub = (a,b) -> System.out.println("Differ of two number is " + (a-b));
     sub.subtract(20, 10);
     
     Multiplication multiply = () ->  10*20;
     System.out.println("Multiplication of two number is " + multiply.mul());
     
     Divide division = (a,b) -> a/b;
     System.out.println("Division of two numner is " + division.div(20, 10));
	}

}
