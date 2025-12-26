package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
public LoginPage (WebDriver driver) {
	super(driver);}
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	WebElement password;
	@FindBy(xpath="//button [normalize-space()='Login']")
	WebElement loginbtn;
	@FindBy(xpath="//h6[normalize-space()='Dashboard']")
	WebElement dashboard;
	public void enterUserName(String uName) {
		username.sendKeys(uName);
	}
	public void enterPassword(String pwd) {
	password.sendKeys(pwd);
	}
    public void clickonLoginbtn() {
    	loginbtn.click();
    }
    public String verifyLoginPage() {
    	return dashboard.getText();
    }
}
