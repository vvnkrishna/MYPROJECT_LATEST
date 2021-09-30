package JavaPackage;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello world";
		
		//1st method
		int len = s.length();
		
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
			
			
		}
		
		System.out.println(rev);
		
		
		
		//2nd method 
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		
		

	}

}
