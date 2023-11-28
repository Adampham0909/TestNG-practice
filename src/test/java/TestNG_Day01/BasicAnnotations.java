package TestNG_Day01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations {
	
	@BeforeTest
	public void setup() {
		System.out.println("BeforeTest");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	
	@Test (groups = {"Gautam"})
	public void test1() {
		System.out.println("Test1");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	
	@AfterTest
	public void tearDown() {
		System.out.println("AfterTest");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@Test(groups= {"Regression"})
	public void test3() {
		System.out.println("Test3");
	}
	
	
	@Test(groups= {"SmokeTest"})
	public void test2() {
		System.out.println("Test2");
	}
	
}
