package JavaPackage;

public class MethodOverride7 {

	public static void main(String[] args) {
		
		MethodOverride5 mo5 = new MethodOverride6();
		mo5.cook();
		mo5.eat();//eat() method is not present in MethodOverride6 thats why it is call from MethodOverride5
		
	
		MethodOverride6 mo6 = new MethodOverride6();
		mo6.angry();
	}

}
