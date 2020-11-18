package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribiute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		 System.out.println( driver.findElement(By.id("twotabsearchtextbox")).getAttribute("name"));
		
	}
}
