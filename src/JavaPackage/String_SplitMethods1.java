package JavaPackage;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.exec.util.StringUtils;

import com.google.common.base.Splitter;

public class String_SplitMethods1 {

	public static void main(String[] args) {

		String s = "krishnach7813@gmail";

		//1st method
		String st[] = s.split("@");
		printstringmethod(st,"Spliiting class split method");
		  
		//2nd method 
		List<Object> stlt =  Pattern.compile("@").splitAsStream(s).collect(Collectors.toList());
		for(Object stin : stlt) {
		System.out.println("Splitting by using pattern class");
		System.out.println(stin);
		}
		 

		// 3rd Method
		StringTokenizer snt = new StringTokenizer(s, "@");
		while (snt.hasMoreTokens()) {
			String s2 = snt.nextToken("@");
			System.out.println("Splitting by using StringTokenizer class");
			System.out.println(s2);
		}

		// 4th Method
		String splitarr[] = StringUtils.split(s, "@");
		printstringmethod(splitarr, "splitting StringUtils method");
		

		// 5th method
		Iterable<String> results = Splitter.on("@").split(s);
		for (String s3 : results) {
			System.out.println(" Google guava package method : " + s3);
		}

		}

	public static void printstringmethod(String arr[], String approach) {

		System.out.println("Splitting string by using :" + approach);
		for (String stirng : arr) {
			System.out.println(stirng);

		}

	}
}
