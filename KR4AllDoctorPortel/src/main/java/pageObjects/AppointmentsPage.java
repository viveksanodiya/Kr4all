package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentsPage {
	
	public WebDriver driver;
	
	By Appointment = By.xpath("//a[@title='Appointments']");
	By SearchAppointment = By.xpath("(//input[@placeholder='Search appointment...'])[1]");
	By date = By.xpath("//div[@class='input']");
	By SelectToday = By.xpath("//option[normalize-space()='Today']");
	By ConsultationType = By.xpath("(//div[@class='input'])[2]");
	
	By ConsultationAll = By.xpath("(//option[@value='0'][normalize-space()='All'])[1]");
	By Status = By.xpath("(//select[@class='form-control rounded'])[1]");
	By Invoice = By.xpath("(//select[@class='form-control rounded'])[2]");
	
	
	
   By addbutton = By.xpath("//button[@class='add-btn']");
  
   By patient = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[1]");
   By visitType = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[2]");
   By calender = By.xpath("//input[@name='appointmentDate']");
   By TimeSelect = By.xpath("//input[@name='appointmentTime']");
   By Slot = By.xpath("//input[@name='appointmentSlot']");
   By service = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[3]");
   By staff = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[4]");
   By AppointmentStatus = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[5]");
   By OrderId = By.xpath("//input[@formcontrolname='appointmentOrderId']");
   By Client = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[6]");
   By unit = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[7]");
   By Speciality = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[8]");
   
   By Submit = By.xpath("//button[@type='submit']");
   

	public AppointmentsPage (WebDriver driver) {
		this.driver = driver;
	}
	public WebElement clickOnAppointment() {
		return driver.findElement(Appointment);
	}

	
	public WebElement clickOnSearchAppointment() {
		return driver.findElement(SearchAppointment);
	}

	
	public WebElement clickOndate() {
		return driver.findElement(date);
	}

	public WebElement clickSelectToday ()
	{
		return driver.findElement(SelectToday);
		
	}
	
	public WebElement clickOnConsultationType() {
		return driver.findElement(ConsultationType);
	}
  
	public WebElement ConsultationTypeAll() {
		return driver.findElement(ConsultationAll);
	}
	
	public WebElement clickOnStatus() {
		return driver.findElement(Status);
	}

	
	public WebElement clickOnInvoice() {
		return driver.findElement(Invoice);
	}

	

	public WebElement clickOnAddButton() {
		return driver.findElement(addbutton);
	}

	

	public WebElement AddPatient() {
		return driver.findElement(patient);
	}

	

	public WebElement SelectVisitType() {
		return driver.findElement(visitType);
	}

	

	public WebElement SelectDate() {
		return driver.findElement(calender);
	}

	

	public WebElement selectTime() {
		return driver.findElement(TimeSelect);
	}

	public WebElement selectslot() {
		return driver.findElement(Slot);
	}


	public WebElement selectServices() {
		return driver.findElement(service);
	}

	

	public WebElement SelectStaff() {
		return driver.findElement(staff);
	}

	

	public WebElement appointmentStatus() {
		return driver.findElement(AppointmentStatus);
	}

	

	public WebElement OrderId() {
		return driver.findElement(OrderId);
	}

	

	public WebElement SelectClient() {
		return driver.findElement(Client);
	}

	

	public WebElement SelectUnit() {
		return driver.findElement(unit);
	}

	

	public WebElement SelectSpeciality() {
		return driver.findElement(Speciality);
	}

	public WebElement clickonSubmit()
	{
		return driver.findElement(Submit);
		
	}
	

}
