package com.collection;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> obj = new ArrayList<String>();
		obj.add("vivek");
		obj.add("vivek");
		obj.add("neeta");
		obj.add("vaishali");
		 System.out.println(obj);

		// obj.remove(1); // remove
		// obj.remove("lucky");
		// System.out.println(obj);
		 System.out.println(obj.size());
		//obj.get(2); //To access an element in the ArrayList
		// System.out.println(obj.get(3));
		// obj.set(2, "pankaj"); // To modify an element,
		// System.out.println(obj);
		// obj.clear(); //To remove all the elements in the ArrayList

		for(int i=0; i<obj.size(); i++) {           // for loop
			System.out.println(obj.get(i));
		
	//	for(String i: obj)    // for each loop
		{
		//	System.out.println(i);
			
			
		}
		}
	}}
