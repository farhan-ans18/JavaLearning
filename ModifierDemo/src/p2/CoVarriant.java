package p2;

public class CoVarriant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	}

}

class Fresher {
	void prepare() {
		System.out.println("Fresher class method");
	}
}

class kodnestFresher extends Fresher {
	void prepare() {
		System.out.println("KodnestFresher class method");
	}
}

class Edtech {
	Fresher trainFresher() {
		System.out.println("Edtech class method");
		Fresher f = new Fresher();
		return f;
	}
}

class Kodnest extends Edtech {
   Fresher trainFresher() {
	   System.out.println("Kodnest class method");
	   Fresher kf = new Fresher();
	   return kf;
   }
}

