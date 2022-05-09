package com.polymorphism;

public class methodoverriding_axis {
	public void getratofintrest() {
		System.out.println("rate of intrest is 9");
	}
	public static void main(String[] args) {
		methodoverriding_axis a= new methodoverriding_axis();
		a.getratofintrest();
		method_overriding_sbi b=new method_overriding_sbi();
		
		b.getratofintrest();
		
	}}
