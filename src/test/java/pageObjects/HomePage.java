package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);}
	@FindBy(xpath="//img [@alt='client brand banner']")
	WebElement orange_logo;
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchbtn;
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminbtn;
	@FindBy(xpath="//span [text()='PIM']")
	WebElement pimbtn;
	@FindBy(xpath="//span[text()='Leave']")
	WebElement leavebtn;
	@FindBy(xpath="//span[text()='Time']")
	WebElement timebtn;
	@FindBy(xpath="//span[text()='Recruitment']")
	WebElement recruitmentbtn;
	public boolean orangelogo_chk() {
		return orange_logo.isDisplayed();
	}
	public void searchbtn_click() {
		searchbtn.click();
	}
	public void adminbtn_click() {
		adminbtn.click();
	}
	public void pimbtn_click() {
		pimbtn.click();
	}
	public void leavebtn_click() {
		leavebtn.click();
	}
	public void timebtn_click() {
		timebtn.click();
	}
	public void recruitmentbtn_click() {
		recruitmentbtn.click();
	}
	}
