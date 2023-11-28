package TestNG_Day02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParallel {
	WebDriver driver;
	
	@Test
	public void method1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.speedtest.net/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void method2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.techcircleschool.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void method3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	

}
