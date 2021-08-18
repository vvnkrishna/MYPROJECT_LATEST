package JavaPackage;

public class MethodOverload2 extends MethodOverload1 {
	
	public void sum(int a,int b,int c,int d) {
		
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {
		
		MethodOverload2 mo2 = new MethodOverload2();
		
		mo2.sum(20, 40);
		mo2.sum(40, 70, 40);
		mo2.sum(10, 10, 10, 10);
		
		
		

	}

}
