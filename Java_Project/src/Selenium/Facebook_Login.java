package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Set path to your ChromeDriver/which driver and where it is located in the system
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");

        // Create a new ChromeDriver instance/creating object(driver)
        ChromeDriver browserObject = new ChromeDriver();

        // Open Facebook website/object driver/calling methods (anything with dot)
       // driver.get("https://www.Facebook.com");
        
        // Enter email
        //driver.findElement(By.id("email")).sendKeys("sunita.ghadai@facebook.com");

        // Enter password
        //driver.findElement(By.id("pass")).sendKeys("123xxx009");

        // Click login
        //driver.findElement(By.name("login")).click();

        browserObject.get("https://www.facebook.com");
        
        browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        browserObject.findElement(By.id("email")).sendKeys("sunita.ghadai@gmail.com");
        
        WebDriverWait wait= new WebDriverWait(browserObject, Duration.ofSeconds(30));
        
        browserObject.findElement(By.name("login")).click();
        
        browserObject.findElement(By.name("login")).click();
        
        
	}

}
