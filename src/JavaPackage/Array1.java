package JavaPackage;

public class Array1 {

	public static void main(String[] args) {

		// Declaration of an array and instantiation
		int a[] = new int[5];

		a[0] = 1;
		a[3] = 3;
		a[2] = 6;
		a[1] = 7;
		a[4] = 1;

		System.out.println(a[2]);

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {

			System.out.println("Array value for index : " + i + " is : " + a[i]);

		}

		String s[] = new String[5];

		s[0] = "hi ";
		s[1] = "World ";
		s[2] = "I ";
		s[3] = "am ";
		s[4] = "Chitti.";
		
		int len = s.length;
		System.out.println(len);
		
		
		for(int j = 0; j < len ; j++) {
			
			System.out.print(s[j] );
			
			
		}

	}

}
