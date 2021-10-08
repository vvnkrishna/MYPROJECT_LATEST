package InterviewDemo;

public class IsValidNumber {

	public static void main(String[] args) {
		
		
		
		isvalidnumber("1112534564");
		
		

	}
	
	
	public static boolean isvalidnumber(String number) {
		
		if(number.matches("[0-9]{10}")) {
			System.out.println("Valid number " + number);
			return true;
			
		}
					
		System.out.println("invalid number " + number);
		return false;
	}

}
