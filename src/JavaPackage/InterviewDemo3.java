package JavaPackage;

public class InterviewDemo3 {

	public static void main(String[] args) {
		
		
		String s = "Appearance";
		
		getcharoccurence(s,'a');
		
		
		
		
		
	}
	
	public static void getcharoccurence(String str, char val) {
		
		int count = 0;
		
		for(char ch : str.toCharArray()){
			
			if(ch==val) {
				
				count++;
			}
			
			
			
		}
		
		System.out.println(val + ":" + count);
		
	}

}
