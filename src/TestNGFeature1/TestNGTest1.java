package TestNGFeature1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class TestNGTest1 
{
	WebDriver driver;
	@AfterTest
	void funA()
	{
		driver= new ChromeDriver();
	}
	@BeforeSuite
	void funB()
	{
		driver.findElement(By.xpath("")) ;
		System.out.println("execute funB");
	}
	@AfterSuite
	void funC()
	{

		System.out.println("quiting funC");
		driver.quit();
	}
}
