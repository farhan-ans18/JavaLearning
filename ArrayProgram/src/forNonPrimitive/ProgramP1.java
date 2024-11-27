package forNonPrimitive;

import java.util.Scanner;

class Employee{
	String name;
	int ssn;
	String gender;
	int salary;
	
	Employee(String name, int ssn, String gender, int salary){
		this.name = name;
		this.ssn = ssn;
		this.gender = gender;
		this.salary = salary;
	}
	void work() {
		System.out.println("Employee is working");
	}
}
public class ProgramP1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee []arr = new Employee[2];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter name, ssn, gender, salary for: " + i);
			arr[i] = new Employee(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].name + " " + arr[i].ssn + " " + arr[i].gender + " " + arr[i].salary);
		}

	}

}
