package JavaPackage;

public class MissingNo_inArray {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		int number[] = {2,3,4,5,6,7,8};
=======
		int number[] = {1,2,3,4,5,6,7};
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
		
		
		int result = findnumber(number,8);//Here 8 is total count of numbers
		System.out.println(result);
		
		
	}
	
	
	public static int findnumber(int num[] , int totalcount) {
		int expsum = totalcount*(totalcount+1)/2;
		int actsum = 0;
		
		for(int i : num) {
<<<<<<< HEAD
			actsum  = actsum + i;
=======
			actsum  +=i;
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
		}
		return expsum-actsum;
	}

}
