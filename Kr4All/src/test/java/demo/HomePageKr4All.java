package demo;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import page_object.DashBoard1;
import page_object.DashBoard2;
import page_object.HomePageMasters;
import page_object.LoginPageObject;
import page_object.OnBoarding1;
import page_object.OnBoarding2;
import resources.Base_class2;

public class HomePageKr4All extends Base_class2 {
@Test

	public void hompagenavigation() throws IOException, InterruptedException
	{
	    driver = DriverInitilization();
	    driver.manage().window().maximize();
		driver.get("https://cellbeans.in:8443/kr4all_ui/#/session/login");
		
		LoginPageObject lp = new LoginPageObject(driver);
		lp.enterusername().sendKeys("thesaagar");
		lp.enterpassword().sendKeys("pass");
		lp.clickLogin().click();
		
		Thread.sleep(3000);
		
		OnBoarding1 OB1 = new OnBoarding1(driver);
		OB1.clickOnBoarding().click();
		Thread.sleep(1000);
		OB1.ClickNext().click();
		Thread.sleep(2000);
		OB1.ClickResetPassword().click();
		OB1.OldPassword().sendKeys("pass");
		OB1.NewPassword().sendKeys("pass");
		OB1.ClickSubmit().click();
		
		
		OnBoarding2 OB2 = new OnBoarding2(driver);
		Thread.sleep(1000);
		OB2.clickOnBoarding().click();
		Thread.sleep(2000);
		OB2.ClickResetPassword().click();
		OB2.OldPassword().sendKeys("pass");
		OB2.NewPassword().sendKeys("pass");
		OB2.ClickSubmit().click();
		Thread.sleep(1000);
		OB2.clickProfile().click();
		Thread.sleep(1000);
		OB2.YearOfExperiance1().sendKeys("5");
		Thread.sleep(1000);
		OB2.Speciality1().click();
		Thread.sleep(1000);
		OB2.SpecialityByEnt().click();
		Thread.sleep(1000);
		OB2.superspeciality1().click();
		Thread.sleep(1000);
		OB2.SupSpecialityEnt1().click();
		Thread.sleep(1000);
		OB2.Degree1().sendKeys("Mbbs");
		Thread.sleep(1000);
		OB2.Language1().click();
		Thread.sleep(1000);
		OB2.Languageby().click();
		Thread.sleep(1000);
		OB2.ClickOnNext().click();
		Thread.sleep(1000);
		OB2.ClickSchedule().click();
		Thread.sleep(1000);
		//OB2.ClickUnit().click();
		//Thread.sleep(1000);
		//OB2.SelectUnit().click();
		
		
	   // Thread.sleep(1000);
		OB2.Conseltationtype().click();
		Thread.sleep(1000);
		OB2.SelectConseltatio().click();
		Thread.sleep(1000);
		OB2.Clickduration().sendKeys("10");
		Thread.sleep(1000);
		OB2.SelectDay().click();
		Thread.sleep(2000);
		List<WebElement> element= driver.findElements(By.xpath("//li[@role='option']"));
		for(int i=0; i<element.size(); i++)
		{
			String value = element.get(i).getText();
			if(value.equalsIgnoreCase("Monday")) {
			element.get(i).click();
			break;
		}
		}
		
		Thread.sleep(1000);
		OB2.Starttime().sendKeys("12 01");
		Thread.sleep(1000);
		OB2.EndTime().sendKeys("05 00");
		Thread.sleep(1000);
		OB2.Add().click();
		
		Thread.sleep(1000);
		OB2.clickServices().click();
		Thread.sleep(1000);
		OB2.clickDocuments().click();
		
	OB2.EntermedicalLicence().sendKeys("12345");
	OB2.EntermedicalAcccreditation().sendKeys("54321");
	OB2.EnterIdentificationDocument().sendKeys("abc12345");
	OB2.EnterIdentificationNumber().sendKeys("85224548961544");
	OB2.ClickKr4All().click();
	
	Thread.sleep(1000);
	DashBoard1 db1 = new DashBoard1(driver);
	db1.clickOnHome().click();
	db1.clickOnDashboard().click();
	db1.clickOnUnit().click();
	Select s = new Select(db1.clickOnTimeDuration());
	s.selectByIndex(1);
	db1.clickOnConfiguration().click();
	
	
	Thread.sleep(1000);
	DashBoard2 db2 = new DashBoard2(driver);
	db2.clickOnHome().click();
	db2.clickOnDashboard().click();
	db2.clickOnUnit().click();
	Select t = new Select(db1.clickOnTimeDuration());
	t.selectByIndex(1);
		
	
		
	/*	HomePageMasters HPM = new HomePageMasters(driver);
		HPM.ClickMasters().click();
		Thread.sleep(1000);
		HPM.ClickAllergies().click();
		Thread.sleep(1000);
		HPM.ClickOnDots1().click();
		Thread.sleep(1000);
		HPM.ClickView().click();
		Thread.sleep(1000);
		HPM.ClickgoBack().click();
		Thread.sleep(1000);
		HPM.ClickOnDots2().click();
		Thread.sleep(1000);
		HPM.ClickOnEditButton().click();
		Thread.sleep(1000);
		HPM.Canclebutton().click();
		Thread.sleep(1000);
		HPM.ClickOnDots3().click();
		Thread.sleep(1000);
		HPM.ClickDelete().click();
		Thread.sleep(1000);
		HPM.ClickNoButton().click();*/
	
		

}
}