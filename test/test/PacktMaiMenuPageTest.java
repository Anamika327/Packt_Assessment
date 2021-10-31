package test;

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

public class PacktMaiMenuPageTest {
	
	WebDriver driver;
	
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
		WebElement pageTitle = driver.findElement(By.xpath(PacktMaiMenuPageElements.title));
		PacktMaiMenuPageUtils.VerifyElementPosition(pageTitle,PacktMaiMenuPageElements.titlePosition);	
	}
	
	@Test
	public void VerifyTitleColor()
	{	
		WebElement pageTitle = driver.findElement(By.xpath(PacktMaiMenuPageElements.title));
		PacktMaiMenuPageUtils.VerifyElementColor(pageTitle,PacktMaiMenuPageElements.titleColor);	
	}
	
	@Test
	public void VerifyPacktLogoPosition()
	{	
		WebElement pageTitle = driver.findElement(By.xpath(PacktMaiMenuPageElements.logo));
		//System.out.println();
		PacktMaiMenuPageUtils.VerifyElementPosition(pageTitle,PacktMaiMenuPageElements.logoPosition);	
	}
	
	@Test
	public void VerifyPacktLogoColor()
	{	
		WebElement pageTitle = driver.findElement(By.xpath(PacktMaiMenuPageElements.logo));
		//System.out.println();
		PacktMaiMenuPageUtils.VerifyElementColor(pageTitle,PacktMaiMenuPageElements.logoColor);	
	}
	
	@AfterTest(alwaysRun=true)
	public void cleanup()
	{
		driver.quit();
	}

}
