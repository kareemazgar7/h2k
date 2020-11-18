package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.com//");
		 // driver.findElement(By.className("nav-input")).click(); //if the send keys doesn't work use the click
		  driver.findElement(By.className("nav-input")).sendKeys("LAPTOP");
	}

}
