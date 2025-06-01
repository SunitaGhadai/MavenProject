package testNG_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginDependencyClass {
	
ChromeDriver browserObject;
	
	@Test(priority=1)
	public void setup() throws InterruptedException
	
	{
		 //tells java the key word which driver and where it is located
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
	      //creation of object of chromedriver
	      browserObject = new ChromeDriver();
	      //Implicity method used to handel synchronization issues and applies globally to all elements
	      browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      //using get method to tell the browser to navigate to the website
	      browserObject.get("https://demo.itlearn360.com/");	
	      Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods="setup")
	public void loginprocess() throws InterruptedException
	
	{
		Thread.sleep(2000);
		WebElement LoginImage = browserObject.findElement(By.id("loginlabel"));
		LoginImage.click();
		WebElement userName = browserObject.findElement(By.id("user_login"));
		userName.sendKeys("Demo12");
		WebElement password = browserObject.findElement(By.name("pwd"));
		password.sendKeys("Test123456$");
		WebElement submit = browserObject.findElement(By.name("wp-submit"));
		submit.click();
		Thread.sleep(2000);
		
	}
	
	@Test(dependsOnMethods="loginprocess")
	public void logoutProcess() throws InterruptedException
	
	{
		Thread.sleep(2000);
		WebElement LogOutImage = browserObject.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/i"));
		LogOutImage.click();
		WebElement LogoutClick = browserObject.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a"));
		LogoutClick.click();
		WebElement password = browserObject.findElement(By.name("pwd"));
		password.sendKeys("Test123456$");
		WebElement submit = browserObject.findElement(By.name("wp-submit"));
		submit.click();
		Thread.sleep(2000);
	

}


}
