import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class More {
	
	@Test(groups={"smoke"})
	public void more()
	{
		WebDriver driver=GoogleSearchTest.driver;
		driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=BSaoV4XpKpXougSBv5zYAg&gws_rd=ssl#q=keetech&tbm=vid");
		driver.findElement(By.xpath(".//*[@id='hdtb-more']")).click();
		driver.findElement(By.linkText("Books")).click();
		driver.navigate().to("https://www.google.co.in/search?q=keetech&biw=1366&bih=433&tbm=isch&source=lnms&sa=X&ved=0ahUKEwj1yt2Z57POAhUbTY8KHds6B58Q_AUIBygC");
	}

}
