package com.encapsulation;

public class encapsulationDemo {
	// public String name; // data is not secure

	private String Newname;

	public String getName() // to get the setname
	{
		return Newname;
	}

	public void setName(String name) // to set the name
	{
		this.Newname = name;
	}
}
