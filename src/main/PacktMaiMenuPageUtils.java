package main;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PacktMaiMenuPageUtils {
	
	public static void VerifyElementPosition(WebElement element, String position)
	{
		//System.out.println("Verifying title for "+ element.getText());
		System.out.println("Verifying title for "+ element.getCssValue("color"));
		System.out.println("Verifying title for "+ element.getLocation());
		Assert.assertEquals(element.getLocation().toString().equals(position),true);
		
		
	}
	
	public static void VerifyElementColor(WebElement element, String color)
	{
		//System.out.println("Verifying title for "+ element.getText());
		System.out.println("Verifying title for "+ element.getCssValue("color"));
		System.out.println("Verifying title for "+ element.getLocation());
		Assert.assertEquals(element.getCssValue("color").toString().equals(color),true);
		
		
	}

	public static void VerifyNavigation(WebElement element, WebDriver driver, String menu) {
		// TODO Auto-generated method stub
		element.click();
		if (menu.equals("Browse"))
		{
			driver.findElement(By.xpath("//*[normalize-space()='JavaScript']")).click();
		}
		else if (menu.equals("My Library"))
		{
			driver.findElement(By.xpath("//*[normalize-space()='Bookmarks']")).click();
		}
		
		
	}

}
