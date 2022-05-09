package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QueuePage {
public WebDriver driver;
	
	By AQueue = By.xpath("//i[@class='fas fa-lg fa-users']");
	
	
	public QueuePage (WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickOnQueue() {
		return driver.findElement(AQueue);
	}
}
