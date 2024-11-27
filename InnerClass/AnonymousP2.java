interface Teacher { // functional Interface
	void teach();
}
public class AnonymousP2 {

	public static void main(String[] args) {
		// Through Anonymous class
		Teacher teacher = new Teacher() {
			public void teach() {
				System.out.println("Teacher teaching java");
			}
		};
		
		teacher.teach();
		
		// Through lambda expression
		
		Teacher teacher2 = () -> System.out.println("Teacher teaching Sql");
         teacher2.teach();
	}
}



//abstract class Electronics {
//	public abstract void charge();
//}
//public class AnonymousP2 {
//
//	public static void main(String[] args) {
//		Electronics mobile = new Electronics() {
//			public void charge() {
//				System.out.println("Mobile need Charging");
//			}
//		};
//		
//		mobile.charge();
//		
//
//	}
//
//}
