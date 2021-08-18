package JavaPackage;

public class NestedIf {

	public static void main(String[] args) {

		int age = 25;
		int weight = 50;

		// Outer block
		if (age > 18) {

			// inner block

			if (weight > 50) {

				System.out.println("Eligible for blood donation");

			}

			else {
				System.out.println("Not Eligible");
			}
		}

		else {
			System.out.println("Must be greater than 18 years");
		}
	}

	
	
}
