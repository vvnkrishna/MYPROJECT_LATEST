package JavaPackage;

public class Inheritance4 extends Inheritance3 {
	
	public void Multiplication(int x, int y) {
		
		z = x*y;
		
		System.out.println("Multiplication is : " + z);
	}
	
	public void alphabet(int x, int y) {
		
		z = x / y;
		System.out.println("Division : " + z);
		
	}
	

	public static void main(String[] args) {
		
		
		  int x = 20; int y = 12;
		 
		
		Inheritance4 i4 = new Inheritance4();
		
		i4.addition(10, 12);
		i4.substraction(40, 35);
		i4.Multiplication(x, y);
		i4.alphabet(x, y);
        
		
		
		
		
		
		
		
		
		

	}

}
