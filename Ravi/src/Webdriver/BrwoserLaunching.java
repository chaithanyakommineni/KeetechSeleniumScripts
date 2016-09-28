package Webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrwoserLaunching {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver.logfile", "D:\\IEDriverServer.log");
		System.setProperty("webdriver.ie.driver.loglevel","INFO");
		//System.setProperty("webdriver.ie.driver", "D:\\");
		//System.setProperty("webdriver.chrome.driver", "D:\\");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new InternetExplorerDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		//File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File("d:\\"));
		
	}

}
