package day29;

import org.testng.annotations.Test;

public class PriorityTestNG {

	//if any test cases has no parameter that means it has priority to execute first 
	@Test(priority = 6)
	public void jack1()
	{
		System.out.println("this is jack1");
	}
	@Test(priority = 5)
	public void jack2()
	{
		System.out.println("this is jack2");
	}
	@Test(priority = 4)
	public void jack3()
	{
		System.out.println("this is jack3");
	}
	@Test(priority = 3)
	public void jack4()
	{
		System.out.println("this is jack4");
	}
	@Test(priority = 2)
	public void jack5()
	{
		System.out.println("this is jack5");
	}
	@Test(priority = 1)
	public void jack6()
	{
		System.out.println("this is jack6");
	}
}
