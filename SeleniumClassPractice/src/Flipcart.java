import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipcart {
WebDriver driver;
@BeforeClass
public void chaitu()
{
	driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@Test
public void flipcartlogin()
{
	driver.findElement(By.linkText("Log In")).click();
	driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7396618327");
	driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("7396618327k");
	driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
// driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("geyser");
	//el.sendKeys("geyser");
	//el.click();
	//driver.findElement(By.xpath(".//*[@id='products']/div/div[3]/div[1]/div/div[2]/div[1]/a")).click();
	//driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/div/div[6]/div/div[3]/div[1]/div/div[2]/div[1]/div[2]/form/input[10]")).click();
	//driver.findElement(By.xpath(".//*[@id='order_summary_panel']/div[2]/table/tbody/tr/td/table/tbody/tr/td[5]/a/span")).click();
	//Alert alert=driver.switchTo().alert();
	//System.out.println("alert");
	//alert.accept();
	
}
@Test
public void search()
{
	driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("geyser");
	driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();
	
	/*driver.findElement(By.xpath(".//*[@id='products']/div/div[3]/div[1]/div/div[2]/div[1]/a")).click();
	driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/div/div[6]/div/div[3]/div[1]/div/div[2]/div[1]/div[2]/form/input[10]")).click();
	driver.findElement(By.xpath(".//*[@id='order_summary_panel']/div[2]/table/tbody/tr/td/table/tbody/tr/td[5]/a/span")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println("alert");
	alert.accept();*/
	
	
}
/*@Test
public void flipcartlogout()
{
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Log Out")).click();
}*/
/*@AfterTest
public void close()
{
	driver.quit();
}*/
/*@Test
public void menu()
{
	driver.findElement(By.xpath(".//*[@id='fk_pers_title']")).click();
	driver.findElement(By.xpath(".//*[@id='tab-0-content']/div/div[1]/div[1]/div/div[3]/div[1]/div[2]/form/input[10]")).click();
	driver.findElement(By.xpath(".//*[@id='order_summary_panel']/div[2]/table/tbody/tr/td/table/tbody/tr/td[5]/a/span")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println("alert");
	alert.accept();
	
}*/
@Test
public void viewall()
{
		driver.findElement(By.xpath(".//*[@id='substores']/div[3]/ul/li/a")).click();
		driver.findElement(By.xpath(".//*[@id='substores']/div[3]/ul/li/ul/li[1]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='products']/div[1]/div[1]/div[3]/div/div[2]/div[1]/a")).click();
		
	
}
}
