package JavaPackage;

public class MissingNo_inArray {

	public static void main(String[] args) {
		
		int number[] = {1,2,3,4,5,6,7};
		
		
		int result = findnumber(number,8);//Here 8 is total count of numbers
		System.out.println(result);
		
		
	}
	
	
	public static int findnumber(int num[] , int totalcount) {
		int expsum = totalcount*(totalcount+1)/2;
		int actsum = 0;
		
		for(int i : num) {
			actsum  +=i;
		}
		return expsum-actsum;
	}

}
