package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
public WebDriver driver;
@Parameters("browser")
@BeforeClass
public void setUp(@Optional("chrome") String Browser) {
	if(Browser.equalsIgnoreCase("chrome"))
driver=new ChromeDriver();
	else if(Browser.equalsIgnoreCase("firefox"))
		driver= new FirefoxDriver();
	else if(Browser.equalsIgnoreCase("edge"))
		driver= new EdgeDriver();
	else 
		driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@AfterClass
public void tearDown() {
	driver.close();
}

}
