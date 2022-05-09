package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard2 {
	
public WebDriver driver;
	
	By Home = By.xpath("//img[@class='img-responsive']");
	By Dashboard = By.xpath("(//i[@class='fas fa-lg fa-th-large'])[2]");
	By Unit = By.xpath("//select[@name='unit']");
	By TimeDuration = By.xpath("//select[@name='duration']");
	
	public DashBoard2(WebDriver driver) {
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


}
