package JavaPackage;

public class RemoveWhitSpaces {

	public static void main(String[] args) {

		String newstring = "     Naveen Automation Labs    ";

		//System.out.println(newstring.trim());// This method removes only corner spaces.(Naveen Automation Labs)

		//System.out.println(newstring.replaceAll("\\s+", ""));// This Method removes All the white spaces from string.
																// (NaveenAutomationLabs)

		// But Interviewer asks without using predefined method how can you remove all
		// the white spaces from string

		String xyz = " Naveen Automation Labs      " 
		             + "\n java course   "
				     + "\n core java tutorials    "
				     + "\t Sprng boot course  ";
		
		System.out.println(xyz);
		System.out.println(xyz.length());
		
		String nowhitespaces = "";
		
		for(int i=0; i<xyz.length(); i++) {
			
			if((xyz.charAt(i)!=' ') &&  (xyz.charAt(i)!='\t')) {
				nowhitespaces = nowhitespaces + xyz.charAt(i);
				
			     }
			
			}

		
		
		
		
		
		System.out.println(nowhitespaces);	
		}
		

	}


