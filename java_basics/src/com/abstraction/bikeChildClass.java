package com.abstraction;

public class bikeChildClass extends bike {
	public void bikeName()
	{
		System.out.println("i am bike");
		
	}
	
	public static void main(String[] args)
	{
		bikeChildClass a= new bikeChildClass();
		a.bikeName();
		a.bikeName1();
		a.bikeName2();
		
	}

}
