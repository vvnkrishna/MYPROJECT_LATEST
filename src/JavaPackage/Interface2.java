package JavaPackage;

public class Interface2 implements Interface1 {
	
	public void a() {
		
		System.out.println("Hello Interface");
			}
	
	
	public void b() {
		
		System.out.println("Hello selenium");
	}

	public static void main(String[] args) {
		
		Interface2 if2 = new Interface2();
		if2.a();
		if2.b();
		

	}

}
