package TestNG_Day02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestOnGroups {

	
	@Test (groups = "cohort16")
	public void testPrintMessage() {
		System.out.println("Printing testPrintMessage()");
		Assert.assertTrue(true);
	}
	
	
	
	@Test (groups = "cohort16")
	public void testPrintMessage2() {
		System.out.println("Printing testPrintMessage2()");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnGroups="cohort16")
	public void testSaluteGroup() {
		System.out.println("Printing this from TestSaluteGroups()");
	}
	
	
	
	
	
	
	
	
	
	
}
