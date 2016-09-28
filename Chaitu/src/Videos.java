import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Videos {
	
	WebDriver driver=GoogleSearchTest.driver;
@Test(groups={"regression"})
public void videos()
{
	

	driver.findElement(By.linkText("Videos")).click();
	//driver.findElement(By.linkText("Ross Kee - tech house mix - YouTube")).click();
	//driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=BSaoV4XpKpXougSBv5zYAg&gws_rd=ssl#q=keetech&tbm=vid");
	//driver.close();
	driver.findElement(By.xpath(".//*[@id='rso']/div/div[3]/div/h3/a")).click();
}
}