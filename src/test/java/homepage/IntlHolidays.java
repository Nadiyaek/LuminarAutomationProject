package homepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntlHolidays {
	WebDriver driver;
	By intl=By.xpath("//*[@id=\"international-holidays\"]/a");
	By cust=By.xpath("//*[@id=\"international-holidays\"]/ul/div[1]/li[3]/ul/li[5]/a");
	
	By destinationfield=By.xpath("//*[@id=\"holidayPlace\"]");
	By drpbudget=By.xpath("//*[@id=\"srpContent\"]/div[3]/div/div/div[1]/div[1]/form/div[1]/div[2]/div/div[2]");
	By bdgetrate=By.xpath("//*[@id=\"srpContent\"]/div[3]/div/div/div[1]/div[1]/form/div[1]/div[2]/div/div[3]/div/ul/li[3]");
	
	By monthoftravel=By.xpath("//*[@id=\"srpContent\"]/div[3]/div/div/div[1]/div[1]/form/div[1]/div[3]/div/div[2]/p");
	By actualmonth=By.xpath("//*[@id=\"srpContent\"]/div[3]/div/div/div[1]/div[1]/form/div[1]/div[3]/div/div[3]/div/ul/ul[2]/li[3]");
	By clicksearch=By.xpath("//*[@id=\"search-button\"]");
	public IntlHolidays(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void intlclick()
	{
		driver.findElement(intl).click();
		driver.findElement(cust).click();
	}
	
	public void setvalues(String destin)
	{
		driver.findElement(destinationfield).sendKeys(destin);
		
		//driver.findElement(drpbudget).click();
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(drpbudget)).click().perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(bdgetrate)).click();
		
		Actions action2=new Actions(driver);
		action2.moveToElement(driver.findElement(monthoftravel)).click().perform();
		
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(actualmonth)).click();
		
		/*WebElement wbe=driver.findElement(drpbudget);
		Select selebdgt=new Select(wbe);
		selebdgt.selectByIndex(budgetindex);
		
		driver.findElement(monthoftravel).click();
		WebElement wbe2=driver.findElement(actualmonth);
		Select month3=new Select(wbe2);
		month3.selectByIndex(monthindex);*/
		
		driver.findElement(clicksearch).click();
		
	}
}
