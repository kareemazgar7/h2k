package day28;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	
	@Test
	public void testmethod()
	{
		System.out.println("this is our test method");

	}


	@Test
	public void testmethod1()
	{
		System.out.println("this is our  test method1");
	}


	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is our before method");
	}
	
	@AfterMethod
	public void aftermethod() 
	{
		System.out.println("this is our after method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this is our before class");
	}
	
	@AfterClass
	public void afterclass() 
	{
		System.out.println("this is our after class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("this is our beforetest");
	}
	
	@AfterTest
	public void aftertest() 
	{
		System.out.println("this is our aftertest");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("this is our beforesuite");
	}
	
	@AfterSuite
	public void aftersuite() 
	{
		System.out.println("this is our aftersuite");
	}
}
