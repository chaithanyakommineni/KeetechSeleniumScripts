package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PLogin {
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.packtpub.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void PacketSignin()
	{
		PacketpubLogin p=new PacketpubLogin(driver);
		p.login("umamahesh.kommineni@gmail.com","9490061573ku", "selenium");
	
	}

}
