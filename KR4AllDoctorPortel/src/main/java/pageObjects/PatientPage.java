package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientPage {
	 public WebDriver driver;
	
	By PatientList = By.xpath("//i[@class='fas fa-lg fa-user-injured']");
	By SearchPatients = By.xpath("//input[@placeholder='Search patient...']");
	By  searchbydate = By.xpath("//select[@class='form-control rounded']");
	By AppointmentType = By.xpath("//select[@class='form-control rounded']");
	By AddButton = By.xpath("//button[@class='add-btn ng-star-inserted']");
	
	By Titile = By.xpath("(//button[@type='button'])[1]");
	By FirstName = By.xpath("//input[@name='patientFirstname']");
	By LastName = By.xpath("//input[@name='patientLastname']");
	By DOB = By.xpath("//input[@name='patientDob']");
	By BloodGroup = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[2]");
	By Gender = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[3]");
	By MobileNumber = By.xpath("//input[@name='patientMobile']");
	By EmailId = By.xpath("//input[@name='patientEmail']");
	By occupation = By.xpath("//input[@name='patientOccupation']");
	By IdProof = By.xpath("//input[@name='patientIdProofType']");
	By IDPROOFNUMBER = By.xpath("//input[@name='patientIdProofNumber']");
	By ADDRESS = By.xpath("//input[@name='patientAddress']");
	By LANDMARK = By.xpath("//input[@name='patientLandmark']");
	By patientPincode = By.xpath("//input[@name='patientPincode']");
	By Country = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[4]");
	By State = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[5]");
	By city = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[6]");
	By VisitType = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[7]");
	By Staff = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[8]");
	By CHIEFCOMPLENT = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[9]");
	By Source = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[10]");
	By UNIT = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[11]");
	By DEPARTMENT = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[12]");
	By SUBDEPARTMENT = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[13]");
	By REFERRALentry = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[14]");
	By REFERREDby = By.xpath("(//span[@class='p-button-icon pi pi-chevron-down'])[15]");
	By REASON = By.xpath("//div[@class='ql-editor ql-blank']");
    By CreateAccount = By.xpath("//button[@class='btn submitId']");
    By Logout = By.xpath("//i[@class='fas fa-lg fa-power-off']");
	
	public PatientPage (WebDriver driver) {
		this.driver = driver;
	}
	public WebElement PatientLists() {
		return driver.findElement(PatientList);
	}

	
	public WebElement clickOnSearchPatients() {
		return driver.findElement(SearchPatients);
	}
	public WebElement searchbydate() {
		return driver.findElement(searchbydate);
	}

	public WebElement AppointmentType() {
		return driver.findElement(AppointmentType);
	}

	public WebElement AddButton() {
		return driver.findElement(AddButton);
	}
	
	public WebElement Title() {
		return driver.findElement(Titile);
	}
	
	public WebElement FirstName() {
		return driver.findElement(FirstName);
	}
	
	public WebElement LastName() {
		return driver.findElement(LastName);
	}
	
	public WebElement DateOfBirth() {
		return driver.findElement(DOB);
	}
	
	public WebElement BloodGroup() {
		return driver.findElement(BloodGroup);
	}
	
	public WebElement Gender() {
		return driver.findElement(Gender);
	}
	
	public WebElement MobileNumber() {
		return driver.findElement(MobileNumber);
	}
	
	public WebElement EmailId() {
		return driver.findElement(EmailId);
	}
	
	public WebElement Occupation() {
		return driver.findElement(occupation);
	}
	
	public WebElement IdProof() {
		return driver.findElement(IdProof);
	}
	
	public WebElement IdProofNumber() {
		return driver.findElement(IDPROOFNUMBER);
	}
	
	public WebElement Address() {
		return driver.findElement(ADDRESS);
	}
	
	public WebElement Landmark() {
		return driver.findElement(LANDMARK);
	}
	
	public WebElement PatientPinCode() {
		return driver.findElement(patientPincode);
	}
	
	public WebElement country() {
		return driver.findElement(Country);
	}
	
	public WebElement State() {
		return driver.findElement(State);
	}
	
	public WebElement City() {
		return driver.findElement(city);
	}
	
	public WebElement VISITtype() {
		return driver.findElement(VisitType);
	}
	
	public WebElement Staff() {
		return driver.findElement(Staff);
	}
	
	public WebElement ChiefComplent() {
		return driver.findElement(CHIEFCOMPLENT);
	}
	
	public WebElement Source() {
		return driver.findElement(Source);
	}
	
	public WebElement Unit() {
		return driver.findElement(UNIT);
	}
	
	public WebElement Department() {
		return driver.findElement(DEPARTMENT);
	}
	
	public WebElement SubDepartment() {
		return driver.findElement(SUBDEPARTMENT);
	}
	
	public WebElement ReferralEntry() {
		return driver.findElement(REFERRALentry);
	}
	
	public WebElement ReferredBy() {
		return driver.findElement(REFERREDby);
	}
	
	public WebElement Reason() {
		return driver.findElement(REASON);
	}
	
	public WebElement CreateAccount()
	{
		return driver.findElement(CreateAccount);
		
	}
	public WebElement Logout()
	{
		return driver.findElement(Logout);
		
	}
}
