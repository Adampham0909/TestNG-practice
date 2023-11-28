package TestNG_Day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoringTests {
	String myExpectedName = "Gothem";
	
	
	@Test(enabled=true, groups= {"SmokeTest"})
	public void testPrintMessage() {
		System.out.println("This is the message == Happy Holidays!");
	}
	
	
	@Test(groups= {"Regression"})
	public void assertTesting() {
		String actualName = "Gautam";
		Assert.assertEquals(actualName, myExpectedName);
	}
	
}
