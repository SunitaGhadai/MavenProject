package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
         //object of driver
	     ChromeDriver browserObject = new ChromeDriver();		
		
        browserObject.get("http://mdbootstrap.com/docs/b4/jquery/tables/scroll/");
        browserObject.manage().window().maximize();
		//Object of javascript executer class
		JavascriptExecutor js = (JavascriptExecutor) browserObject;
		Thread.sleep(2000);
		//how to scroll webpage
		js.executeScript("window.scrollBy(0,3500)");
		//how to scroll vertically (in query selector CSS Selector required)
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\"div[style$='position: relative;overflow: auto;max-height:200px;width: 100%;']\").scrollTop=300");
		//how to scroll vertically (CSS Selector required)
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\"div[style$='position: relative;overflow: auto;width: 100%;']\").scrollLeft=300");
	
	}
	

}

