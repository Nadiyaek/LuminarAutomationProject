package homepagetest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.Register;

public class RegisterTest {
	WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void openurl()
	{
		driver.get("https://www.sotc.in/flights");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testreg()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Register r=new Register(driver);
		r.clickbttn();
		String pWindow=driver.getWindowHandle();
		driver.switchTo().window(pWindow);
		r.setvalues_sotc("Ram", "VR", "gmxc87@gmail.com", "6543579023", "gangotri@34", "gangotri@34");
		
	}
}
