package InterviewDemo;

public class StarString3 {

	public static void main(String[] args) {

		for (int a = 1; a <= 4; a++) {

			for (int b = 3; b >= a; b--) {

				System.out.print(" ");

			}

			for (int c = 1; c <= a; c++) {

				System.out.print("*");
			}

			System.out.println();

		}

		for (int i = 1; i <= 3; i++) {
			
			
			for (int k = 1; k <= i; k++) {

				System.out.print(" ");
			}

			for (int j = 3; j >= i; j--) {

				System.out.print("*");

			}
			System.out.println();

			

		}

	//	    *
	//	   **
	//	  ***
	//	 ****
	//	  ***
	//	   **
	//	    *
		
	}

}
