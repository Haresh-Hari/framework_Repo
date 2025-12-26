package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
/**
 * This is the generic method to access the Application
 * @author Mohana
 * @param driver,url
 * 
 */
public class SeleniumUtility {
	public void accessToApplication(WebDriver driver,String URl) {
		driver.get(URl);
	}

/**
 * This is the generic method for implicitlywait
 * @param driver
 * @param time
 */
public void implicitWait(WebDriver driver,int time) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
}
/**
 * This is the generic method to maximize
 * @param driver
 */
public void maximize(WebDriver driver) {
	driver.manage().window().maximize();
}
//DropDown
/**
 * This is the generic method to Select Dropdown by using Index
 * @param dropDown
 * @param index
 */
public void selectdropDownByIndex( WebElement dropDown,int index ) {
	Select sl= new Select(dropDown);
	sl.selectByIndex(index);
}
/**
 * This is the generic method to Select Dropdown by using Value
 * @param dropDown
 * @param value
 */
public void selectdropDownByValue(WebElement dropDown,String value ) {
	Select sl= new Select(dropDown);
	sl.selectByValue(value);
}
/**
 * This is the generic method to Select Dropdown by using VisibleText
 * @param dropDown
 * @param text
 */
public void selectdropDownByVisibleText(WebElement dropDown, String text) {
	Select sl= new Select(dropDown);
	sl.deselectByVisibleText(text);	
}
/**
 * This is the generic method to accept the Alert
 * @param driver
 */
//Handling Alert
public void acceptAlert(WebDriver driver){
	driver.switchTo().alert().accept();	}
/**
 * This is the generic method to dismiss the Alert
 * @param driver
 */
public void dismissAlert(WebDriver driver){
	driver.switchTo().alert().dismiss();	}
/**
 * This is the generic method to get the get Alert message
 * @param driver
 * @return
 */
public  String getAlertMessage(WebDriver driver){
	return driver.switchTo().alert().getText();	}
/**
 * This is the generic method to send the Message to Alert 
 * @param driver
 * @param data
 */
public void sendMessage(WebDriver driver,String data){
	driver.switchTo().alert().sendKeys(data);;	}
/**
 * This is a Generic method to mouseOvering
 * @param driver
 * @param targetEle
 */

//Mouse Actions
public void mouseHoveringAction(WebDriver driver,WebElement targetEle) {
	Actions act = new Actions(driver);
	act.moveToElement(targetEle).perform();
}
/**
 * This is the generic method Double click
 * @param driver
 * @param targetele
 */
public void doubleClickAction(WebDriver driver,WebElement targetele) {
	Actions act = new Actions(driver);
	act.doubleClick(targetele).perform();
}
/**
 * THis is the Generic method to Right click
 * @param driver
 *  @param targetele
 */
public void rightClick(WebDriver driver,WebElement targetele) {
	Actions act = new Actions(driver);
	act.contextClick(targetele).perform();
}
/**
 * This is the generic method to takeScreenshot of webpage
 * @param driver
 * @param ScreenshotName
 * @return
 * @throws IOException
 */
//Taking ScreenShot
public String captureWebpageScreenshot(WebDriver driver,String ScreenshotName ) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest= new File(".\\ScreenShot\\"+ScreenshotName+".png");
	Files.copy(src, dest);
	return dest.getAbsolutePath();//used for listeners
}}
