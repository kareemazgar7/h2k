package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropusingActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/droppable");
		  Actions obj=new Actions(driver);
		 WebElement draggable=driver.findElement(By.id("draggable"));
		 WebElement droppable=driver.findElement(By.id("droppable"));
		 obj.dragAndDrop(draggable, droppable).build().perform();
	}

}
