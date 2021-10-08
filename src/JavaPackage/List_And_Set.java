package JavaPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class List_And_Set {

	public static void main(String[] args) {
		
		//List Declaration
		List<Integer> in = new ArrayList<>();
		
		in.add(5);
		in.add(2);
		in.add(6);
		in.add(4);
		in.add(5);
		in.add(1);
		
		
		//Set Declaration
		Set<Integer> st = new HashSet<>();
		
		st.add(5);
		st.add(2);
		st.add(6);
		st.add(4);
		st.add(5);
		st.add(1);
		
		
		System.out.println("List : "  + in);
		
		System.out.println("Set : " + st);
		
		
		
		
		
		
		
		
		

	}

}
