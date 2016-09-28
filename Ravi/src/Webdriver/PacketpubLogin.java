package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PacketpubLogin {
WebDriver driver;
public PacketpubLogin(WebDriver driver)
{
	this.driver=driver;
}
public void login(String email,String password,String five)
{
	driver.findElement(By.xpath(".//*[@id='account-bar-login-register']/a[1]/div")).click();
	/*try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	//driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.xpath("//form[not(contains(@style,'none'))]//input[@id='email']")).sendKeys(email);;
	driver.findElement(By.xpath("//form[not(contains(@style,'none'))]//input[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//form[not(contains(@style,'none'))]//input[@id='edit-submit-1']")).click();
	driver.findElement(By.id("five-dollar-search-keys")).sendKeys(five);
	driver.findElement(By.id("edit-submit")).click();
}
}
