package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		 
		 
		  Select obj= new Select(  driver.findElement(By.name("state")));
		  obj.selectByVisibleText("Alaska");
		  //we never use the index value if there are only 3 or 5 option available then we can use index value
	}

}
