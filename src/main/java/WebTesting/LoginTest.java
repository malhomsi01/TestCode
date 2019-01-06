package WebTesting;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.qa.com.google.LoginPage;

import junit.framework.Assert;

public class LoginTest extends TestBase {

	// import all classes
	HomePage homepage;
	LoginPage loginpage;

	// constructor

	public LoginTest() {

		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();

	}

	@Test(priority = 1)

	public void loginPageTitle() {
		String title = loginpage.validateLoginPage();
		Assert.assertEquals(title, "Login - TechFios Test Application - Billing");
	}

	/*
	 * @Test(priority = 2) public void loginpageOpened() { loginpage.logo(); }
	 */

	@Test(priority = 2)
	public void filloutloginField() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}



