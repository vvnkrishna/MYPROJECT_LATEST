package JavaPackage;

public class Inheritance7 extends Inheritance6 {
	
	String course = "Selenium";
	
	public void listen() {
		
		System.out.println("I am listening");
	}

	public static void main(String[] args) {
		
		Inheritance7 i7 = new Inheritance7();
		
		i7.write();
		i7.read();
		i7.listen();
		System.out.println(i7.course);
		

	}

}
