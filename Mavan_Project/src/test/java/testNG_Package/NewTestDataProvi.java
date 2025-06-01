package testNG_Package;


import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTestDataProvi {
	ChromeDriver browserObject;
  @Test(priority=1,dataProvider = "dp")
  public void verify(String user, String password) throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
      //creation of object of chromedriver
      browserObject = new ChromeDriver();
      //Implicity method used to handel synchronization issues and applies globally to all elements
      browserObject.manage().window().maximize();
      browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      //using get method to tell the browser to navigate to the website
      browserObject.get("https://demo.itlearn360.com/");	
      
      Thread.sleep(2000);
		//locate the login button on web page
		WebElement LoginImage = browserObject.findElement(By.id("loginlabel"));
		LoginImage.click();
		//to find the user name input field
		WebElement userName = browserObject.findElement(By.id("user_login"));
		//to enter the value in user name field
		userName.sendKeys(user);
		WebElement pass = browserObject.findElement(By.name("pwd"));
		pass.sendKeys(password);
		WebElement submit = browserObject.findElement(By.name("wp-submit"));
		submit.click();
		Thread.sleep(2000);
  }
  
  @Test(priority=2)
	public void logoutProcess() 	
	{
		
		WebElement LogOutImage = browserObject.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/i"));
		LogOutImage.click();
		WebElement LogoutClick = browserObject.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a"));
		LogoutClick.click();
		
	}


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Demo12", "Test123456$" },
      new Object[] { "Demo12", "Test1234$" },
    };
  }
}
