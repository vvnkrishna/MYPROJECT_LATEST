package InterviewDemo;

public class StarString5 {

	public static void main(String[] args) {
		
		for(int a = 1; a <= 4 ; a++) {
			
			for(int b = 3; b >= a; b--) {
				
				System.out.print(" ");
				
			}
			
			for(int c = 1; c <= a; c++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
	//	    *
	//	   * *
	//	  * * *
	//	 * * * *

		
	}

}
