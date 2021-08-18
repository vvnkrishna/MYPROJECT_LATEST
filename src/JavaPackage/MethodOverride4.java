package JavaPackage;

public class MethodOverride4 extends MethodOverride3 {

	public void run() {

		System.out.println("Ram is running");
	}

	public static void main(String[] args) {
		
		MethodOverride4 mo4 = new MethodOverride4();
		mo4.run();
		
		MethodOverride3 mo3 = new MethodOverride3();
		mo3.run();
		
		MethodOverride2 mo2 = new MethodOverride2();
		mo2.eat();
		
		
		MethodOverride1 mo1 = new MethodOverride1();
		mo1.eat();
		
		MethodOverload2 mol2 = new MethodOverload2();
		mol2.sum(20, 40, 50, 60);
		

	}

}
