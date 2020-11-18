package day19;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {

	
	//locators are something that locate the webelement on webpage
	//id,name,linktext,partial linktext,tag,css selector,class,xpath
	//xpath:1 absolute xpath,2 relative xpath
	//Absolute xpath: starts from the single slash /
	//relative xpath: we just go directly and ping the particular nod whichever is required. starts with double slash //
	//we should avoid using any locators value when they have alphanumeric value
	//When using class name and we have space between in class name we call them compound classes
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\eclipse-workspace\\H2K2\\Resources\\Driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com//");
		 driver.findElement(By.id("email")).sendKeys("abc.gmail.com");
		  
	}

}
