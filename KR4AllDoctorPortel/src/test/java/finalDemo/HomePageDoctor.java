package finalDemo;

import java.io.IOException;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.AppointmentsPage;
import pageObjects.Dasboard;
import pageObjects.OnBoarding;
import pageObjects.PatientPage;
import pageObjects.QueuePage;
import pageObjects.Sign_inPageObject;
import resources.BaseClass3;

public class HomePageDoctor extends BaseClass3 {
	@Test

	public void hompagenavigation() throws IOException, InterruptedException
	{
	    driver = DriverInitilization();
	    driver.manage().window().maximize();
		driver.get("https://demo.kr4all.com/kr4all_ui/");
		
		Sign_inPageObject spo = new Sign_inPageObject(driver);
		spo.enterusername().sendKeys("a_b");
		spo.enterpassword().sendKeys("pass");
		spo.clickLogin().click();
		Thread.sleep(3000);
	
		
		OnBoarding OB = new OnBoarding(driver);
		Thread.sleep(1000);
		OB.clickOnBoarding().click();
		Thread.sleep(1000);
		OB.ClickResetPassword().click();
		Thread.sleep(1000);
		OB.clickProfile().click();
		Thread.sleep(1000);
		OB.YearOfExperiance1().sendKeys("5");
		Thread.sleep(1000);
		OB.Speciality1().click();
		Thread.sleep(1000);
		OB.SpecialityByEnt().click();
		Thread.sleep(1000);
		OB.superspeciality1().click();
		Thread.sleep(1000);
		OB.SupSpecialityEnt1().click();
		Thread.sleep(1000);
		OB.Degree1().sendKeys("Mbbs");
		Thread.sleep(1000);
		OB.Language1().click();
		Thread.sleep(1000);
		OB.Languageby().click();
		Thread.sleep(1000);
		OB.ClickOnNext().click();
		Thread.sleep(1000);
		OB.ClickSchedule().click();
		Thread.sleep(1000);
		OB.ClickUnit().click();
		Thread.sleep(1000);
		OB.SelectUnit().click();
		
		
	    Thread.sleep(1000);
		OB.Conseltationtype().click();
		Thread.sleep(1000);
		OB.SelectConseltatio().click();
		Thread.sleep(1000);
		OB.Clickduration().sendKeys("10");
		Thread.sleep(1000);
		OB.SelectDay().click();
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
		OB.Starttime().sendKeys("12 01");
		Thread.sleep(1000);
		OB.EndTime().sendKeys("05 00");
		Thread.sleep(1000);
		OB.Add().click();
		
		Thread.sleep(1000);
		OB.clickServices().click();
		Thread.sleep(1000);
		OB.clickDocuments().click();
		
	OB.EntermedicalLicence().sendKeys("12345");
	OB.EntermedicalAcccreditation().sendKeys("54321");
	OB.EnterIdentificationDocument().sendKeys("abc12345");
	OB.EnterIdentificationNumber().sendKeys("85224548961544");
	
	Thread.sleep(200);
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	Dasboard db = new Dasboard(driver);
	db.clickOnHome().click();
	db.clickOnDashboard().click();
	db.clickOnUnit().click();
	Select s = new Select(db.clickOnTimeDuration());
	s.selectByIndex(1);
	
	QueuePage QP = new QueuePage(driver);
	QP.clickOnQueue().click();
	
	AppointmentsPage AP = new AppointmentsPage(driver);
	Thread.sleep(2000);
	AP.clickOnAppointment().click();
	Thread.sleep(2000);
	
	AP.clickOnSearchAppointment().sendKeys("Sanjay Patil");
	Thread.sleep(1000);
	AP.clickOndate().click();
	AP.clickSelectToday().click();
	//Select X = new Select(AP.clickOndate());
	//X.selectByIndex(2);
	//Thread.sleep(1000);
	//Select objselect=new Select(driver.findElement(By.xpath("(//select[@class='form-control rounded ng-valid ng-dirty ng-touched'])[1]")));                  
	//objselect.selectByVisibleText("Today");
	
	//Select C = new Select(AP.clickOnConsultationType());
	//C.selectByIndex(2);
	//Thread.sleep(1000);
	AP.clickOnConsultationType().click();
	
	AP.ConsultationTypeAll().click();
	
	Select B = new Select(AP.clickOnStatus());
	B.selectByVisibleText("Booked");
	Thread.sleep(1000);
	
	Select i = new Select(AP.clickOnInvoice());
	i.selectByVisibleText("Paid");
	
	
	AP.clickOnAddButton().click();
	AP.AddPatient().click();
	Thread.sleep(4000);
	List<WebElement> patient= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<patient.size(); j++)
	{
		String value = patient.get(j).getText();
		if(value.equalsIgnoreCase("Sanjay Patil")) {
			patient.get(j).click();
		break;
	}
	}
	Thread.sleep(1000);
	AP.SelectVisitType().click();
	
