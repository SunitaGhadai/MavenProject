package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
			
		  ChromeDriver browserObject = new ChromeDriver();
		  browserObject.get("http://amazon.in");
			
			browserObject.manage().window().maximize();
			browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
					
			File f= ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("C:\\Users\\User\\Downloads\\Sample\\amazonscreenshot.jpg"));
			
			
		}

	}
