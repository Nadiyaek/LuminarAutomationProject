package homepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatadrivenPage {
	WebDriver driver;
	By subscribe=By.xpath("//*[@id=\"subscriberEmail\"]");
	By clicksub=By.xpath("//*[@id=\"newsletterSubmit\"]");
	
	public DatadrivenPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void getvalue() throws IOException
	{
		File f=new File("D:\\SubscribeIds.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wbi=new XSSFWorkbook(fi);
		XSSFSheet sh=wbi.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("emailid ="+email);
			driver.findElement(subscribe).clear();
			driver.findElement(subscribe).sendKeys(email);
			driver.findElement(clicksub).click();
			
		}
		
	}
}
