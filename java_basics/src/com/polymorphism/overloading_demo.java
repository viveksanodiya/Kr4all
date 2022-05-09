package com.polymorphism;

public class overloading_demo {
	public void method1 (int age,String Name) {
		System.out.println(Name+age);
	}
	public void method2 (long age,String Name) {
		System.out.println(Name+age);
	}
	public static void main(String[] args) {
		
		

overloading_demo a= new overloading_demo();
a.method1(25,"vivek");
a.method2(456, "you");

}
	}