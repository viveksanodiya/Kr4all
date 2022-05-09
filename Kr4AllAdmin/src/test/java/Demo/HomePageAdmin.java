package Demo;

import java.io.IOException;

import org.junit.Test;

import PageObject.Click_OnBoarding;
import PageObject.SignINPageObject;
import Resources.Base_Class;

public class HomePageAdmin extends Base_Class {
	@Test
	public void hompagenavigation() throws IOException, InterruptedException
	{
	    driver = DriverInitilization();
	    driver.manage().window().maximize();
		driver.get("https://demo.kr4all.com/kr4all_ui/");
		
		SignINPageObject spo = new SignINPageObject(driver);
		spo.enterusername().sendKeys("akshay_patekar");
		spo.enterpassword().sendKeys("pass");
		spo.clickLogin().click();
		Thread.sleep(3000);
			
		
		Click_OnBoarding COB = new Click_OnBoarding(driver);
		Thread.sleep(1000);
		COB.clickOnBoarding().click();
		Thread.sleep(1000);
		COB.ClickNext().click();
		Thread.sleep(1000);
		COB.ClickResetPassword().click();
		COB.OldPassword().sendKeys("pass");
		COB.NewPassword().sendKeys("pass");
		COB.ClickSubmit().click();
		COB.ClickKr4All().click();

}
}