import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mobile {
	WebDriver driver;
	@BeforeTest
	public void nokia()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.purpletalk.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void samsung()
	{
		driver.findElement(By.xpath("html/body/div/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.linkText("SR. SEO/ SEO TEAM LEAD")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[4]/p[1]/a/b")).click();
	}

}
