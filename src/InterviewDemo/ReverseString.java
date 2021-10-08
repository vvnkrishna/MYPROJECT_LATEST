package InterviewDemo;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//1st method
		
		String s = "Hello world";
		
		int len = s.length();
		
		String reverse = "";
		
		for(int i = len-1; i >= 0; i--) {
			
			reverse = reverse+s.charAt(i);	
			
			
		}
		
		System.out.println(reverse);
		
		
		//2nd method

		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		//System.out.println(20+30+'K'+30+30);
		
	}
	
	
	
	

}
