package JavaPackage;

public class MethodOverride10 {

	public static void main(String[] args) {
		
		MethodOverride9 mo9 = new MethodOverride9();
		mo9.m1();//
		mo9.m2();
		mo9.m3();
		mo9.m3("abc");
		mo9.m3(10.3f, 20);
		
		MethodOverride8 mo8 = new MethodOverride8();
		mo8.m1();
		mo8.m3();
		

	}

}
