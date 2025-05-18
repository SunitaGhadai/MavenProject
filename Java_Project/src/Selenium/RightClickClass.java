package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickClass {

	   public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//syntax of right click - Actions actions = new Actions;  
		//WebElement to store the rightclick ,driver find element by strategy or by locator   
		// build and perform both methods will go with the actions		
		// Set the path to your Driver executable
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
        //object of driver
	    ChromeDriver browserObject = new ChromeDriver();
	    browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	    WebElement rightclick=browserObject.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	    //pass the object in the constructor
        Actions actions = new Actions (browserObject);
        Thread.sleep(2000);
        actions.contextClick(rightclick).build().perform();

	}

}
