package InterviewDemo;

public class MatrixArray {

	public static void main(String[] args) {
		
		int arr[][] = { {1,2,3},{4,5,6},{7,8,9}};
		
		int row = arr.length;
		
		System.out.println(row);
		
		int col = arr[0].length;
		
		System.out.println(col);
		
		
		int result = 1;
		
		for(int i = 0 ; i < row ; i++) {
			
			for(int j = 0 ; j < col; j++) {
				
				if(i==j) {
					
					int value = arr[i][j];
					
					result = result*value;
					
					
				}
			}
			
			
		}
		
		System.out.println(result);
	}

}
