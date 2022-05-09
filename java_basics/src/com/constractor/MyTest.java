package com.constractor;

public class MyTest {
	int id;
	String name;
	
	MyTest(int id, String name)
	{
		this.id = id;

		this.name = name;
	}

	

	public static void main(String[] args)
	{
		MyTest T1= new MyTest(12345, "vivek");
		MyTest T2= new MyTest(4562, "veer");
	

		System.out.println("MyTest1: "+T1.name+" "+T1.id);
		System.out.println("MyTest2: "+T2.name+" "+T2.id);
		
	}

}
