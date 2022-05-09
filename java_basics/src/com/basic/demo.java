package com.basic;

public class demo {
	public void test1()
	{
		System.out.println("hi im java");
	}
public static void test2()
{
System.out.println("technogreaks");	
}
public void test3()
{
System.out.println("microsoft");	
}
public static int test4()
{
	int a=10;
	return a;
	
}
public void paraMethod(String name, int age)
{
	System.out.println(name+" "+ age);
}
public static void main(String[] args)
{
	demo obj= new demo();
	obj.test1();
	test2();
	obj.test3();
			System.out.println(test4());
			obj.paraMethod("krishna", 25);
			
}
}
