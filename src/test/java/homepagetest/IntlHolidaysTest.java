package homepagetest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.IntlHolidays;

public class IntlHolidaysTest {
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
	public void test3()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		IntlHolidays ab=new IntlHolidays(driver);
		ab.intlclick();
		ab.setvalues("Delhi");
	}
}
