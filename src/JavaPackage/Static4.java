package JavaPackage;

public class Static4 {

	Static4(){
		System.out.println("No arg constructor");
		
	}
	
	int roll;
	String name;
	static String college = "Balaji";
	String course = "B.tech";
	
	Static4(int r, String n,String cr){
	
	roll = r;
	name = n;
	course = cr;
	
	}
	
	
	
	public void getresult() {
		
		System.out.println(roll + "  " + name + "  " + course + "  " + college);
	}
	
	
	}


