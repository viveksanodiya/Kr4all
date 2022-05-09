package com.testing;

import org.testng.annotations.Test;

public class test3 {
	@Test
	public void a_method()
	{
	System.out.println(" ajay");	
	}
	@Test(dependsOnMethods= {"a_method","c_method"}) // here b_method depends on a_method and C_method..
	public void b_method()
	{
	System.out.println(" biru");	
	}
	@Test
	public void c_method()
	{
	System.out.println(" chetan");	
	}
	/*@Test()
	public void d_method()
	{
	System.out.println(" dharam");	
	}
	@Test(groups= {"Smoke"})
	public void e_method()
	{
	System.out.println(" eashika");	
	}*/

}
