package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
		
		ChromeDriver browserObject = new ChromeDriver();
		browserObject.get("https://www.google.com/");
		
		//browserObject.findElement(By.name ("q")).sendKeys("Selenium");
		
		//browserObject.findElement(By.id ("APjFqb")).sendKeys("Selenium Question Answer");
		
		browserObject.findElement(By.xpath ("//*[@id=\"APjFqb\"]")).sendKeys("Selenium Question Answer");		
		
		
		//browserObject.quit();
				

	}

}
