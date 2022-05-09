package com.exeptionhandling;

public class demo {
	
	public static void main(String[] args) {
		
	try {
	
	int a[]= {1,2,3,4,5};
	System.out.println(a[6]);
	}
	catch(Exception e) {
		System.out.println("kuch to galat hai");
		
	}
	finally { // it will execute always
	System.out.println("hello");

	

}
}}