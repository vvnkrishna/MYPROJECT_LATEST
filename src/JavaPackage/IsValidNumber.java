package JavaPackage;

public class IsValidNumber {
	
	public static boolean iscorrectCellNumber(String number) {
		return number.matches("[0-9]{10}");// 1st method condition i.e given string must be 0 to 9 and size must be 10 only
			
	}

	public static boolean iscorrectMobNumber(String number) {
		return number.matches("\\d{10}");//2nd method condition i.e given string must
		                                 // be digit and size must be 10 only		
	}
	
	public static boolean isCorrectNummber(String number) {
		 if(number.matches("^-\\d*\\.?\\d+$")) {
			 return false;
		}
		return true;
	}
	
	
	

	public static boolean isCorrectphnumber(String number) {

		if (number.length() == 10 && isCorrectNummber(number)) {
			System.out.println("Valid NUmber : " + number);// 3rd method Here we combine the number must be 10digit
															// number as well
															// as the number
															// neither negative nor decimal value.
			return true;
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

		if (number.length() == 16 && isNumber(number)) {
			System.out.println("Valid credit card number : " + number);
			return true;
		}
		System.out.println("Not a valid Credit card number : " + number);
		return false;//4th method Here we combine the number must be 16 digit
		             // number as well as the number must be number not accept any Alphabets.
		
		
	}
	
	public static void main(String[] args) {
		
		/*
		 * System.out.println(iscorrectCellNumber("9966003020"));
		 * System.out.println(iscorrectCellNumber("99660030201234"));
		 * 
		 * System.out.println(iscorrectMobNumber("9848022338"));
		 * System.out.println(iscorrectMobNumber("98480223381232"));
		 */
		System.out.println(isCorrectphnumber("9988776655"));
		System.out.println(isCorrectphnumber("-9987.1230"));
		
		/*
		 * System.out.println(IsValidCCNUmber("1234564712543698"));
		 * System.out.println(IsValidCCNUmber("123456471254369812"));
		 */
		
		
	}
	
	
	

}
