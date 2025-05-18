package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Set the path to your Driver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
        //creating object(driver)//launch the browser
        ChromeDriver browserObject = new ChromeDriver();
        //calling get method to pass the website link
        browserObject.get("https://demo.itlearn360.com/");
        //inspect the button to get xpath
        boolean en= browserObject.findElement(By.xpath("//*[@id=\"plans\"]/li[2]/ul/li[4]/a")).isEnabled();
        if (en)
        {
        	System.out.println("The button is enabled");
        }
        			
        else
        {
        	System.out.println("The button is disabled");
        }
	}

}
