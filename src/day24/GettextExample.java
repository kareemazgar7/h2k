package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://twitter.com/login/error?username_or_email=azg.com&redirect_after_login=%2F");
		  
		  driver.findElement(By.name("session[username_or_email]")).sendKeys("azg.com");
		  driver.findElement(By.name("session[password]")).sendKeys("ali");
		  driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]")).click();
		 
		  System.out.println(driver.findElement(By.xpath("//span[contains(text(),'The usern')]")).getText());
	}

}
