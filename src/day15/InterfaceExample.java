package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface InterfaceExample {
 
	public void printname();
	
	//Whenever we need to use 100% data hiding we need to use interface
	//whenever we make an interface by default it means all the method underneath interface will be abstract in nature
	
	WebDriver dirver=new ChromeDriver(); //WebDriver is an interface
	
	
	
}
