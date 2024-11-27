package singleton;

class Principal {
	private static Principal p;
	
	private Principal() {
		System.out.println("New principal is appointed");
	}
	
	public static Principal setInstance() {
		if(p==null) {
		 p = new Principal();
		}
		return p;
	}
}
public class PrincipalApp {

	public static void main(String[] args) {
		
//	Principal p = new Principal(); we can't directly create the object
		
		Principal p2 = Principal.setInstance();
		Principal p1 = Principal.setInstance();

	}

}
