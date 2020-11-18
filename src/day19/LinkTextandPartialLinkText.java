package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextandPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\driver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.calculator.net/ideal-weight-calculator.html");
		  driver.findElement(By.linkText("Ideal Weight")).click();
		 //whenever we have link on the website then we have the another tags <a
		  driver.findElement(By.partialLinkText("Weight Gain")).click();
		  //partial link text
	}

}
