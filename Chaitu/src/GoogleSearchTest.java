import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	public static	WebDriver driver=new FirefoxDriver();
	@Test(groups={"regression"})
	public void SearchText()
	{

		 
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.id("lst-ib"));
		search.clear();
		search.sendKeys("keetech");
		driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		
		String actualtest=driver.findElement(By.xpath("//*[@class='st']")).getText();
		String expectedtest="We, KEETECH Software Solutions, as an IT Services, Software Development, Web and Mobile App Development Firm, are here to help clients reach their goal ...";
		Assert.assertEquals(actualtest, expectedtest);	
	}
}
