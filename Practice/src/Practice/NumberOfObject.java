package Practice;

class Fruits {
	
	static int count = 0;
	
	Fruits() {
	  count++;
		}
       
	}
	
	
	
}
public class NumberOfObject {

	public static void main(String[] args) {
		
    Fruits banana = new Fruits();
    Fruits kivi = new Fruits();
    
    System.out.println(Fruits.count);
 
    
	}

}
