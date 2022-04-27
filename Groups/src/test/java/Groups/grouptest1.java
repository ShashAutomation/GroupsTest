package Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grouptest1 {
	WebDriver driver;
	@BeforeMethod
	public void chromeLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
	}
	@Test(priority=1)
	public void googleTitleTest()
	{
		System.out.println(driver.getTitle());
	}
	@Test(priority=2,groups="unitTest")
	public void glogoTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		boolean b=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	Assert.assertTrue(b);
	driver.close();
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
