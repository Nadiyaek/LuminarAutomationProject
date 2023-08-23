package homepage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFlightPage {
	WebDriver driver;
	By checkone=By.xpath("//*[@id=\"oneWay\"]");
	By fromsrc=By.xpath("//*[@id=\"input-search-from\"]");
	By todest=By.xpath("//*[@id=\"input-search-to\"]");
	By datebx=By.xpath("//*[@id=\"flight-search\"]/div[3]/div[1]");
	By plusbttn=By.xpath("//*[@id=\"form-inline\"]/div[4]/div[1]/div[1]/div/div[1]/div[2]/button[2]");
	By economy=By.xpath("//*[@id=\"travellers_Economy\"]");
	By searchbttn=By.xpath("//*[@id=\"search-button\"]");
	By monthse=By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]");
	By next=By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a");
	By datescal=By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td/a");
	By noofadults=By.xpath("//*[@id=\"travellerDetail\"]");
	By incrementno=By.xpath("//*[@id=\"form-inline\"]/div[4]/div[1]/div[1]/div/div[1]/div[2]/button[2]");
	By clickcls=By.xpath("//*[@id=\"travellers_Economy\"]");
	
	By srcairport=By.linkText("Mumbai, IN - Chhatrapati Shivaji International (BOM)");
	By destairport=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/ul[1]/li[2]/a[1]");
	
	
	public SearchFlightPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvaluessearch(String src,String dest)
	{	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		driver.findElement(checkone).click();
		driver.findElement(fromsrc).sendKeys(src);
		
		WebElement wb=driver.findElement(srcairport);
		wait.until(ExpectedConditions.visibilityOfElementLocated(srcairport));
		wb.click();
		
		/*WebElement wb2=driver.findElement(destairport);
		wait.until(ExpectedConditions.visibilityOfElementLocated(destairport));
		wb2.click();*/
		//driver.findElement(srcairport).click();
		driver.findElement(todest).sendKeys(dest);
		driver.findElement(destairport).click();
		driver.findElement(datebx).click();
		
		while(true)
		{
			WebElement month=driver.findElement(monthse);
			String month1=month.getText();
			if(month1.equals("Aug"))
			{
				break;
			}
			else
				driver.findElement(next).click();
		}
		List<WebElement> alldates=driver.findElements(datescal);
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			if(date.equals("14"))
			{
				dateelement.click();
				//System.out.println("date selected");
			}
		}
		
	}
	public void clicksearchbttn()
	{	
		driver.findElement(noofadults).click();
		driver.findElement(incrementno).click();
		driver.findElement(economy).click();
		driver.findElement(searchbttn).click();
	}
	
}