	Thread.sleep(1000);
	List<WebElement> visit= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<visit.size(); j++)
	{
		String value = visit.get(j).getText();
		if(value.equalsIgnoreCase("Video")) {
			visit.get(j).click();
		break;
	}
	}
	Thread.sleep(2000);
	AP.SelectDate().click();
	
	List<WebElement> elements= driver.findElements(By.xpath("//span[@draggable='false']"));
	for(int k=0; k<elements.size(); k++)
	{
		String value = elements.get(k).getText();
		if(value.equalsIgnoreCase("20")) {
		elements.get(k).click();
		break;
	}
	}
	Thread.sleep(2000);
	AP.selectTime().sendKeys("05:00");
	
	AP.selectslot().sendKeys("1");
	
	AP.selectServices().click();
	
	Thread.sleep(2000);
	List<WebElement> service= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<service.size(); j++)
	{
		String value = service.get(j).getText();
		if(value.equalsIgnoreCase("CBC")) {
			service.get(j).click();
		break;
	}
	}
	
	AP.SelectStaff().click();
	Thread.sleep(2000);
	List<WebElement> staff= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<staff.size(); j++)
	{
		String value = staff.get(j).getText();
		if(value.equalsIgnoreCase("Lakshmi Kiruba")) {
			staff.get(j).click();
		break;
	}
	}
	
	AP.appointmentStatus().click();
	Thread.sleep(2000);
	List<WebElement> appstatus= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<appstatus.size(); j++)
	{
		String value = appstatus.get(j).getText();
		if(value.equalsIgnoreCase("Completed")) {
			appstatus.get(j).click();
		break;
	}
	}
	Thread.sleep(1000);
  AP.OrderId().sendKeys("CBHI1234");
  
  Thread.sleep(1000);
  
  AP.SelectClient().click();
  Thread.sleep(2000);
	List<WebElement> Client= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<Client.size(); j++)
	{
		String value = Client.get(j).getText();
		if(value.equalsIgnoreCase("Synechron")) {
			Client.get(j).click();
		break;
	}
	}
	
	AP.SelectUnit().click();
	
	Thread.sleep(2000);
	List<WebElement> unit= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<unit.size(); j++)
	{
		String value = unit.get(j).getText();
		if(value.equalsIgnoreCase("Oftophorn")) {
			unit.get(j).click();
		break;
	}
	}
	
	AP.SelectSpeciality().click(); 
	
	Thread.sleep(2000);
	List<WebElement> speciality= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<speciality.size(); j++)
	{
		String value = speciality.get(j).getText();
		if(value.equalsIgnoreCase("Pediatric")) {
			speciality.get(j).click();
		break;
	}
	}
	
	AP.clickonSubmit().click(); 
	
	PatientPage pp = new PatientPage(driver);
	Thread.sleep(2000);
	pp.PatientLists().click();
	Thread.sleep(2000);
	pp.clickOnSearchPatients().sendKeys("Nikhil Kadam");
	
	Select S = new Select(pp.searchbydate());
	S.selectByValue("2");
	
	Select A = new Select(pp.AppointmentType());
	A.selectByValue("0");
			
		pp.AddButton().click();
		
	pp.Title().click();
	Thread.sleep(2000);
	List<WebElement> Title= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<Title.size(); j++)
	{
		String value = Title.get(j).getText();
		if(value.equalsIgnoreCase("Mr.")) {
			Title.get(j).click();
		break;
	}
	}
	
	pp.FirstName().sendKeys("Cell");
	pp.LastName().sendKeys("beans");
	
	pp.DateOfBirth().click();
	
	List<WebElement> DOB= driver.findElements(By.xpath("//span[@draggable='false']"));
	for(int k=0; k<DOB.size(); k++)
	{
		String value = DOB.get(k).getText();
		if(value.equalsIgnoreCase("20")) {
			DOB.get(k).click();
		break;
	}
	}
	
	pp.BloodGroup().click();
	
	Thread.sleep(2000);
	List<WebElement> Bloodgroup= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<Bloodgroup.size(); j++)
	{
		String value = Bloodgroup.get(j).getText();
		if(value.equalsIgnoreCase("A+")) {
			Bloodgroup.get(j).click();
		break;
	}
	}
	
	pp.Gender().click();

	Thread.sleep(2000);
	List<WebElement> Gender= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<Gender.size(); j++)
	{
		String value = Gender.get(j).getText();
		if(value.equalsIgnoreCase("Male")) {
			Gender.get(j).click();
		break;
	}
	}
	
	pp.MobileNumber().sendKeys("9179040477");
	pp.EmailId().sendKeys("cllbeans@gmail.com");
	pp.Occupation().sendKeys("Developer");
	pp.IdProof().sendKeys("votar id");
	pp.IdProofNumber().sendKeys("vt123id");
	pp.Address().sendKeys("pune");
	pp.Landmark().sendKeys("Baner");
	pp.PatientPinCode().sendKeys("452001");
	
	pp.country().click();
	
	Thread.sleep(2000);
	List<WebElement> country= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<country.size(); j++)
	{
		String value = country.get(j).getText();
		if(value.equalsIgnoreCase("India")) {
			country.get(j).click();
		break;
	}
	}
	
	pp.State().click();
	
	
	Thread.sleep(2000);
	List<WebElement> State= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<country.size(); j++)
	{
		String value = State.get(j).getText();
		if(value.equalsIgnoreCase("Maharashtra")) {
			State.get(j).click();
		break;
	}
	}
	
	pp.City().click();
	
	Thread.sleep(2000);
	List<WebElement> City= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<country.size(); j++)
	{
		String value = City.get(j).getText();
		if(value.equalsIgnoreCase("Pune")) {
			City.get(j).click();
		break;
	}
	}
	
	pp.VISITtype().click();
	
	
	Thread.sleep(2000);
	List<WebElement> VISITtype= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<VISITtype.size(); j++)
	{
		String value = VISITtype.get(j).getText();
		if(value.equalsIgnoreCase("Video")) {
			VISITtype.get(j).click();
		break;
	}
	}
	
	pp.Staff().click();
	
	
	Thread.sleep(2000);
	List<WebElement> Staff= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<Staff.size(); j++)
	{
		String value = Staff.get(j).getText();
		if(value.equalsIgnoreCase("Saagar Pawar")) {
			Staff.get(j).click();
		break;
	}
	}
	
	pp.ChiefComplent().click();
	
	
	Thread.sleep(2000);
	List<WebElement>ChiefComplent= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<ChiefComplent.size(); j++)
	{
		String value = ChiefComplent.get(j).getText();
		if(value.equalsIgnoreCase("Muscle Pain")) {
			ChiefComplent.get(j).click();
		break;
	}
	}
	
	pp.Source().click();
	
	
	Thread.sleep(2000);
	List<WebElement>Source= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<Source.size(); j++)
	{
		String value = Source.get(j).getText();
		if(value.equalsIgnoreCase("Mobile App")) {
			Source.get(j).click();
		break;
	}
	}
	
	pp.Unit().click();
	
	Thread.sleep(2000);
	List<WebElement>Unit= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<Unit.size(); j++)
	{
		String value = Unit.get(j).getText();
		if(value.equalsIgnoreCase("Fast Card")) {
			Unit.get(j).click();
		break;
	}
	}
	
	pp.Department().click();
	
	

	Thread.sleep(2000);
	List<WebElement>Department= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<Department.size(); j++)
	{
		String value = Department.get(j).getText();
		if(value.equalsIgnoreCase("Tele Consultation")) {
			Department.get(j).click();
		break;
	}
	}
	
	
	pp.SubDepartment().click();
	
	Thread.sleep(2000);
	List<WebElement>SubDepartment= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<SubDepartment.size(); j++)
	{
		String value = SubDepartment.get(j).getText();
		if(value.equalsIgnoreCase("Tele Consultation  SD")) {
			SubDepartment.get(j).click();
		break;
	}
	}
	
	pp.ReferralEntry().click();
	
	Thread.sleep(2000);
	List<WebElement>ReferralEntry= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<ReferralEntry.size(); j++)
	{
		String value = ReferralEntry.get(j).getText();
		if(value.equalsIgnoreCase("Test")) {
			ReferralEntry.get(j).click();
		break;
	}
	}
	
	pp.ReferredBy().click();
	
	Thread.sleep(2000);
	List<WebElement>ReferredBy= driver.findElements(By.xpath("//li[@role='option']"));
	for(int j =0; j<ReferredBy.size(); j++)
	{
		String value = ReferredBy.get(j).getText();
		if(value.equalsIgnoreCase("Test Test")) {
			ReferredBy.get(j).click();
		break;
	}
	}
	
	pp.Reason().sendKeys("cell beans healthcare pvt. ltd");
	
	pp.CreateAccount().click();
	
	pp.Logout().click();
	
}
}