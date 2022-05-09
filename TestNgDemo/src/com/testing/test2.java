package com.testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	@Test
	public void method1()
	{
		System.out.println("test2 method1");
	}
	@Test(enabled=false) // this method is not run..
	public void method2()
	{
		System.out.println("test2 method2");
	}
	/*@Test (dependsOnMethods= {"method2"}) // define priority run 1st depend method
	public void method3()
	{
		System.out.println("test2 method3");
	}
	@BeforeSuite
	public void method4()
	{
		System.out.println("test2 method4");
	}
@AfterSuite
	public void method5()
	{
		System.out.println("test2 method5");
	}*/

}
