package heb_UtilityPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import heb_Pages.hebHomePage;
import heb_Pages.hebMyAccountPage;
import heb_Pages.hebRegisterPage;
import heb_UnitTestFramework.DriverScripts;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UtilityMethods  extends DriverScripts{

		public static WebDriver driver;
		//public static WebDriver driverNULL = null;
		public static String url;
		public static String email, password, broname;
		public static String datasplit[];
		public static String rfirstname,rlastname,remail,rpassword ;
		static File f;
		static Workbook w;
		public static Sheet s;
		public static int rows, columns,i,j;
		
		//finally done
		public static void actioncall(String action) throws InterruptedException
		{
			switch(action.toLowerCase())
			{
			case "browseropen":
				browserOpen(DriverScripts.testdata);
			break;
			
			case "navigatetourl":
				
				navigatetoURL(DriverScripts.testdata);
			break;
			case "heblogin":
				
				hebHomePage.Heblogin();
			break;
			
			case "hebregistration":
				hebRegisterPage.Hebregistration();
			break;
			
			case "hebmanagecreditcard":
				hebMyAccountPage.HebManageCreditCard();
				break;
			case "hebbilllingaddress":
				hebMyAccountPage.HebbilllingAddress();
				break;
			case "browserclose":
				browserClose();
				break;
			}
		}
		
		public static void testdatasplit()
		{ datasplit=DriverScripts.testdata.split(";;");
		}
		
		public static void browserOpen(String bname)
		{
			switch(bname.toLowerCase())
			{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "./src/heb_browserDrivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			break;

			case "firefox":
				System.setProperty("webdriver.gecko.driver", "./src/heb_browserDrivers/geckodriver.exe");
				driver=new FirefoxDriver();
			break;
		
			}
			
		}
		
		
		public static void browserClose() throws InterruptedException
		{
			Thread.sleep(4000);
			driver.close();
		}
		public static void navigatetoURL(String url)
		{
			driver.get(url);
		}
}
