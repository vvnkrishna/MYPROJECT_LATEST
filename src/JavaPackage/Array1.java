package JavaPackage;

public class Array1 {

	public static void main(String[] args) {

		//Declaration of an array and instantiation
		int a[] = new int[5];

		a[0] = 4;
		a[3] = 3;
		a[2] = 6;
		a[1] = 7;
		a[4] = 1;
		
		System.out.println(a[2]);
		
		System.out.println(a.length);
		
		
		for(int i = 0;i < a.length;i++ ) {
			
			System.out.println("Array value for index : " + i + " is : " + a[i]);
			
			
		}

	}

}
