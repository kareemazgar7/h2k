package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		  //driver.manage().window().setSize();
		  driver.findElement(By.xpath("(//*[@class='cb1-element'])[1]")).click();
		 System.out.println(driver.findElement(By.xpath("(//*[@class='cb1-element'])[1]")).isSelected());
		  //with the help of is selected method we can find out if the particular check box is selected or not
	}

}
