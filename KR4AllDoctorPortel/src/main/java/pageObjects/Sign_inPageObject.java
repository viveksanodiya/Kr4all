package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_inPageObject {
public WebDriver driver;
	
	By username = By.xpath("//input[@placeholder='Username']");
	By Password = By.xpath("//input[@type='password']");
    By clicklogin = By.xpath("//button[@type='submit']");

    
    public Sign_inPageObject (WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterusername() {
		return driver.findElement(username);
	}

	public WebElement enterpassword() {
		return driver.findElement(Password);
	}
	
	public WebElement clickLogin() {
		return driver.findElement(clicklogin);
	}
}


