package homepagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homepage.GetTitlePage;

public class GetTitleTest {
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
		public void test()
		{
			GetTitlePage gtp= new GetTitlePage(driver);
			gtp.titleverification();
		}
}
