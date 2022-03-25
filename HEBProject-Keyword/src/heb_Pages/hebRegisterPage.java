package heb_Pages;

import org.openqa.selenium.By;

import heb_UtilityPackage.UtilityMethods;

public class hebRegisterPage extends UtilityMethods{
	
	public static void Hebregistration() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/a/img")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[1]/p")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[1]/p")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[1]/h1")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"register\"]/div[3]/div[1]/h1")).getText());
		System.out.println(driver.findElement(By.className("required-copy")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@for='register-first-name']")).isDisplayed());
		System.out.println(driver.findElement(By.id("register-first-name")).isDisplayed());
		driver.findElement(By.id("register-first-name")).sendKeys("Malar");
		driver.findElement(By.id("register-last-name")).sendKeys("Garry");
		driver.findElement(By.id("register-email")).sendKeys("malarg10@gmail.com");
		driver.findElement(By.id("reg-password")).sendKeys("orange123");
		if(driver.findElement(By.id("reg_newsletter_signup")).isSelected()==true)
		{
			System.out.println("Test case passed!! checkbox is selected");
		}
		else
		{
			System.out.println("unselected");
		}
		driver.findElement(By.xpath("//*[@for='signup_0']")).click();
		driver.findElement(By.id("createaccount-btn")).click();
		driver.findElement(By.id("gotItThanksButton")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h1/text()")).getText()== "Profile Information")
		{
			System.out.println("Registration successfull!! test case passed");
		}
		else
		{
			System.out.println("Registration Failed!!");
		}
		
	}

}
