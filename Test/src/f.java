import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class f {
WebDriver driver;

@Given("^open browser as \"([^\"]*)\" And enter url as \"([^\"]*)\"$")
public void open_browser_as_And_enter_url_as(String browser, String url) throws Throwable {
	driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    
}

@When("^Enter username as \"([^\"]*)\" And password as \"([^\"]*)\" And click on login button$")
public void enter_username_as_And_password_as_And_click_on_login_button(String username, String password) throws Throwable {
	
	 driver.findElement(By.linkText("Log In")).click();
	  driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
	  driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
	  driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
}

@Then("^successfully  \"([^\"]*)\"$")
public void successfully(String arg1) throws Throwable {
   System.out.println("login successfully");
}


}
