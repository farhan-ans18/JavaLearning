package encapuslation;

class Student {
	private int rollNo;
	private String name;
	private String branch;
	
     public void setRollNo(int rollNo) {
    	 this.rollNo = rollNo;
     }
     
     public int getRollNo() {
    	 return rollNo;
     }
     
     public void setName(String name) {
    	 this.name = name;
     }
     public String getName() {
    	 return name;
     }
     
     public void setBranch(String branch) {
    	 this.branch = branch;
     }
     public String getBranch() {
    	 return branch;
     }
	
}
public class Program1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setRollNo(1);
		s1.setName("Farhan");
		s1.setBranch("CSE");
		
		int roll = s1.getRollNo();
		String name = s1.getName();
		String branch = s1.getBranch();
		
		System.out.println(roll);
		System.out.println(name);
		System.out.println(branch);
		

	}

}


