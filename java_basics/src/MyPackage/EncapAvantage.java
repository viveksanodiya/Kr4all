package MyPackage;

public class EncapAvantage {
	private int Emp_id;
	public void setemp_id(int Emp_id1) {
		Emp_id=Emp_id1;
		
		
	}
	public int getEmp_id()
	{
		return Emp_id;
		
	} 
	public static void main(String[] args)
	{
		EncapAvantage EV= new EncapAvantage();
		EV.setemp_id(12345);
				System.out.println(EV.getEmp_id());
	}

}
