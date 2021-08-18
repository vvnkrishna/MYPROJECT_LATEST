package JavaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {

	@Test
	public void assertionCheck() {
		
		String Expectedmessage = "Login Successfully";
		String ActualMessage = "Login Successfully.";		
		
		try {
		Assert.assertEquals(ActualMessage, Expectedmessage);
		}catch(AssertionError e) {
			System.out.println(e);
		}
		
		System.out.println("Assertion method Verifiction successful");
		
	}
	
}
