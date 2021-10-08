package JavaPackage;

public class IsValidNumber {

	public static boolean iscorrectCellNumber(String number) {
		 if(number.matches("[0-9]{10}")) {
		
		 System.out.println("Valid number: " + number);
		 return true;
		 }
		 
		 return false;}
		 
		 
		 
		 // 1st method condition i.e given string must be 0 to 9 and size must be 10
											// only

	

	public static boolean iscorrectMobNumber(String number) {
		if( number.matches("\\d{10}")) {
		 return true;
		 }
		 return false;
		 } 
	// 2nd method condition i.e given string must
	
// be digit and size must be 10 only

	public static boolean isCorrectNummber(String number) {
		if (number.matches("^-\\d*\\.?\\d+$")) {
			return false;
		}

		return true;
	}

	public static boolean isCorrectphnumber(String number) {

		if (number.length() == 10 && isCorrectNummber(number)) {
			
			return true;// System.out.println("Valid NUmber : " + number);// 3rd method Here we combine
			            // the number must be 10digit
			            // number as well
			            // as the number
			            // neither negative nor decimal value.
		}
		System.out.println("Not a Valid number : " + number);
		return false;

	}

	public static boolean isNumber(String number) {

		try {
			Long.parseLong(number);
			System.out.println("This is a valid number : " + number);
		} catch (NumberFormatException e) {
			System.out.println("Not a valid number : " + number);
			return false;
		}
		return true;// The given string is must be number not accept any Alphabets.
					// But here we are not restricted any size of number

	}

	public static boolean IsValidCCNUmber(String number) {

		if (isCorrectphnumber(number) && isNumber(number)) {
			System.out.println("Valid credit card number : " + number);
			return true;
		}
		// System.out.println("Not a valid Credit card number : " + number);
		return false;// 4th method Here we combine the number must be 16 digit
						// number as well as the number must be number not accept any Alphabets.
		// number.length() == 16

	}

	public static void main(String[] args) {

		
<<<<<<< HEAD
		//  System.out.println(iscorrectCellNumber("1234567890"));
		//  System.out.println(iscorrectCellNumber("-9987.1230"));
		  
		//  System.out.println(iscorrectMobNumber("abcdefghij"));
		 // System.out.println(iscorrectMobNumber("-9987.1230"));
		 
		 System.out.println(isCorrectphnumber("1234567890"));
=======
		  System.out.println(iscorrectCellNumber("-2345.7890"));
		  System.out.println(iscorrectCellNumber("-9987.1230"));
		  
		  System.out.println(iscorrectMobNumber("abcdefghij"));
		  System.out.println(iscorrectMobNumber("-9987.1230"));
		 
		// System.out.println(isCorrectphnumber("abcdefghij"));
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
		//System.out.println(isCorrectphnumber("-9987.1230"));

		//System.out.println(IsValidCCNUmber("abcdefghij"));
		// System.out.println(IsValidCCNUmber("123456471254369812"));
		
		

	}

}
