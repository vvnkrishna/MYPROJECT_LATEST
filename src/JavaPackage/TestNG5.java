package JavaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {

	@Test
	public void a() {
		System.out.println("a test Method");
	}

	@Test(enabled = false)
	public void b() {
		System.out.println("b test Method");
	}

	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c test Method");
	}

	@Test(invocationCount = 0)
	public void d() {
		System.out.println("d test Method");
	}
	
	@Test
	public void e() {
		System.out.println("e test Method");
		throw new SkipException(" Skipping e Method");	
		
	}


}
