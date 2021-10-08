package InterviewDemo;

public class demoStatic01 {

	public static void main(String[] args) {

		isvalidnumber("9999988888");
		isvalidinput("Krishnaveera");

	}

	public static boolean isvalidnumber(String number) {
		if (number.matches("[0-9]{10}")) {
			System.out.println("This is valid number: " + number);
			return true;
		}
		System.out.println("This is invalid number : " + number);
		return false;
	}

	public static boolean isvalidlowerinput(String input) {
		if (input.matches("[a-z]{6}")) {
			// System.out.println("This is valid input: " + input);
			return true;
		}
		// System.out.println("This is invalid input: " + input);
		return false;
	}

	public static boolean isvalidupperinput(String input) {
		if (input.matches("[A-Z]{6}")) {
			return true;
		}
		return false;
	}

	public static boolean isvalidinput(String input) {

		if (isvalidlowerinput(input) & isvalidupperinput(input)) {
			System.out.println("This is valid input : " + input);
			return true;

		}
		System.out.println("This is invalid input : " + input);
		return false;

	}

}
