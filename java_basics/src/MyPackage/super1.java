package MyPackage;

public class super1 extends SuperKeyword
{
	int a=20;
	
	void show(int i)
	{
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
	super1 obj=new super1();
	obj.show(30);
			
	}


}
