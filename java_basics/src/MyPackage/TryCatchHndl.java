package MyPackage;
public class TryCatchHndl {
public static void main(String[] args) 
{
//FileInputStream fis = new FileInputStream("d:/abc.txt"); // compile time exception
//Class.forName("com.oops");
	try
	{
	int a=100, b=0, c;
	c=a/b;
	System.out.println(c); // its run time exception
	}
	catch(Exception e)
	{
	System.out.println(e);	
	System.out.println("you can not divide by zero");
	}
	System.out.println("hello");
	//String name= null;
	//System.out.println(name.length());   // unchacked or run time
	
	
}
}
