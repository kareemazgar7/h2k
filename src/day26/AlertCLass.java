package day26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCLass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/V1/index.php");
		  driver.findElement(By.name("btnLogin")).click();
		 Thread.sleep(4000); //thread is the method for pausing the system for whatever time you provide
		  //driver.switchTo().alert().dismiss();
		Alert obj=driver.switchTo().alert();
		obj.getText();
		obj.accept();
		  
		  
	}

}
