package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OnBoarding {
	
public WebDriver driver;
	
	By OnBoarding = By.xpath("//i[@class='fas fa-lg fa-door-open']");
	By ResetPassword = By.xpath("//span[normalize-space()='Reset Password']");
	By Profile = By.xpath("//span[normalize-space()='Profile']");
	
	By YearOfExperiance = By.xpath("//input[@formcontrolname='staffExperienceInYears']");
	By Speciality = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[1]");
	By SpecialityENT = By.xpath("//span[normalize-space()='ENT']");
	
	By superspeciality = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[2]");
	By supSpecialityENT = By.xpath("//span[normalize-space()='ENT']");
	By Degree = By.xpath("//input[@formcontrolname='staffEducation']");
	By Language = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[3]");
	
	By languageEnglish = By.xpath("(//span[normalize-space()='English'])[1]");
	
	By Next = By.xpath("//button[normalize-space()='Next']");
	
	By Schedule = By.xpath("//span[normalize-space()='Schedule']");
	By Unit = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[1]");
	By selectUnit = By.xpath("//span[normalize-space()='Sahyadri Hospital Unit']");
	By conseltationtype = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[2]");
	By selectconseltation1 = By.xpath("//span[normalize-space()='In Person']");
	By duration = By.xpath("(//input[@name='dsConsultationDuration'])[1]");
	
	By selectDay = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[3]");
	

    By StartTime = By.xpath("(//input[@name='dsStartTime'])[1]");
    By StopTime = By.xpath("(//input[@name='dsEndTime'])[1]");
    By Add = By.xpath("//button[@class='submitId']");
	

	
	
	
	By Services = By.xpath("(//span[normalize-space()='Services'])[1]");
	By Documents = By.xpath("//span[normalize-space()='Documents']");
	By MedicalLicence = By.xpath("//input[@name='medicalLicence']");
	By Accreditation = By.xpath("(//input[@name='medicalLicence'])[2]");
	By IdentificationDocument = By.xpath("(//input[@name='medicalLicence'])[3]");
	By IdentificationNumber = By.xpath("(//input[@name='medicalLicence'])[4]");

	 public OnBoarding(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement clickOnBoarding() {
			return driver.findElement(OnBoarding);
		}
		public WebElement ClickResetPassword() {
			return driver.findElement(ResetPassword);
		}
		public WebElement clickProfile() {
			return driver.findElement(Profile);
		}
		
		public WebElement YearOfExperiance1() {
			return driver.findElement(YearOfExperiance);
		}
		
		public WebElement Speciality1() {
			return driver.findElement(Speciality);
		}
		
		public WebElement SpecialityByEnt()
		{

			return driver.findElement(SpecialityENT);
		}
		
		public WebElement superspeciality1() {
			return driver.findElement(superspeciality);
		}
		
		public WebElement SupSpecialityEnt1()
		{
			return driver.findElement(supSpecialityENT);
			
		}
		public WebElement Degree1()
		{
			return driver.findElement(Degree);
		}
		
		public WebElement Language1()
		{
			return driver.findElement(Language);
		}
		
		public WebElement Languageby()
		{
			return driver.findElement(languageEnglish);
		
			
		}
		
		public WebElement ClickOnNext()
		{
			return driver.findElement(Next);
			
		}
		public WebElement ClickSchedule() {
			return driver.findElement(Schedule);
		
		}
		
		public WebElement ClickUnit() {
			return driver.findElement(Unit);
		
		}
		
		public WebElement SelectUnit() {
			return driver.findElement(selectUnit);
		
		}
		
		public WebElement Conseltationtype() {
			return driver.findElement(conseltationtype);
		
		}
		
		public WebElement SelectConseltatio() {
			return driver.findElement(selectconseltation1);
		
		}
		
		public WebElement Clickduration() {
			return driver.findElement(duration);
		
		}
		
		public WebElement SelectDay() {
		
		
			return driver.findElement(selectDay);
		}
		
	
		public WebElement Starttime() {
			return driver.findElement(StartTime);
		
		}
		
		public WebElement EndTime() {
			return driver.findElement(StopTime);
		
		}
		
		public WebElement Add() {
			return driver.findElement(Add);
		
		}
		public WebElement clickServices() {
			return driver.findElement(Services);
		}
		public WebElement clickDocuments() {
			return driver.findElement(Documents);
		}
		
		public WebElement EntermedicalLicence() {
			return driver.findElement(MedicalLicence);
		}
		public WebElement EntermedicalAcccreditation() {
			return driver.findElement(Accreditation);
			
		}
		
		public WebElement EnterIdentificationDocument() {
			return driver.findElement(IdentificationDocument);
		}
		
		public WebElement EnterIdentificationNumber() {
			return driver.findElement(IdentificationNumber);
		}
		
		
}
