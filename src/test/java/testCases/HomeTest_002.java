package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.TestBase;

public class HomeTest_002 extends TestBase {
	@Test
	public void to_verify_home() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("Admin");
		lp.enterPassword("admin123");
		lp.clickonLoginbtn();
		HomePage hp = new HomePage(driver);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Assert.assertEquals(true, hp.orangelogo_chk());// toverify logo

		hp.adminbtn_click();
		hp.searchbtn_click();
		hp.pimbtn_click();
		hp.leavebtn_click();
		hp.timebtn_click();
		hp.recruitmentbtn_click();

	}

}
