package MyPackage;

public class TryCatchFinally {
	public static  void main(String [] args)
	{
	try
	{
	int a=200, b=0, c;
	c=a/b;
	System.out.println(c);
	}
	/*catch(Exception e)
	{
	System.out.println(e);	
	}*/
	finally
	{
		System.out.println("im in finally");
	}
	System.out.println("hello");
	}

}
