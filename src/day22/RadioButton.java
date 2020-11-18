package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		 driver.findElement(By.xpath("(//*[@name='optradio'])[1]")).click();
		 System.out.println(driver.findElement(By.xpath("(//*[@name='optradio'])[1]")).isSelected());
		  
	}

}
