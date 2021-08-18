package JavaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {

		String s = "My Name is Krishna";
		String p = "My name is krishna";

		// 1st way of comparsion
		// 1st way comparsion is wrong.Never comparsion string is like this
		// We always use == number comparsion only
		if (s == p) {
			System.out.println("s and q are equal for 1st way");
		}

		else {
			System.out.println("s and q are  not equal for 1st way");
		}

		// 2nd way of comparsion
		// This comparsioin not appropriate
		if (s.equals(p)) {
			System.out.println("s and q are equal for 2nd way");
		} else {
			System.out.println("s and q are not equal for 2nd way");
		}

		// 3rd way of comparsion
		if (s.equalsIgnoreCase(s)) {
			System.out.println("s and q are equal for 3rd way");
		}

		else {
			System.out.println("s and q are not equal for 3rd way");
		}
		
		/*
		 * For Multiline comments of Java shortcut is "ctrl+shift+?"
		 */
	}
}
