package heb_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import heb_UtilityPackage.UtilityMethods;

public class hebMyAccountPage extends UtilityMethods{
	
	public static void HebManageCreditCard() throws InterruptedException
	{
		Thread.sleep(10000);
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.id("myStoreSId"))).build().perform();
		driver.findElement(By.id("myStoreSId")).click();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.id("myaccountSId"))).click().build().perform();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.linkText("My Account"))).click().build().perform();
		driver.findElement(By.id("manageCreditcards")).click();
		driver.findElement(By.linkText("Add a New Credit Card")).click();
		driver.findElement(By.id("cardInfoNameOnCard")).sendKeys("Jhonny");
		WebElement cardtype=driver.findElement(By.id("cardInfoCardType"));
		Select cardtypes=new Select(cardtype);
		cardtypes.selectByVisibleText("Visa");
		driver.findElement(By.id("creditCardNumber")).sendKeys("4111111111111111");
		WebElement mm=driver.findElement(By.id("checkout-cc-expiry-month"));
		Select month= new Select(mm);
		month.selectByValue("3");
		WebElement YY=driver.findElement(By.id("checkout-cc-expiry-year"));
		Select year= new Select(YY);
		year.selectByValue("2019");
		driver.findElement(By.id("cc-pswd-field")).sendKeys("254");
	}
	
	public static void HebbilllingAddress() throws InterruptedException
	{
		driver.findElement(By.id("billingAddressFirstName")).sendKeys("Hamrith");
		driver.findElement(By.id("billingAddressLastName")).sendKeys("Ginger");
		driver.findElement(By.id("phoneNumber1")).sendKeys("258");
		driver.findElement(By.id("phoneNumber2")).sendKeys("568");
		driver.findElement(By.id("phoneNumber3")).sendKeys("4587");
		driver.findElement(By.id("billingAddressAddress1")).sendKeys("3 braden street");
		driver.findElement(By.id("billingAddressAddress2")).sendKeys("25 suite 200");
		driver.findElement(By.id("billingAddressCity")).sendKeys("Irving");
		WebElement state= driver.findElement(By.id("stateBox"));
		Select states=new Select(state);
		states.selectByValue("TX");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"billingPostalCode\"]")).sendKeys("75038");
		driver.findElement(By.id("billingAddressEmail1")).sendKeys("jenifer@gmail.com");
		driver.findElement(By.id("billingAddressEmail2")).sendKeys("jenifer@gmail.com");
		driver.findElement(By.id("addCreditCardSubmit")).click();
	}		
	}
	


