package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifmail_Signin_Popuphandling {

	public static void main(String[] args) throws InterruptedException {
			
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");

	        //creating object(driver)//launch the browser
	        ChromeDriver browserObject = new ChromeDriver();

	        //Open rediffmail website/object driver/anything with dot//specifying the URL
	       browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
	       Thread.sleep(2000);
	       browserObject.findElement(By.name("proceed")).click();
	       //switch the curser to the popup window by alert option
	       Thread.sleep(2000);
	       browserObject.switchTo().alert().accept();
	      
	       	       

	}

	 {
		
		
	}

}
