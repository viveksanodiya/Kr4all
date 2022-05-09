package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_test {
	public WebDriver driver;

	@Test
	public void test1() throws Exception {
		System.out.println("im inside test1 | " + Thread.currentThread().getId());

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
	driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();

	}

	@Test
	public void test2() throws Exception {
		System.out.println("im inside test2 | " + Thread.currentThread().getId());

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.close();
	}
}
