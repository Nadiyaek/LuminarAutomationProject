package homepagetest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.ResponsePage;

public class CheckResponseCode {
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
	public void testresponse()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ResponsePage rp=new ResponsePage(driver);
		rp.countlinks();
	}
}
