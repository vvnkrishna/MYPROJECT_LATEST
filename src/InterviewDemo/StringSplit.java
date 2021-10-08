package InterviewDemo;

public class StringSplit {

	public static void main(String[] args) {
		
		String s = "krishnaveerach@gmail.com";
		
		String st[] = s.split("@");
		
		printsplit(st);
		
		
		
	}

	
	public static void printsplit(String str[]) {
		
		
		for(String sr : str) {
			
			System.out.println(sr);
			
		}
		
		
	}
	
}
