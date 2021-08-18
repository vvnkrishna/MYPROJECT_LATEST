package JavaPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6 {


	@Test
	public void a() {
		System.out.println("a test Method");
	}

	@Test(invocationCount = 2)
	public void b() {
		System.out.println("b test Method");
	}

	@BeforeMethod
	public void c() {
		System.out.println("This is Before Method");
	}
	
}
