package day27;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://image.online-convert.com/convert/pdf-to-jpg");
		  //driver.findElement(By.id("fileUploadButton")).click();
		  
		  Robot rb= new Robot();
		//rb.keyPress(KeyEvent.VK_ESCAPE);
		  
		  rb.mouseMove(240, 300);
		 rb.mouseWheel(400);
				  
		  
	
		  
		 

		  
	}

}
