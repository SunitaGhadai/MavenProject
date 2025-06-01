package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
		
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("https://omayo.blogspot.com/");
		
		String Pw= browserObject.getWindowHandle();
		browserObject.findElement(By.linkText("Open a popup window")).click();
		
		Set<String>windows= browserObject.getWindowHandles();
		
		for (String win: windows)
			
		{
			browserObject.switchTo().window(win);
			
			if(browserObject.getTitle().equals("New Window"))
				
			{
				browserObject.manage().window().maximize();
				Thread.sleep(5000);
				browserObject.close();
			}
			
		}
		

	}

}
