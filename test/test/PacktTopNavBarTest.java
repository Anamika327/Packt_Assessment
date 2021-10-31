package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.PacktMaiMenuPageElements;
import main.PacktMaiMenuPageUtils;

public class PacktTopNavBarTest {
	
	WebDriver driver;
	List<WebElement> topMenu = new ArrayList<>();
	Set<String> handles;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","/Users/asingh9/Downloads/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://subscription.packtpub.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test
	public void VerifyTitlePosition()
	{	
		topMenu = driver.findElements(By.xpath("//li[@class='menu__item']"));
		for (WebElement webElement : topMenu) {
			PacktMaiMenuPageUtils.VerifyNavigation(webElement, driver, "Browse");
			//Get all the handles currently available
			String currentHandle= driver.getWindowHandle();
			List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
			//handles=driver.getWindowHandles();
			
			driver.switchTo().window(windowHandles.get(0));
			driver.getTitle();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());

		}
	}
		
	
	@AfterTest(alwaysRun=true)
	public void cleanup()
	{
		driver.quit();
	}

}
