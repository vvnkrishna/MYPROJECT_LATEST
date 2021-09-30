package JavaPackage;

public class InterviewDemo1 {

	public static void main(String[] args) {
		
		
		String s = "Hello World";
		
		int len = s.length();
		
	String rev = "";
		
		for(int i = len-1; i >= 0; i--) {
			
			rev = rev+s.charAt(i);
					
		}
		
		System.out.println(rev);
		
		
		String a = "krishna@gmail.com";
		
		
		String abc[] = a.split("@");
		
		
		printmethod(abc, "Split method");
		
		
		
		
		}
	
	public static void printmethod(String arr[],String str) {
		
		System.out.println(str);
		for(String st : arr) {
			System.out.println(st);
			
		}
	}

}









