package JavaPackage;

public class InterviewDemo2 {

	public static void main(String[] args) {
		
		String s = "****";
		
		String star = "";
		
		for(int i = 0; i < 4; i++) {
			
			star = star+s.charAt(i);
			
			System.out.println(star);
		}
		
		
		String a = "I love my India";
		
		System.out.println(a.replaceAll("\\s+", ""));
		
		
	}
	
	
}
