package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By loginbtn=By.xpath("//*[@id=\"LoginLogoutToggel\"]");
	By secondlogin=By.xpath("//*[@id=\"mainLogIn\"]");
	By loginemail=By.xpath("//*[@id=\"loginId\"]");
	By loginpassword=By.id("existloginPass");
	By thirdlogin=By.xpath("//*[@id=\"loginButton\"]");
	By checkpass=By.xpath("//*[@id=\"tc_login_pass\"]");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clicklogin()
	{
		WebElement wb1=driver.findElement(loginbtn);
		wb1.click();
		WebElement wbsec=driver.findElement(secondlogin);
		wbsec.click();
	}
	public void loginsetvalues(String lmail,String lpass)
	{
		driver.findElement(loginemail).sendKeys(lmail);
		driver.findElement(checkpass).click();
		driver.findElement(loginpassword).sendKeys(lpass);
		WebElement wb4=driver.findElement(thirdlogin);
		wb4.click();
	}
}
