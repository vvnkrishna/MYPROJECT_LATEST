package JavaPackage;

public class Variable8 {

	int a = 5; // non static class variable//

	static int b = 10; // static class variable//

	public static void main(String[] args) {

		Variable8 v8 = new Variable8();

		System.out.println(v8.a);
		System.out.println(Variable8.b);

		v8.a();
		v8.b();
	}

	public void a() {

		String s = "Hello Krishna";

		System.out.println(s);

	}
	
	public void b() {	
		
		String h = "Krishna Unemployee";
		
		System.out.println(h);
		
		
	}
	}
	
	

