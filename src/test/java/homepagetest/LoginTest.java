package homepagetest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.LoginPage;

public class LoginTest {
	WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void open()
	{
		driver.get("https://www.sotc.in/flights");
		driver.manage().window().maximize();
	}
	@Test
	public void logintest()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lo=new LoginPage(driver);
		lo.clicklogin();
		String pWindow=driver.getWindowHandle();
		driver.switchTo().window(pWindow);
		lo.loginsetvalues("abc@gmail.com", "gang@34");
	}
}
