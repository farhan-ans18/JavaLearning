interface Addition {
	void add(int a, int b);
}
public class LambdP1 {

	public static void main(String[] args) {
		
		Addition sum = (int a, int b) -> System.out.println("Sum of two numbers: " + (a+b));
		sum.add(10, 20);

	}

}
