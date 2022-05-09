package com.javabasics;

public class type_casting_demo {
	public static void main (String[] args) {
		byte a = 2;
		float b =a;

		System.out.println(a);
		System.out.println(b);	//widening	
		
		double d = 2.123;
		int e =(int) d;
		System.out.println(d);
		System.out.println(e);// narrowing 
		


}}