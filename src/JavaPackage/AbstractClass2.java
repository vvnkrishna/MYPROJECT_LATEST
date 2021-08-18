package JavaPackage;

public class AbstractClass2 extends AbstractClass1 {

	


	void method() {
		
		System.out.println("This is abstract implementation");
	
	}
	
	
	public static void main(String[] args) {
		
		AbstractClass1 ac1 = new AbstractClass2();
		ac1.method();
		
	
	}
}

