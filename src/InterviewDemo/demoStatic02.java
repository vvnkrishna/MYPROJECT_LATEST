package InterviewDemo;

public class demoStatic02 {

	public static void main(String[] args) {

		System.out.println(isvaliddata("Krishna1234567"));
		// System.out.println(isvalidlowerdata("Krishna"));

	}

	public static boolean isvalidlowerdata(String data) {

		if (data.length() >= 6 && data.matches("\\S+")) {
			// System.out.println("This is valid data : " + data);
			return true;

		}
		// System.out.println("This is invalid data : " + data);
		return false;

	}

	public static boolean isvaliddata(String data) {

		if (isvalidlowerdata(data) && data.length() <= 12) {

			System.out.println("This is valid data : " + data);
			return true;

		}
		System.out.println("This is invalid data : " + data);
		takesScreen();
		return false;

	}



public static void takesScreen() {
	System.out.println("hi");
	
}

}
