import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleMaps {
	
	WebDriver driver=GoogleSearchTest.driver;
	
	@Test(groups={"smoke"})
	public void GoogleMaps()
	{
		

	driver.findElement(By.linkText("Maps")).click();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.navigate().to("https://www.google.co.in");
	driver.close();
	}
}
