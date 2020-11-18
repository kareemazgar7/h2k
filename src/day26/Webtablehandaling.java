package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablehandaling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//webtable is nothing but s table inside the website
		//table class means whole table
		//t head means heading of the table 
		//t body means rest of the table where all the elements are available except t head 
		// tr means table row 
		// td means table data
		//[example] //*[@id='tab1_tableGainer']/table/tbody/tr[4]/td[3]
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.nseindia.com/");
		System.out.println(driver.findElement(By.xpath("//*[@id='tab1_tableGainer']/table/tbody/tr[4]/td[3]")).getText());
		  
	}

}
