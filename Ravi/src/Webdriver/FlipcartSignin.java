package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipcartSignin {
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void login()
	{
		FlipcartLogin l=new FlipcartLogin(driver);
		l.login("7396618327", "7396618327k");
		l.logout();
		
		
	}

}
