package JavaPackage;

public class Static5 extends Static4 {
	
	public static void main(String[] args) {
		
		Static5 s5 = new Static5();
		Static4 r1 = new Static4(1,"Krishna","ECE");
		Static4 r2 = new Static4(2,"kumar","EEE");
		Static4 r3 = new Static4(3,"Raju","CSC");
		
		Static4.college = "Ravindra";
		
		r1.getresult();
		r2.getresult();
		r3.getresult();
		
		
		
		
	}
	

}
