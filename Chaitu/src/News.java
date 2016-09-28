import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class News {

	WebDriver driver=GoogleSearchTest.driver;

@Test(groups={"smoke","regression"})
public void news()
{
	
	driver.findElement(By.linkText("News")).click();
	driver.findElement(By.partialLinkText("Friday: $99 iPhone with case,")).click();
	WebElement search1=driver.findElement(By.id("primarySearch"));
	search1.clear();
	search1.sendKeys("police");
	//driver.findElement(By.xpath(".//*[@id='primary']/form/div/button]")).click();
	driver.findElement(By.className("searchButton")).click();
	//driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/h3/a")).click();
	
	/*Alert alert=driver.switchTo().alert();
	System.out.println("alert");
	alert.accept();
	driver.findElement(By.className("closeFlyoutPromo")).click();*/
	//driver.findElement(By.linkText("News")).click();
	//driver.findElement(By.xpath(".//*[@type='submit']")).click();
	//driver.navigate().to("https://www.google.co.in/search?q=keetech&biw=1366&bih=657&tbm=nws&source=lnms&sa=X&ved=0ahUKEwiW3a7zz7HOAhVEuI8KHe8sD20Q_AUICigD&dpr=1");
	/*String actualtest=driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/div/div[2]/span/em")).getText();
	String expectedtest="welcome";
	Assert.assertEquals(actualtest, expectedtest);*/
}
}