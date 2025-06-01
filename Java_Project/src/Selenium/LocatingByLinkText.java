package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByLinkText {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
	   // TODO Auto-generated method stub
		
	   // Set path to your ChromeDriver/which driver and where it is located in the system
       System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");

       ChromeDriver browserObject = new ChromeDriver();
       
       browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       browserObject.get("https://www.google.com/");
       
       WebElement text= browserObject.findElement(By.linkText("Gmail"));
       
       if(text.isDisplayed()){
    	   System.out.println("The text is a link");
       }else{
    	   System.out.println("The text is not a link");
      }
      browserObject.quit();
	}

}
