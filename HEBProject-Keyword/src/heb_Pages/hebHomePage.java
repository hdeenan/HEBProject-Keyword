package heb_Pages;

import org.openqa.selenium.By;

import heb_UtilityPackage.UtilityMethods;

public class hebHomePage extends UtilityMethods{
	
	public static String login;
	
	
	public static void Heblogin() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.id("LogIn")).click();
		UtilityMethods.testdatasplit();
		driver.findElement(By.id("login-email")).sendKeys(UtilityMethods.datasplit[0]);
		driver.findElement(By.id("reg-password")).sendKeys(UtilityMethods.datasplit[1]);
		Thread.sleep(10000);		
		driver.findElement(By.xpath("//*[@for='login-email']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[@for='login-password']")).isDisplayed());
		driver.findElement(By.id("login-submit")).click();
	}

}
