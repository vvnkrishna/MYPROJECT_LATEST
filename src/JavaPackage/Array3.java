package JavaPackage;

public class Array3 {
	
	public static void main(String[] args) {
		
		int a[] = { 22,5,6,8 };//Declaration and initialization
		
		System.out.println(a.length);
		
		passingArraytoMethod(a);// call to passingArraytoMethod
 		
	}
	
	
	public static void passingArraytoMethod(int a[]) {
		
		int b = a[0];
		
		for(int i = 0;i < a.length; i++) {
			
			if(b >= a[i]) {
				System.out.println(b);
			
			}
			
			
		}
		
		
	}

}
