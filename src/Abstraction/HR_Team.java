package Abstraction;

public class HR_Team extends ITdept {

	public static void main(String[] args) {
		
		HR_Team hr = new HR_Team();
		hr.goodies();
		hr.work();
		hr.salary();
		hr.bonus();
		
		ITdept it = new HR_Team();
		it.goodies();
		it.work();
		it.salary();
		
		
		//ITdept it1 = new ITdept();//here we cannot create object for ITdept because it is an abstract class
		
		
	}

	
	public void salary() {
		
		
		System.out.println("salary is Rs.50000");
	}

	public void bonus() {
		
		System.out.println("Bonus is 1 lakh");
		
	}
	
}
