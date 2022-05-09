package com.modifiers;

public class nonaccess_child extends accessmodifiers {
	public void data() {
		System.out.println("im non access");
	}
	public static void main(String[] args) {
		nonaccess_child a = new nonaccess_child();

		a.data();
		a.method1();
		

	}
}
