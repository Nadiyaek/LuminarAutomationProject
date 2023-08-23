package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoCheckPage {
	WebDriver driver;
	By logo=By.xpath("//*[@id=\"top\"]/div/div/a/img");
	
	public LogoCheckPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void check()
	{
		Boolean b=driver.findElement(logo).isDisplayed();
		if(b)
			System.out.println("Logo is displayed");
		else
			System.out.println("Logo is not displayed");
	}
}
