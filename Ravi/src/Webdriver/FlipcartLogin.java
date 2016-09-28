package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipcartLogin {
	WebDriver driver;
	public FlipcartLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void login(String number,String password)
	{
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(number);
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span")).click();
		
	}

	public void logout()
	{
		driver.findElement(By.linkText("My Account")).click();
		//driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[7]/ul/li[10]/a")).click();
		driver.findElement(By.linkText("Log Out")).click();
		
	}
}
