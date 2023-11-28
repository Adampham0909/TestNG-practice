package TestNG_Day02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	
	String expectedMessage = "April";
	
	@Test
	public void TestPrintMessage() {
		System.out.println("Printing inside TestPrintMessage()");
		String actualMessage = "April";
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	@Test(dependsOnMethods = {"TestPrintMessage" , "thirdMethod"})
	public void TestSalutationToApril() {
		System.out.println("Printing inside TestSalutationToApril()");
		
	}
	
	@Test
	public void thirdMethod() {
		System.out.println("Printing inside thirdMethod()");
		Assert.assertTrue(true);
	}
	
	
	
	
}
