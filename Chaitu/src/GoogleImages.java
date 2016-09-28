import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleImages {
	
	@Test(groups={"regression","smoke"})
	public void GoogleImages()
	{
		WebDriver driver=GoogleSearchTest.driver;
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.xpath(".//*[@id='rg_s']/div[1]/a/img")).click();
		driver.navigate().to("https://www.google.co.in/maps/place/Software+Solutions+Private+Limited/@17.4133082,78.4577359,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb97457424f1f3:0x2d722eba0ec7d6e2!8m2!3d17.4133082!4d78.4599246");
	}

}
