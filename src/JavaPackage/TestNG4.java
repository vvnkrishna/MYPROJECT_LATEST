package JavaPackage;

import org.testng.annotations.Test;

public class TestNG4 {

	@Test(priority=-20)
	public void a() {
		System.out.println("a test Method");
	}

	@Test(priority=-10)
	public void b() {
		System.out.println("b Method ");
	}

	@Test(priority=2)
	public void c() {
		System.out.println("c Method");
	}

	@Test(priority=0)
	public void d() {
		System.out.println("d Method");
	}

	@Test
	public void e() {
		System.out.println("e Method");
	}

	@Test
	public void f() {
		System.out.println("f Method");
	}

}
