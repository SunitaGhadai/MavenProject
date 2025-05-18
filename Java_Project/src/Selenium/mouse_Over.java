package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_Over {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");

        //creating object(driver)//launch the browser
         FirefoxDriver browserObject = new FirefoxDriver();
        //opening of amazon with get method
        browserObject.get("https://www.amazon.com/");
        WebElement element=browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/div[2]/a')]"));
        Actions act = new Actions(browserObject);
        act.moveToElement(element).build().perform();


	}

}
