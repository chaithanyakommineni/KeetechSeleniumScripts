package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Gmail {
WebDriver driver;
@BeforeTest
public void beforeTest() {
	driver=new FirefoxDriver();
	  driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
}
public void verifyLogin ()
{
	driver.findElement(By.id("Email")).sendKeys("chaithanya061993@gmail.com");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("Passwd")).sendKeys("9492055182k");
	driver.findElement(By.id("signIn")).click();
	
}
   

}
