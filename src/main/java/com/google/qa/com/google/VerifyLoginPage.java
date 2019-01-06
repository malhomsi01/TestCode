package com.google.qa.com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLoginPage {

	@Test
	
	public void verifyLogin() {
		
	System.setProperty("webdriver.chrome.driver", "\\c:\\AUTO\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	
	LoginPage login = new LoginPage(driver);
	
	login.typeUserName();
	login.typePassword();
	login.clickLoginBtn();
	
	driver.quit();
		
	}
}
