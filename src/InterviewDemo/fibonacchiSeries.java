package InterviewDemo;

public class fibonacchiSeries {

	public static void main(String[] args) {
		
		//0,1,1,2,3,5,8,13,21 required output
		
		
		int a = 0;
		int b = 1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
	
		
		for(int i = 0 ; i < 8; i++) {
			
			c = a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
		
		
		

	}

}
