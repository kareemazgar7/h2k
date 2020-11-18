package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListofDropdownvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		  //to see how many drop down value is there we have to use the list drop down 
		  //list is nothing but collection of web element
	
		  Select drp= new Select(driver.findElement(By.name("state")));
		  List<WebElement> s =drp.getOptions();
		  System.out.println(s.size());
	}

}
