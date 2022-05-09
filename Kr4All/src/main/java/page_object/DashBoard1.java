package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard1 {
public WebDriver driver;
	
	By Home = By.xpath("//img[@class='img-responsive']");
	By Dashboard = By.xpath("//i[@class='fas fa-lg fa-th-large']");
	By Unit = By.xpath("//select[@name='unit']");
	By TimeDuration = By.xpath("//select[@name='duration']");
	
	By Configuration = By.xpath("(//i[@id='rightIcon'])[1]");
	
	// unit details and adding new units
	By searchunit = By.xpath("//input[@placeholder='Search unit...']");
	By addunitButton = By.xpath("//button[@class='add-btn']");
	
	
	
	By Department = By.xpath("(//a[@class='nav-item'])[2]");
	By searchdepartment = By.xpath("//input[@placeholder='Search department...']");
	By departmentUnit = By.xpath("//select[@class='form-control rounded']");
	By subdepartment = By.xpath("//a[@class='nav-item active']");
	By searchsubdepart = By.xpath("//input[@placeholder='Search sub_department...']");
	By subdepartUnit= By.xpath("//select[@class='form-control rounded'])[1]");
	By subdepartDepartment = By.xpath("(//select[@class='form-control rounded'])[2]");
	
	By addbutton = By.xpath("//button[@class='add-btn']");
	
	
	public DashBoard1(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickOnHome() {
		return driver.findElement(Home);
	}
	
	public WebElement clickOnDashboard() {
		return driver.findElement(Dashboard);
	}
	
	public WebElement clickOnUnit() {
		return driver.findElement(Unit);
	}
	
	public WebElement clickOnTimeDuration() {
		return driver.findElement(TimeDuration);
	}
	
	public WebElement clickOnConfiguration()
	{
		return driver.findElement(Configuration);
		
	}
	
	public WebElement searchunit()
	{
		return driver.findElement(searchunit);
		
	}
}
