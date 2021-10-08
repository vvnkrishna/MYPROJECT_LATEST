package JavaPackage;

public class CountOfOccurenceCharacter {

	public static void main(String[] args) {
		
		String s = "Appearance";
		
		getcharoccurence(s,'A');
		
		
	}
	
	
	public static void getcharoccurence(String str,char val) {
		
		int count = 0;
		
		
		for(char ch: str.toCharArray()) {
			
			if(ch == val) {
				
				count++;				
			}
		}
		
		System.out.println("Character " + val + " Occurence:" + count);
	}

}
