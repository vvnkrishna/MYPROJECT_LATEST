package JavaPackage;

public class MethodOverload4 extends MethodOverload3 {

	static int add(int a, int b, int c, int d) {
		
		System.out.println(a + b + c +d);

		return d;

	}

	public static void main(String[] args) {
		
		//here we dont need to create object we can call directly with class name because static keyword is used

		System.out.println(MethodOverload3.add(20, 40));
		System.out.println(MethodOverload3.add(20, 75, 100));
		System.out.println(add(10, 20, 30, 40));

	}

}
