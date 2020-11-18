package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		 
		  Actions obj=new Actions(driver);
		  //obj.moveToElement(driver.findElement(By.id("id=nav-link-accountList"))).build().perform();
		  WebElement accountAndList=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		  WebElement recommedtions=driver.findElement(By.xpath("//*[text()='Recommendations']"));
		  WebElement Recommedtions=driver.findElement(By.xpath("//*[text()='Recommendations']"));
		  obj.moveToElement(accountAndList).contextClick(recommedtions).click(Recommedtions).build().perform();
		  // obj.moveToElement(accountAndList).contextClick(recommedtions).click(Recommedtions).build().perform();
	}

}
