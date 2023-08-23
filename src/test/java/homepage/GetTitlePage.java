package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GetTitlePage {
	WebDriver driver;
	public GetTitlePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void titleverification()
	{
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="Flight Booking | Book Flights Online & Get Best Deals On Air Tickets - SOTC";
		Assert.assertEquals(actual, expected);
		
	}
}
