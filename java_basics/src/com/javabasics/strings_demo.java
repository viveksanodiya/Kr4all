package com.javabasics;

public class strings_demo {
	public static void main(String[] args) {
		String a = "my name is vivek";
		System.out.println(a.length());

		// upper case and lower case
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());

		// substrings find

		System.out.println(a.substring(0));
		System.out.println(a.substring(0, 10));
		System.out.println(a.subSequence(0, 8));
		System.out.println(a.replace('v', 'a'));
		System.out.println(a.replaceAll("name", "work"));

		String t = "my name is \"vivek\" sanodiya";
		System.out.println(t);

//this \ character is called backslash character

		String k = "this \\ character is called backslash character";
		System.out.println(k);

// home work equals
//contains 
// trim

		String fa = "im in pune"; // equal(compare the two string)
		String fb = "im in seoni";

		System.out.println(fa.equals(fa));
		System.out.println(fa.equalsIgnoreCase(fa));
		System.out.println(fb.contentEquals(fa));
		System.out.println(fb.contentEquals("im in seoni"));

		String ab = "taj mehal in agara"; // contains(find substrings in 2 strings)
		String ba = "taj mehal in agara";
		System.out.println(ab.contains(ba));
		System.out.println(ba.contentEquals(ab));
		System.out.println(ab.contentEquals("taj mehal in agara"));

		// trim(remove white space)
		String cd = " hello sir";
		System.out.println(cd.trim());
		System.out.println(cd + "/hello sir");
	}

}
