package com.collection;

import java.util.HashMap;

public class hascollection {
	public static void main(String[] args) 
	{
		HashMap<String, String> obj= new HashMap<String, String>();
		obj.put("kaka","mumbai");
		obj.put("chacha","seoni");
		obj.put("sanata","maharastra");
		obj.put("lucky","mumbai");
	obj.put("chacha","chharisgarh");
	
		System.out.println(obj);
//System.out.println(obj.get("chacha"));
//obj.clear();
		for(String s:obj.keySet())
		{
			System.out.println(s);
		}
		for(String v:obj.values())
		{
			System.out.println(v);
		}
		 for(String w:obj.keySet())
		 {
			 System.out.println(w+""+obj.get(w));
			 
		 }
	}

}    
