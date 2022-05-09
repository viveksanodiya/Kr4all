package com.collection;

import java.util.HashMap;

public class hasmap_demo {
	public static void main(String[] args) 
	{
		         // key value
		HashMap< String, String> obj=new HashMap< String, String>();
		obj.put("maharastra", "mumbai");
		obj.put("madhyapradesh", "bhopal");
		obj.put("uttarpradesh", "lakhnow");
		obj.put("goa", "paduchery");
		//System.out.println(obj);
		//System.out.println(obj.get("goa"));
		//obj.clear();
		//System.out.println(obj);
		
		for(String a:obj.keySet()){              // for key print
		
		System.out.println(a);
		}
	//for(String b:obj.values()) { // for printing value
		//	System.out.println(b);
			for(String c:obj.keySet()) {
				System.out.println(c+"" + obj.get(c));
		
			}
			
		
	}

}
