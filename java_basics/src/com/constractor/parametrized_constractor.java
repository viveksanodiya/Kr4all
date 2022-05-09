package com.constractor;

public class parametrized_constractor {
	//public parametrized_constractor()
	
		int age;
		String name;
		public parametrized_constractor(String newname, int newage)
		{
			this.age=newage;
			this.name=newname;
			System.out.println(age+""+ name);
		}
	
	public static void main(String[] args)
	{
		parametrized_constractor a= new parametrized_constractor ("vivek",28);
	}

}
