package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PacketRegister {
	WebDriver driver;
	public PacketRegister(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Register(String email,String firstname,String lastname,String pass,String conformpassword)
	{
		driver.findElement(By.xpath(".//*[@id='account-bar-login-register']/a[2]/div")).click();
		driver.findElement(By.id("edit-email-address")).sendKeys(email);
		driver.findElement(By.id("edit-first-name")).sendKeys(firstname);
		driver.findElement(By.id("edit-last-name")).sendKeys(lastname);
		driver.findElement(By.id("edit-pass")).sendKeys(pass);
		driver.findElement(By.id("edit-confirm-password")).sendKeys(conformpassword);
		
		driver.findElement(By.xpath(".//*[@id='account-bar-login-register']/a[2]/div")).click();
		driver.findElement(By.id("edit-register")).click();
	}

}
