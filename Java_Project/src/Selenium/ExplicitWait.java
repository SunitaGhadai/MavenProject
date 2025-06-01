package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
			
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://google.com/");
		browserObject.manage().window().maximize();
		
		//In Explicit wait we will use WebDriverWait class. This class object is created and the browserObject and time is initiated 
		WebDriverWait wait= new WebDriverWait(browserObject ,Duration.ofSeconds(30));
		WebElement gmailLink;
		gmailLink =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Gmail')]")));
		gmailLink.click();
		browserObject.quit();

	}

}
