package homepagetest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.ScreenshotPageSotc;

public class ScreenshotTestSotc {
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
		ScreenshotPageSotc s1=new ScreenshotPageSotc(driver);
		s1.testscreenshot();
		s1.testscreenshotele();
	}
}
