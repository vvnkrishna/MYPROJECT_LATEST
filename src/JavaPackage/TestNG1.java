package JavaPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void a2() {
		System.out.println("a2 test Method");
	}

	@BeforeTest
	public void b() {
		System.out.println("Beforetest Method ");
	}

	@BeforeSuite
	public void c() {
		System.out.println("BeforeSuite Method");
	}

	@AfterMethod
	public void d() {
		System.out.println("AfterMethod Method");
	}

	@BeforeClass
	public void e() {
		System.out.println("BeforeClass Method");
	}

	@AfterTest
	public void f() {
		System.out.println("AfterTest Method");
	}

	@AfterClass
	public void g() {
		System.out.println("AfterClass Method");
	}

	@BeforeMethod
	public void h() {
		System.out.println("BeforeMethod Method");
	}

	@AfterSuite
	public void i() {
		System.out.println("AfterSuite Method");
	}

	@Test
	public void a1() {
		System.out.println("a1 TestMethod");
	}

}
