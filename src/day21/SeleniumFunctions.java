package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  String title=driver.getTitle();
		  System.out.println(title);
		 System.out.println(driver.getPageSource()); 
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://google.com");
		//driver.navigate doesnt load and wait for program to execute properly so it might fail the execution
		driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).clear();
		
	}

}
