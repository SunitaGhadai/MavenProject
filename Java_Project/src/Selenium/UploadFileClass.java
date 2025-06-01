package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
         //object of driver
	     ChromeDriver browserObject = new ChromeDriver();		
		
	     browserObject.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	     browserObject.manage().window().maximize();   
	     
	     browserObject.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[2]")).sendKeys("C:\\Users\\User\\Desktop\\Agile and Jira Presentation.pptx");
	        
	      
	}

}

