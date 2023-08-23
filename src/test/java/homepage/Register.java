package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
	WebDriver driver;
	
	By regbtn=By.xpath("//*[@id=\"newUserId\"]/p/a");
	By loginbtn=By.xpath("//*[@id=\"LoginLogoutToggel\"]");

	By titlem=By.xpath("//*[@id=\"regTitle\"]");
	By frstname=By.xpath("//*[@id=\"registerFName\"]");
	By lstname=By.xpath("//*[@id=\"registerLName\"]");
	By emailid1=By.xpath("//*[@id=\"registerEmailId\"]");
	By mobnum=By.xpath("//*[@id=\"registerMobileNo\"]");
	By password1=By.xpath("//*[@id=\"registerPwd\"]");
	By confirmpasswrd=By.xpath("//*[@id=\"registerConfirmPwd\"]");
	By registerclick=By.xpath("//*[@id=\"registerButton\"]");
	By checkbx=By.xpath("//*[@id=\"tandc\"]");
	By privacy=By.xpath("//*[@id=\"registerFormReset\"]/div[7]/p/a");
	
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickbttn()
	 {
		 WebElement wb1=driver.findElement(loginbtn);
		 wb1.click();
		 WebElement wb2=driver.findElement(regbtn);
		 wb2.click();
		 
	 }
	
	public void setvalues_sotc(String fname,String lname,String mailid,String phone,String pass,String conf)
	{	
		WebElement desig=driver.findElement(titlem);
		Select desigelement=new Select(desig);
		desigelement.selectByValue("Mrs");
		
		driver.findElement(frstname).sendKeys(fname);
		driver.findElement(lstname).sendKeys(lname);
		driver.findElement(emailid1).sendKeys(mailid);
		driver.findElement(mobnum).sendKeys(phone);
		driver.findElement(password1).sendKeys(pass);
		WebElement ele=driver.findElement(confirmpasswrd);
		ele.sendKeys(conf);
		ele.sendKeys(Keys.TAB);
		
		WebElement ele1=driver.findElement(checkbx);
		ele1.sendKeys(Keys.TAB);
		
		WebElement ele2=driver.findElement(privacy);
		ele2.sendKeys(Keys.TAB);
		
		WebElement wb3=driver.findElement(registerclick);
		wb3.click();
		
	}
	
	
}
