package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnBoarding1 {
public WebDriver driver;
	
	By OnBoarding = By.xpath("//i[@class='fas fa-lg fa-door-open']");
	By ClickNext = By.xpath("//button[@type='submit']");
	By ResetPassword = By.xpath("//span[normalize-space()='Reset Password']");
	By OldPassword = By.xpath("//input[@name='oldPassword']");
	By NewPassword = By.xpath("//input[@name='staffPassword']");
	By ClickSubmit = By.xpath("//button[@type='button']");
	By ClickKr4All = By.xpath("//img[@class='img-responsive']");
	
	
	
	 public OnBoarding1(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement clickOnBoarding() {
			return driver.findElement(OnBoarding);
		}
		public WebElement ClickNext()
		{
			return driver.findElement(ClickNext);
			
		}
		public WebElement ClickResetPassword() {
			return driver.findElement(ResetPassword);
		}
		public WebElement OldPassword() {
			return driver.findElement(OldPassword);
		}
		public WebElement NewPassword() {
			return driver.findElement(NewPassword);
		}
		
		public WebElement ClickSubmit()
		{
			return driver.findElement(ClickSubmit);
			
	

}
		public WebElement ClickKr4All ()
		{
			return driver.findElement(ClickKr4All);
}

}
