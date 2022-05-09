package com.constractor;

public class default_constractor {
	int a;
	public default_constractor()   // this is constractor
	{
		a=10;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		default_constractor b=new default_constractor(); // this line constractor call
		System.out.println(b.a);
	}

}
