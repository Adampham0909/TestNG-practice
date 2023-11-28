package TestNG_Day02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamWithDataProvider {
	
	
	@DataProvider(name="dataProvider1")
	public Object[][] nameOfTheMethod(){
		return new Object [][] {{"Shafkat" , "Leather Jacket" , 37}, {"Saroj", "T-Shirt" , 24} , {"Adam" , "Hoodie" , 27} , {"Summer" , "Polar Bear Jacket" , 20}};
	}
	
	@Test(dataProvider="dataProvider1")
	public void printDataProvider(String name1, String name2, int age) {
		System.out.println("My name is " + name1 + ", and I am wearing " + name2 + ". And I am " + age + " years old") ;
	}
	
	
	
	
	
}
