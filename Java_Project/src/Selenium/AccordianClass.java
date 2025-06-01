package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccordianClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
         ChromeDriver browserObject = new ChromeDriver();
	     browserObject.get("https://demoqa.com/accordian");
	     browserObject.manage().window().maximize();
	     Thread.sleep(2000);
	     browserObject.findElement(By.xpath("//*[@id=\"section1Heading\"]")).click();
	     Thread.sleep(2000);
	     browserObject.findElement(By.xpath("//*[@id=\"section2Heading\"]")).click();

	}

}
