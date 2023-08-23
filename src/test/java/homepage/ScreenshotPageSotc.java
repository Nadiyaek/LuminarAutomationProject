package homepage;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPageSotc {
	WebDriver driver;
	By title=By.xpath("//*[@id=\"top\"]/div/div/a/img");
	By log=By.xpath("//*[@id=\"LoginLogoutToggel\"]");
	public ScreenshotPageSotc(WebDriver driver)
	{
		this.driver=driver;
	}
	public void testscreenshotele() throws IOException
	{
		WebElement t1=driver.findElement(title);
		File src1=t1.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./SCREENSHOTS//sample.png"));
		
		WebElement t2=driver.findElement(log);
		File src2=t2.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./SCREENSHOTS//samplelog.png"));
	}
	public void testscreenshot() throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("D://ShowOutput.png"));
	}
}
