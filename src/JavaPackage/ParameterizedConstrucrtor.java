package JavaPackage;

public class ParameterizedConstrucrtor {

	int id;
	String name;
	String Address;

	ParameterizedConstrucrtor() {

		System.out.println("Hello Default constructor");
	}

	ParameterizedConstrucrtor(int a, String b, String c) {

		id = a;
		name = b;
		Address = c;

	}

	public void DisplayInformation() {

		System.out.println(id + " " + name + " " + Address);
	}

	public static void main(String[] args) {
		
		ParameterizedConstrucrtor pc0 = new ParameterizedConstrucrtor();
		ParameterizedConstrucrtor pc1 = new ParameterizedConstrucrtor(1,"Ram","pune");
		ParameterizedConstrucrtor pc2 = new ParameterizedConstrucrtor(1,"Shyam","goa");
		ParameterizedConstrucrtor pc3 = new ParameterizedConstrucrtor(1,"kumar","Delhi");
		ParameterizedConstrucrtor pc4 = new ParameterizedConstrucrtor(1,"Raju","Chennai");
		
	
		pc1.DisplayInformation();
		pc2.DisplayInformation();
		pc3.DisplayInformation();
		pc4.DisplayInformation();
		
		

	}
}
