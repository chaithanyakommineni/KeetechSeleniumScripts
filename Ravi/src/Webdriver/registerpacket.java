package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class registerpacket {
WebDriver driver;
@BeforeTest
public void Setup()
{
	driver=new FirefoxDriver();
	driver.get("https://www.packtpub.com/register");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@Test
public void Register()
{
	PacketRegister pr=new PacketRegister(driver);
	pr.Register("chaithanya@gmail.com", "chaitu", "nani", "123456", "123456");
}
}
