package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class patientRegistration {
	public WebDriver driver;
	// Select frontName = new Select((WebElement)
	// By.xpath("(//select[@type='text'])[1]"));
	By frontName = By.xpath("(//select[@type='text'])[1]");
	//By Mrs = By.xpath("//option[@value='5']");
	By firstname = By.xpath("//input[@placeholder='First Name']");
	By middlename = By.xpath("//input[@placeholder='Middle Name']");
	By lastname = By.xpath("//input[@placeholder='Last Name']");
	By selectRadioButton = By.xpath("(//input[@name='selectedtype'])[2]");
	By year = By.xpath("//input[@placeholder='Year(s)']");
	By month = By.xpath("//input[@placeholder='Month(s)']");
	By day = By.xpath("//input[@placeholder='Day(s)']");
	By gender = By.name("gender");
	//By female = By.xpath("//option[normalize-space()='Female']");
	By mobilenumber = By.xpath("//input[@placeholder='Mobile No.']");
	By Stdcode = By.xpath("//input[@placeholder='STD']");
	By phone = By.xpath("//input[@placeholder='Phone']");
	// By email = By.xpath("input[placeholder='Email Id']");
	By address = By.xpath("//textarea[@style='text-transform: capitalize;']");
	By submit = By.cssSelector("button[type='submit']");

	public patientRegistration(WebDriver driver) {  
		this.driver = driver;

	}

	public WebElement FrontName() {
		return driver.findElement(frontName);

	}

	/*public WebElement Tag() {
		return driver.findElement(Mrs);

	}
*/
	public WebElement Firstname() {
		return driver.findElement(firstname);

	}

	public WebElement Middlename() {
		return driver.findElement(middlename);

	}

	public WebElement Lastname() {
		return driver.findElement(lastname);

	}

	public WebElement RadioButton() {
		return driver.findElement(selectRadioButton);

	}

	public WebElement Selectyear() {
		return driver.findElement(year);

	}

	public WebElement SelectMonth() {
		return driver.findElement(month);

	}

	public WebElement SelectDay() {
		return driver.findElement(day);

	}

	public WebElement SelectGender() {
		return driver.findElement(gender);

	}
/*
	public WebElement SelectTag() {
		return driver.findElement(female);

	}
*/
	public WebElement MobileNumber() {
		return driver.findElement(mobilenumber);

	}

	public WebElement STDCode() {
		return driver.findElement(Stdcode);

	}

	public WebElement Phonenumber() {
		return driver.findElement(phone);

	}

	/*
	 * public WebElement Email() { return driver.findElement(email);
	 * 
	 * }
	 */
	public WebElement Address() {
		return driver.findElement(address);

	}

	public WebElement SubmitNext() {
		return driver.findElement(submit);

	}

}
