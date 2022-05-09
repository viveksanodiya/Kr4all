package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
@Test
public void method1()
{
System.out.println(" Test 1test1 method1");	
}
@BeforeTest
public void method2()
{
System.out.println(" BeforeTest 2test1 method2");	
}
@AfterTest
public void method3()
{
System.out.println(" AfterTest 3test1 method3");	
}
@BeforeClass
public void method4()
{
System.out.println(" BeforeClass 4test1 method4");	
}
@BeforeMethod
public void method5()
{
System.out.println("BeforeMethod 5test1 method5");	
}
@AfterClass
public void method6()
{
System.out.println("AfterClass 6test1 method6");	
}
@Test
public void method7()
{
System.out.println("Test 7test1 method7");	
}
@BeforeSuite
public void method8()
{
System.out.println("BeforeSuite 8test1 method8");	
}
@AfterSuite
public void method9()
{
System.out.println("aftersuit 9test1 method9");	
}
}


