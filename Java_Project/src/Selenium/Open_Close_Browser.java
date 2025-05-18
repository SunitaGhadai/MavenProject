package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Close_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.amazon.com/");
		browserObject.close();
	}

}
