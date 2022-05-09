package com.testing;

import org.testng.annotations.Test;

public class test4 {
	@Test
	public void g_method()
	{
	System.out.println(" acd");	
	}
	@Test
	public void s_method()
	{
	System.out.println(" abbaa");	
	}
	@Test
	public void n_method()
	{
	System.out.println("abababa ");	
	}
	@Test (priority=-1)
	public void d_method()
	{
	System.out.println(" dharam");	
	}
	@Test (priority=-2)
	public void e_method()
	{
	System.out.println("eshu");	
	}

}
// if we give negative priority it will run first, otherwise it consider 0 priority and it runs through alphabatically.

