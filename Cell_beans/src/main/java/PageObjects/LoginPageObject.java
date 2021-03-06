package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;

	By username = By.xpath("//input[@placeholder='Username']");
	By Password = By.xpath("//input[@type='password']");
	By unitname = By.xpath("//option[@value='2']");

	By clicklogin = By.xpath("//button[normalize-space()='Sign In']");

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterusername() {
		return driver.findElement(username);
	}

	public WebElement enterpassword() {
		return driver.findElement(Password);
	}
public WebElement selectunit()
{
	return driver.findElement(unitname);
	}
	
	
	public WebElement clickLogin() {
		return driver.findElement(clicklogin);
	}
}
