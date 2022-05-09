package com.basic;

public class method {
	// void method
	public void test1() {
		System.out.println("method1");
	}

	// static method

	public static void test2() {
		System.out.println("hello java");
	}

	// void method does not return anything
	public void test3() {
		System.out.println("hello baba");
	}

	// method with return type
	public static int test4() {
		int a = 5;
		return a;
	}
	 //this is parameterized method
	public void paraMethod(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	// main method
	public static void main(String[] args) {

		// how to create object
		// classname objectname = new class name();
		method obj = new method();
		obj.test1();
		test2();
		obj.test3();

	
		System.out.println(test4());
obj.paraMethod("vivek",28);
	}
}
