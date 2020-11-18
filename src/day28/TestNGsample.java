package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGsample {

	@Test
	public void mehtod1()
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	}
	  
}
