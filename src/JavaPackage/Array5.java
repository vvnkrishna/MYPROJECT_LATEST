package JavaPackage;

public class Array5 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		String s[] = {"Hi","Hello","How are You"};
		
		System.out.println(a.length);
		System.out.println(a[4]);
		
		System.out.println(s.length);
		System.out.println(s[2]);
		
		for(int i = 0; i < s.length; i++) {
			
			System.out.print(s[i] + " ");
			
		}
		
		System.out.println();
		
			
		int m[][] = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
		
		int rows = m.length;		
		System.out.println(rows);
		
		int columns = m[0].length;
		System.out.println(columns);	
						
		//Outerloop
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < columns; j++) {
				System.out.print(m[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
		}
				
	}


