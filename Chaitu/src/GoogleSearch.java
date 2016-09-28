import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {
public static	
//WebDriver driver=new FirefoxDriver();
//System.setProperty("webdriver.chrome.driver","D:\\");

WebDriver driver=new ChromeDriver();

@BeforeClass
public void hi()
{
	System.out.println("welcome");
}
@BeforeTest
public void hello()
{
	System.out.println("keetech");
}
@BeforeSuite
public void wt()
{
	System.out.println("mrng");
	}

@Test
public void SearchText()
{
	 
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement search=driver.findElement(By.id("lst-ib"));
	search.clear();
	search.sendKeys("keetech");
	driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
	
	String actualtest=driver.findElement(By.xpath("//*[@class='st']")).getText();
	String expectedtest="We, KEETECH Software Solutions, as an IT Services, Software Development, Web and Mobile App Development Firm, are here to help clients reach their goal ...";
	Assert.assertEquals(actualtest, expectedtest);	
}
@AfterClass
public void add()
{
	System.out.println("software");
}
@AfterTest
public void sub()
{
	System.out.println("solutions");
}
@AfterSuite
public void ntg()
{
	System.out.println("excellent");
}
@Test
public void Maps()
{
driver.findElement(By.linkText("Maps")).click();
}
@Test
public void images()
{
	driver.findElement(By.linkText("Images")).click();
	driver.findElement(By.xpath(".//*[@id='rg_s']/div[1]/a/img")).click();
	
}
@Test
public void news()
{
	driver.findElement(By.linkText("News")).click();
	driver.findElement(By.partialLinkText("Friday: $99 iPhone with case,")).click();
	WebElement search1=driver.findElement(By.id("primarySearch"));
	search1.clear();
	search1.sendKeys("police");
	//driver.findElement(By.xpath(".//*[@id='primary']/form/div/button]")).click();
	driver.findElement(By.className("searchButton")).click();
	driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/h3/a")).click();
	
	Alert alert=driver.switchTo().alert();
	System.out.println("alert");
	alert.accept();
	driver.findElement(By.className("closeFlyoutPromo")).click();
	driver.findElement(By.linkText("News")).click();
	driver.findElement(By.xpath(".//*[@type='submit']")).click();
	driver.navigate().to("https://www.google.co.in/search?q=keetech&biw=1366&bih=657&tbm=nws&source=lnms&sa=X&ved=0ahUKEwiW3a7zz7HOAhVEuI8KHe8sD20Q_AUICigD&dpr=1");
	String actualtest=driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/div/div[2]/span/em")).getText();
	String expectedtest="welcome";
	Assert.assertEquals(actualtest, expectedtest);
}
@Test
public void videos()
{
	driver.findElement(By.linkText("Videos")).click();
	driver.findElement(By.partialLinkText("house mix - YouTube")).click();
	driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=BSaoV4XpKpXougSBv5zYAg&gws_rd=ssl#q=keetech&tbm=vid");
	driver.close();
}
@Test
public void more()
{
	driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=BSaoV4XpKpXougSBv5zYAg&gws_rd=ssl#q=keetech&tbm=vid");
	driver.findElement(By.xpath(".//*[@id='hdtb-more']")).click();
	driver.findElement(By.linkText("Books")).click();
}
}
