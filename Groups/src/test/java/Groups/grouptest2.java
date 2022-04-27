package Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grouptest2 {
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
	public void facebookTitleTest()
	{
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
	@Test(priority=2,groups="unitTest")
	public void flogoTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		boolean b=driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]")).isDisplayed();
	Assert.assertTrue(b);
	driver.close();
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
