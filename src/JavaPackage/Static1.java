package JavaPackage;

public class Static1 {

  static int z = 5;

	public static void main(String[] args) {
		

		Static1 s1 = new Static1();
		s1.b();

		Static1 s2 = new Static1();
		s2.c();
		
		a();
		
	}

	public static void a() {

		z = 10;
		System.out.println("a method called : " + z);
	}

	public void b() {

		
		z = 15;

		 System.out.println("b method called : " + z); 

	}

	public void c() {

		z = 20;
		System.out.println("c method called : " + z);
          a();
	}

}
