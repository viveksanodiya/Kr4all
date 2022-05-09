package com.exeptionhandling;

public class through_demo {
	public static void main(String[] args) {
		int age = 20;
		if (age>=20) {
			throw new ArithmeticException("access granted");  // customized errors or message
		}
		else {
			System.out.println("access denied");
		}
	}

}
