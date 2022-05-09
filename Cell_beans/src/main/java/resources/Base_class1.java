package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class1{
	public WebDriver driver;
	public WebDriver DriverInitilization() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\vivek\\eclipse-workspace\\Cell_beans\\src\\main\\java\\resources\\Data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
			driver= new ChromeDriver();
		
;			
		}
		else if(browsername.equals("Firefox"))
		{
			//Firefox driver code
		}
		else
		{
			// IE code
		}
	return driver;
		
		
	}
}

