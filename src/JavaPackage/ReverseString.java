package JavaPackage;

<<<<<<< HEAD


=======
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello world";
		
		//1st method
		int len = s.length();
		
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			
<<<<<<< HEAD
		rev = rev + s.charAt(i);
			
=======
			rev = rev + s.charAt(i);
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
			
			
		}
		
		System.out.println(rev);
		
<<<<<<< HEAD
			
=======
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
		
		
		//2nd method 
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		
		

	}

}
