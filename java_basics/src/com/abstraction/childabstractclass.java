package com.abstraction;
public class childabstractclass extends withabstractclass {
public void method() {
	System.out.println("abstract method");
}
public static void main(String[] args) {
	
	
	childabstractclass a= new childabstractclass();
	a.method();
	a.method2();
}
}
