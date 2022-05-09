package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageMasters {
	public WebDriver driver;
	
	By masters =  By.xpath("//i[@class='fas fa-lg fa-cogs']");
	
	By allergies = By.xpath("(//a[@title='Allergy'])[1]");
	
	By ClickOnDots = By.xpath("(//button[@type='button'])[1]");
	By View = By.xpath("(//a[normalize-space()='View'])[1]");
	By goBack = By.xpath("//button[@class='pull-right btn btn-primary goBackBtn']");
	By ClickOnDots2 = By.xpath("(//button[@type='button'])[1]");
	By EditButton = By.xpath("(//a[normalize-space()='Edit'])[1]");
	By canclebutton = By.xpath("//button[@type='button']");
	By ClickOnDots3 = By.xpath("(//button[@type='button'])[1]");
	By Delete = By.xpath("(//a[normalize-space()='Delete'])[1]");
	By ClickNoButton = By.xpath("//span[normalize-space()='No']");
	
	
	
	
	public HomePageMasters(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement ClickMasters() {
		return driver.findElement(masters);
	}
	
		public WebElement ClickAllergies()
		{
			return driver.findElement(allergies);
		}
		public WebElement ClickOnDots1()
		{
			return driver.findElement(ClickOnDots);
		}
		public WebElement ClickView()
		{
			return driver.findElement(View);
		}
		public WebElement ClickgoBack()
		{
			return driver.findElement(goBack);
		}
		public WebElement ClickOnDots2()
		{
			return driver.findElement(ClickOnDots2);
		}
		public WebElement ClickOnEditButton()
		{
			return driver.findElement(EditButton);
		}
		public WebElement Canclebutton()
		{
			return driver.findElement(canclebutton);
		}
		public WebElement ClickOnDots3()
		{
			return driver.findElement(ClickOnDots3);
		}
		public WebElement ClickDelete()
		{
			return driver.findElement(Delete);
		}
		public WebElement ClickNoButton()
		{
			return driver.findElement(ClickNoButton);
		}

}
