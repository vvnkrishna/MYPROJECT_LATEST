package InterviewDemo;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		
		String s =" Naveen Automation Labs      " 
	             + "\n java course   "
			     + "\n core java tutorials    "
			     + "\t Sprng boot course  ";
				
				
		String result = s.replaceAll("\\s+", "");
		
		System.out.println("Method 1 : " + result);
		
		int len = s.length();
		
	String 	result1 = ""; 
		for(int i = 0 ; i < len ; i++) {
			
			if((s.charAt(i) != ' ') && (s.charAt(i) != '\t')){
				
				result1 = result1+s.charAt(i);	
				
				
				
			}
			
		}
		
		System.out.print("Method 2 : "  + result1);
		

	}

}
