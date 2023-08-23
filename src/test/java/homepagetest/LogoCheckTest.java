package homepagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.LogoCheckPage;

public class LogoCheckTest {
	WebDriver driver;
	@BeforeTest
	public void launchbrowser()
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
	public void test1()
	{
		LogoCheckPage lp1=new LogoCheckPage(driver);
		lp1.check();
	}
}
