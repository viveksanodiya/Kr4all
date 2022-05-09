package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientRegistrationList {
	public WebDriver driver;
	By OPD = By.xpath("//button[@title='OPD']");
	
	public PatientRegistrationList (WebDriver driver)
	{
		this.driver= driver;
		
		
		
	}
	public WebElement ClickOnOpd()
	{
		return driver.findElement(OPD);
		
	}

}
