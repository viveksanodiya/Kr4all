package MyPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsHndle {
	void readfile () throws FileNotFoundException
	{
	FileInputStream fis =	new FileInputStream("d:/abc.txt");
	
	}
void savefile() throws FileNotFoundException
{
FileOutputStream fos = new	FileOutputStream("d:/xyz.txt");

}
class test
{
public static void main(String[] args)
{
	ThrowsHndle th= new ThrowsHndle();
	try {
		th.readfile();
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			System.out.println("hello");
}
}
}
