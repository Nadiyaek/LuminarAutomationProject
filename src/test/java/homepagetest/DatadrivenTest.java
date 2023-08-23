package homepagetest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.DatadrivenPage;

public class DatadrivenTest {
	WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void openurl()
	{
		driver.get("https://www.sotc.in/flights");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		DatadrivenPage dp=new DatadrivenPage(driver);
		dp.getvalue();
		
	}
}
