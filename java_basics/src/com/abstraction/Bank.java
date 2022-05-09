package com.abstraction;

abstract class Bank {
	abstract int getRateOfInterest();

}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
		
	}

}

class PNB extends Bank {
	int getRateOfInterest() {
	return 9;
	}
}

class TestBank {

	public static void main(String[] agrs) {
		Bank b;
		b = new SBI();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
		b = new PNB();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
	}
}