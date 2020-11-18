package day22homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	//
	8:23 PM

	H2k Training to Everyone

	1. Launch the Browser
	2. Naviagte to Google.com
	3. Get the Title of the current URL
	4. Get the Current URL 
	5. Return Page Source 
	6. Navigate to Amazon.com
	7. Navigate BAckward
	8. Naviagte Forward 
	9. Close the Browser

1. We need to get the username& PAssword from the user , using the scanner class 
2. Then enter the same in the  Twitter login webpage




9:03 PM

H2k Training to Everyone

1. Try to fetch the URL of the GMAIL Link on the google page , without even clicking on this





8:14 PM

H2k Training to Everyone

Team 




8:14 PM

H2k Training to Everyone

M i audible?




8:14 PM

Me to Organizers

no 




8:14 PM

H2k Training to Everyone

ohh just let me join back 




8:16 PM

Santhiya S to Everyone

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillink {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","C:\\Users\\anish\\Desktop\\sandy\\selenium\\chromedriver_win32 (4)\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  
  driver.get("http://www.google.com");
  driver.manage().window().maximize();
  
  WebElement gmail=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
  String linktext=gmail.getAttribute("href");
  System.out.println("Gmail Link: "+linktext);
  
  driver.close();

 }

}





8:17 PM

//Santhiya S to Everyone

//https://www.seleniumeasy.com/test/basic-checkbox-demo.html






//Santhiya S to Everyone

(//div[@class='checkbox']//label//child::*)[2]




8:21 PM

Attendee 19 to Everyone

(//*[@class='cb1-element'])[2]




8:22 PM

H2k Training to Everyone

//    //*[text() ='Option 2']
//    //*[@id='tab1_tableGainer']/table/tbody/tr[1]/td[1]

	public static void main(String[] args); {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("first_name")).sendKeys("Ali");
		  driver.findElement(By.name("last_name")).sendKeys("Mohammad");
		  driver.findElement(By.name("email")).sendKeys("abc@.com");
		  driver.findElement(By.name("phone")).sendKeys("123456");
		  driver.findElement(By.name("address")).sendKeys("120 winding wood drive");
		  driver.findElement(By.name("city")).sendKeys("old bridge");
		  //driver.findElement(By.xpath("//*[@name='state']")).sendKeys("new jersey");
		  driver.findElement(By.name("zip")).sendKeys("08875");
		  driver.findElement(By.name("website")).sendKeys("real state");
		  
		  driver.findElement(By.xpath("(//*[@name='hosting'])[1]")).click();
		   System.out.println(driver.findElement(By.xpath("(//*[@name='hosting'])[1]")).isSelected());
		   
		   driver.findElement(By.name("comment")).sendKeys("abc");
		  // driver.findElement(By.xpath("//*[@type='submit']")).click();
		   
		  
			 
		  
		  
		  
	}

}
