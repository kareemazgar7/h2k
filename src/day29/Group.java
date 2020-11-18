package day29;

import org.testng.annotations.Test;

public class Group {

	@Test(groups = {"sanity"})
	public void jack1()
	{
		System.out.println("this is jack1");
	}
	@Test(groups = {"Regression"})
	public void jack2()
	{
		System.out.println("this is jack2");
	}
	@Test
	public void jack3()
	{
		
	}
}
