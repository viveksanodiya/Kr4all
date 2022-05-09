package Final_demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.LoginPageObject;
import PageObjects.PatientRegistrationList;
import PageObjects.RegistrationPageObj;
import PageObjects.patientRegistration;
import resources.Base_class1;

public class Homepage extends Base_class1 {
	@Test
	public void hompagenavigation() throws IOException, InterruptedException {
		driver = DriverInitilization();
		driver.get("https://telangana.swasthasamanvaya.in:8443/TCCC_BETA/#/login");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		LoginPageObject LPO = new LoginPageObject(driver);
		LPO.enterusername().sendKeys("superadmin");
		LPO.enterpassword().sendKeys("123");
		LPO.selectunit().click();
		Thread.sleep(2000);
		LPO.clickLogin().click();
	
Thread.sleep(2000);
		RegistrationPageObj RPO = new RegistrationPageObj(driver);
		RPO.EnterInRegistrationPage().click();

		patientRegistration PTR = new patientRegistration(driver);

		Select s = new Select(PTR.FrontName());
		s.selectByValue("6");
		//PTR.Tag().click();
		PTR.Firstname().sendKeys("supriyaa");
		PTR.Middlename().sendKeys("ji");
		PTR.Lastname().sendKeys("jii");
		PTR.RadioButton().click();
		PTR.Selectyear().sendKeys("1999");
		PTR.SelectMonth().sendKeys("2");
		PTR.SelectDay().sendKeys("10");
		//PTR.SelectGender().click();\
		Select g = new Select(PTR.SelectGender());
		g.selectByIndex(2);
		//PTR.SelectTag().click();
		PTR.MobileNumber().sendKeys("6691819191");
		PTR.STDCode().sendKeys("00000");
		PTR.Phonenumber().sendKeys("1234693");
		// PTR.Email().sendKeys("vviv@yahoo.com");
		PTR.Address().sendKeys("jabalpur");
		Thread.sleep(4000);
		PTR.SubmitNext().click();
		
		
		PatientRegistrationList PRL = new PatientRegistrationList(driver);
		
        PRL.ClickOnOpd().click();
	}

}
