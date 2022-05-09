package demo1;

public class Employee {
	int emp_id;
	String Name;
	static String Company="xyz";
	
	
	Employee(int emp_id, String Name)
	 { 
		 this.emp_id= emp_id;
		 this.Name= Name;
		
		 
		 
		 
	 }
	void display() {
	 System.out.println(emp_id+" "+Name+" "+Company);
}

public static void main(String[] args)
{
	Employee e1= new Employee(123, "vivek");
	e1.display();
	Employee e2= new Employee(456, "pankaj");
	e2.display();
	
	}
}  