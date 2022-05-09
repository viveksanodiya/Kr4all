package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QueuePage1 {
	
public WebDriver driver;
	
	By AQueue = By.xpath("//i[@class='fas fa-lg fa-users']");
	By SearchQueue = By.xpath("//input[@placeholder='Search Queue...']");
	
	
	
	public QueuePage1 (WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickOnQueue() {
		return driver.findElement(AQueue);
	}

}
