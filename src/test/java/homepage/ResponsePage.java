package homepage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ResponsePage {
	WebDriver driver;
	public ResponsePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void countlinks()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(WebElement arr:li)
		{
			String link=arr.getAttribute("href");
			verify(link);
		}
		
	}
	
	public void verify(String link)
	{
		try
		{
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
				System.out.println("Valid links are---"+link);
			else if(con.getResponseCode()==404)
				System.out.println("Broken links are---"+link);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
