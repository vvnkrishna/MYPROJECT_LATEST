package JavaPackage;

public class Array4 {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,4,5},{5,7,8,9},{8,5,2,7}};
		
		int rows = a.length;		
		System.out.println("Total rows : " + rows);
		
		int columns = a[0].length;		
		System.out.println("Total columns : " + columns);
		
		
		//Outer Loop
		
		for(int i = 0; i < rows; i++) {
			
			//Inner loop 
			
			for(int j = 0; j < columns;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
