package day29;

import org.testng.annotations.Test;

public class DependsonAnnotation {

	@Test(dependsOnMethods = "jack4")
	public void jack1()
	{
		System.out.println("this is jack1");
	}
	@Test
	public void jack2()
	{
		System.out.println("this is jack2");
	}
	@Test
	public void jack3()
	{
		System.out.println("this is jack3");
	}
	@Test
	public void jack4()
	{
		System.out.println("this is jack4");
	}
	@Test
	public void jack5()
	{
		System.out.println("this is jack5");
	}
	@Test
	public void jack6()
	{
		System.out.println("this is jack6");
	}
}
