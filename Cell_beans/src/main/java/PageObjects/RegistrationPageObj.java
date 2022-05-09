package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base_class1;

public class RegistrationPageObj {
	public WebDriver driver;
	By RegistrationPage = By.xpath("//img[@src='assets/img/icons/Register.png']");
	
	public  RegistrationPageObj(WebDriver driver) {
		this.driver= driver;
		
	}
	public WebElement EnterInRegistrationPage()
	{
		return driver.findElement(RegistrationPage);
		
	}
	
	
	

}
