package testNG_Package;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class GroupLogin {
	
	ChromeDriver browserObject;
	@BeforeClass

public void setup() throws InterruptedException{

		 //tells java the key word which driver and where it is located
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
	      //creation of object of chromedriver
	      browserObject = new ChromeDriver();
	      //Implicity method used to handel synchronization issues and applies globally to all elements
	      browserObject.manage().window().maximize();
	      browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      //using get method to tell the browser to navigate to the website
	      browserObject.get("https://demo.itlearn360.com/");	
	      Thread.sleep(2000);
	}
	
	@Test(priority=1,groups="login")
	public void loginprocess() throws InterruptedException{
	
		//locate the login button on web page
		WebElement loginImage= browserObject.findElement(By.id("loginlabel"));
		loginImage.click();
		String username="Demo12";
		String password ="Test123456$";
		//to find the user name input field
		WebElement user = browserObject.findElement(By.id("user_login"));
		user.sendKeys(username);
		//to enter the value in user name field
		WebElement pass= browserObject.findElement(By.id("user_pass"));
		pass.sendKeys(password);
		
		if(username.equals("Demo12")&& password.equals("Test123456$"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}		
		WebElement sub= browserObject.findElement(By.name("wp-submit"));
		sub.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2,groups="dash")
	public void checkdash()
	{
		String expectedValue="Dashboar";
        String actualValue = browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
		Assert.assertEquals(actualValue,expectedValue );
	}
	@Test(priority=3,groups="Course")
	public void searchCourse()
	{ 
		browserObject.findElement(By.name("search_course")).sendKeys("Html for beginners");
		browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button"));
	}
		
	}
			