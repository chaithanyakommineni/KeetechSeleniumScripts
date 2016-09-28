/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flipcart {
	WebDriver driver;
	@Given("^open browser as \"([^\"]*)\" And enter url as \"([^\"]*)\"$")
	public void open_browser_as_And_enter_url_as(String arg1, String arg2) throws Throwable {
		driver=new FirefoxDriver();
		driver.get(arg2);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}
	@When("^Enter username as (\\d+) And password as (\\d+)k And click on login button$")
	public void enter_username_as_And_password_as_k_And_click_on_login_button(String arg1, String arg2) throws Throwable {
		 driver.findElement(By.linkText("Log In")).click();
		  driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(arg1);
		  driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(arg2);
		  driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	}

	

	@Then("^successfully  success$")
	public void successfully_success() throws Throwable {
	    System.out.println("login success");
	}




}
*/