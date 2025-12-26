package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import pageObjects.LoginPage;
import testBase.TestBase;

public class Login_Test_001 extends TestBase {
	@Test
	public void verify_Account_Login() {
	LoginPage lp=new LoginPage(driver);
	lp.enterUserName("Admin");
	lp.enterPassword("admin123");
	lp.clickonLoginbtn();
	String confirmlogin=lp.verifyLoginPage();
	Assert.assertEquals(confirmlogin, "Dashboard");
	
	}

}
