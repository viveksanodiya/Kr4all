package com.abstraction;

public class with_interfacechild implements with_interface {
	public static void main(String[] args) {
		with_interfacechild a=new with_interfacechild();
		a.method1();
		a.method2();
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
		
	}

}
