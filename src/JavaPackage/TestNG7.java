package JavaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {

	@Test
	public void z() {

		Assert.assertTrue(3 > 12);
		System.out.println("z test Method");
	}

	@Test(dependsOnMethods = {"z"})
	public void d() {
		System.out.println("d method is dependent on z method");
	}

}
/*
 * z method is failed because assert action is false due this d method is
  skipped because d method is depend on z method */